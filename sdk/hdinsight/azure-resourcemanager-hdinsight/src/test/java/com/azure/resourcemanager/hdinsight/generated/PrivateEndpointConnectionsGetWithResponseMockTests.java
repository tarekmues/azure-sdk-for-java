// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.models.PrivateEndpointConnection;
import com.azure.resourcemanager.hdinsight.models.PrivateLinkServiceConnectionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"privateEndpoint\":{\"id\":\"bpdqmjxlyy\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"gouwtlmj\",\"actionsRequired\":\"uojqt\"},\"linkIdentifier\":\"axkjeytunlbfjk\",\"provisioningState\":\"Updating\"},\"id\":\"nkqbhsyrq\",\"name\":\"njqhdenxa\",\"type\":\"l\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        HDInsightManager manager =
            HDInsightManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response =
            manager
                .privateEndpointConnections()
                .getWithResponse("nnbsoqeqa", "arvlagunbt", "febwlnbmhyreeudz", Context.NONE)
                .getValue();

        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.REJECTED, response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("gouwtlmj", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("uojqt", response.privateLinkServiceConnectionState().actionsRequired());
    }
}