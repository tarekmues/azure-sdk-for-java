// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.test.annotation.DoNotRecord;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.core.util.Context;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.webpubsub.models.GetClientAccessTokenOptions;
import com.azure.messaging.webpubsub.models.WebPubSubClientAccessToken;
import com.azure.messaging.webpubsub.models.WebPubSubPermission;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WebPubSubServiceClientTests extends TestBase {

    private static final String DEFAULT_CONNECTION_STRING =
        "Endpoint=https://example.com;AccessKey=dummykey;Version=1.0;";
    private static final String CONNECTION_STRING = Configuration.getGlobalConfiguration()
        .get("WEB_PUB_SUB_CS", DEFAULT_CONNECTION_STRING);
    private static final String ENDPOINT = Configuration.getGlobalConfiguration()
            .get("WEB_PUB_SUB_ENDPOINT", "https://srnagar-wps-pubsub.webpubsub.azure.com");

    private WebPubSubServiceClient client;
    private WebPubSubServiceAsyncClient asyncClient;

    @BeforeEach
    public void setup() {
        WebPubSubServiceClientBuilder webPubSubServiceClientBuilder = new WebPubSubServiceClientBuilder()
            .connectionString(CONNECTION_STRING)
            .httpClient(HttpClient.createDefault())
            .hub("test");

        if (getTestMode() == TestMode.PLAYBACK) {
            webPubSubServiceClientBuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            webPubSubServiceClientBuilder.addPolicy(interceptorManager.getRecordPolicy());
        }

        this.client = webPubSubServiceClientBuilder
            .buildClient();

        this.asyncClient = webPubSubServiceClientBuilder
            .buildAsyncClient();
    }

    private void assertResponse(Response<?> response, int expectedCode) {
        assertNotNull(response);
        assertEquals(expectedCode, response.getStatusCode());
    }

    /*****************************************************************************************************************
     * Sync Tests - WebPubSubServiceClient
     ****************************************************************************************************************/

    @Test
    public void assertClientNotNull() {
        assertNotNull(client);
    }

    @Test
    public void testBroadcastString() {
        assertResponse(client.sendToAllWithResponse(
                BinaryData.fromString("Hello World - Broadcast test!"),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "text/plain")),
                Context.NONE), 202);
    }

    @Test
    public void testBroadcastBytes() {
        byte[] bytes = "Hello World - Broadcast test!".getBytes();
        assertResponse(client.sendToAllWithResponse(
                BinaryData.fromBytes(bytes),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "application/octet-stream")),
                Context.NONE), 202);
    }

    @Test
    public void testSendToUserString() {
        assertResponse(client.sendToUserWithResponse("test_user",
                BinaryData.fromString("Hello World!"),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "text/plain")),
                Context.NONE), 202);
    }

    @Test
    public void testSendToUserBytes() {
        assertResponse(client.sendToUserWithResponse("test_user",
                BinaryData.fromBytes("Hello World!".getBytes(StandardCharsets.UTF_8)),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "application/octet-stream")),
                Context.NONE), 202);
    }

    @Test
    public void testSendToConnectionString() {
        assertResponse(client.sendToConnectionWithResponse("test_connection",
                BinaryData.fromString("Hello World!"),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "text/plain")),
                Context.NONE), 202);
    }

    @Test
    public void testSendToConnectionBytes() {
        assertResponse(client.sendToConnectionWithResponse("test_connection",
                BinaryData.fromBytes("Hello World!".getBytes(StandardCharsets.UTF_8)),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "application/octet-stream")),
                Context.NONE), 202);
    }

    @Test
    public void testSendToConnectionJson() {
        assertResponse(client.sendToConnectionWithResponse("test_connection",
                BinaryData.fromString("{\"data\": true}"),
                new RequestOptions()
                        .addRequestCallback(request -> request.getHeaders().set("Content-Type", "application/json")),
                Context.NONE), 202);
    }

    @Test
    public void testSendToAllJson() {
        RequestOptions requestOptions = new RequestOptions().addRequestCallback(request -> request.getHeaders().set(
                "Content-Type", "application/json"));

        assertResponse(client.sendToAllWithResponse(BinaryData.fromString("{\"boolvalue\": true}"),
                requestOptions,
                Context.NONE), 202);
        assertResponse(client.sendToAllWithResponse(BinaryData.fromString("{\"stringvalue\": \"testingwebpubsub\"}"),
                requestOptions,
                Context.NONE), 202);

        assertResponse(client.sendToAllWithResponse(BinaryData.fromString("{\"intvalue\": 25}"),
                requestOptions,
                Context.NONE), 202);

        assertResponse(client.sendToAllWithResponse(BinaryData.fromString("{\"floatvalue\": 55.4}"),
                requestOptions,
                Context.NONE), 202);
    }

    @Test
    public void testRemoveNonExistentUserFromHub() {
        // TODO (jogiles) can we determine if this user exists anywhere in the current hub?
        Response<Void> removeUserResponse =
            client.removeUserFromAllGroupsWithResponse("testRemoveNonExistentUserFromHub", new RequestOptions(),
                    Context.NONE);
        assertEquals(200, removeUserResponse.getStatusCode());
    }

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void testGetAuthenticationToken() throws ParseException {
        WebPubSubClientAccessToken token = client.getClientAccessToken(new GetClientAccessTokenOptions());
        Assertions.assertNotNull(token);
        Assertions.assertNotNull(token.getToken());
        Assertions.assertNotNull(token.getUrl());

        Assertions.assertTrue(token.getUrl().startsWith("wss://"));
        Assertions.assertTrue(token.getUrl().contains(".webpubsub.azure.com/client/hubs/"));

        String authToken = token.getToken();
        JWT jwt = JWTParser.parse(authToken);
        JWTClaimsSet claimsSet = jwt.getJWTClaimsSet();
        Assertions.assertNotNull(claimsSet);
        Assertions.assertNotNull(claimsSet.getAudience());
        Assertions.assertFalse(claimsSet.getAudience().isEmpty());

        String aud = claimsSet.getAudience().iterator().next();
        Assertions.assertTrue(aud.contains(".webpubsub.azure.com/client/hubs/"));
    }

    /*****************************************************************************************************************
     * Sync Tests - WebPubSubGroup
     ****************************************************************************************************************/

    @Test
    public void testRemoveNonExistentUserFromGroup() {
        assertResponse(client.removeUserFromGroupWithResponse("java",
                "testRemoveNonExistentUserFromGroup", new RequestOptions(), Context.NONE), 200);
    }

    @Test
    public void testSendMessageToGroup() {
        assertResponse(client.sendToGroupWithResponse("java",
                BinaryData.fromString("Hello World!"),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "text/plain")), Context.NONE), 202);
    }

    @Test
    public void testAadCredential() {
        WebPubSubServiceClientBuilder webPubSubServiceClientBuilder = new WebPubSubServiceClientBuilder()
                .endpoint(ENDPOINT)
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .hub("test");

        if (getTestMode() == TestMode.PLAYBACK) {
            webPubSubServiceClientBuilder.httpClient(interceptorManager.getPlaybackClient())
                    .connectionString(CONNECTION_STRING);
        } else if (getTestMode() == TestMode.RECORD) {
            webPubSubServiceClientBuilder.addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            webPubSubServiceClientBuilder.credential(new DefaultAzureCredentialBuilder().build());
        }

        this.client = webPubSubServiceClientBuilder.buildClient();

        assertResponse(client.sendToUserWithResponse("test_user",
                BinaryData.fromString("Hello World!"),
                new RequestOptions().addRequestCallback(request -> request.getHeaders()
                        .set("Content-Type", "text/plain")),
                Context.NONE), 202);
    }

    @Test
    public void testCheckPermission() {
        RequestOptions requestOptions = new RequestOptions()
            .addQueryParam("targetName", "group_name")
            .setThrowOnError(false);
        boolean permission = client.checkPermissionWithResponse(WebPubSubPermission.JOIN_LEAVE_GROUP, "connection_id",
            requestOptions, Context.NONE).getValue();
        Assertions.assertFalse(permission);
    }
}
