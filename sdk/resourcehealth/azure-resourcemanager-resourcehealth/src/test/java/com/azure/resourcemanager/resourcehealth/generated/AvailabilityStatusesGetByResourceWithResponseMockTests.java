// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcehealth.ResourceHealthManager;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStateValues;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatus;
import com.azure.resourcemanager.resourcehealth.models.ReasonChronicityTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AvailabilityStatusesGetByResourceWithResponseMockTests {
    @Test
    public void testGetByResourceWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"cbonqvpk\",\"name\":\"rxnjeaseipheofl\",\"type\":\"eyy\",\"location\":\"nj\",\"properties\":{\"availabilityState\":\"Degraded\",\"title\":\"grhpdjpju\",\"summary\":\"sxazjpq\",\"detailedStatus\":\"gual\",\"reasonType\":\"xxhejjzzvd\",\"rootCauseAttributionTime\":\"2021-03-06T13:07:05Z\",\"healthEventType\":\"dslfhotwmcy\",\"healthEventCause\":\"wlbjnpgacftade\",\"healthEventCategory\":\"nltyfsoppusuesnz\",\"healthEventId\":\"ej\",\"resolutionETA\":\"2021-07-08T00:18:36Z\",\"occuredTime\":\"2021-04-30T04:35:54Z\",\"reasonChronicity\":\"Persistent\",\"reportedTime\":\"2021-03-31T13:31:51Z\",\"recentlyResolved\":{\"unavailableOccuredTime\":\"2021-07-20T12:25:55Z\",\"resolvedTime\":\"2021-07-18T19:44:05Z\",\"unavailableSummary\":\"vudwx\"},\"recommendedActions\":[],\"serviceImpactingEvents\":[]}}";

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

        ResourceHealthManager manager =
            ResourceHealthManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AvailabilityStatus response =
            manager
                .availabilityStatuses()
                .getByResourceWithResponse("al", "nwsubisnj", "mpmngnzscxaqwoo", Context.NONE)
                .getValue();

        Assertions.assertEquals("cbonqvpk", response.id());
        Assertions.assertEquals("rxnjeaseipheofl", response.name());
        Assertions.assertEquals("eyy", response.type());
        Assertions.assertEquals("nj", response.location());
        Assertions.assertEquals(AvailabilityStateValues.DEGRADED, response.properties().availabilityState());
        Assertions.assertEquals("grhpdjpju", response.properties().title());
        Assertions.assertEquals("sxazjpq", response.properties().summary());
        Assertions.assertEquals("gual", response.properties().detailedStatus());
        Assertions.assertEquals("xxhejjzzvd", response.properties().reasonType());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-06T13:07:05Z"), response.properties().rootCauseAttributionTime());
        Assertions.assertEquals("dslfhotwmcy", response.properties().healthEventType());
        Assertions.assertEquals("wlbjnpgacftade", response.properties().healthEventCause());
        Assertions.assertEquals("nltyfsoppusuesnz", response.properties().healthEventCategory());
        Assertions.assertEquals("ej", response.properties().healthEventId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-08T00:18:36Z"), response.properties().resolutionEta());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-30T04:35:54Z"), response.properties().occuredTime());
        Assertions.assertEquals(ReasonChronicityTypes.PERSISTENT, response.properties().reasonChronicity());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-31T13:31:51Z"), response.properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-20T12:25:55Z"),
                response.properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-18T19:44:05Z"), response.properties().recentlyResolved().resolvedTime());
        Assertions.assertEquals("vudwx", response.properties().recentlyResolved().unavailableSummary());
    }
}