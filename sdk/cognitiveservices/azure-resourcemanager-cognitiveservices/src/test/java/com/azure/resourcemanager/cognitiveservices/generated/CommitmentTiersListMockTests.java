// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentTier;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CommitmentTiersListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"kind\":\"tvsexsowuel\",\"skuName\":\"hhahhxvrhmzkwpjg\",\"hostingModel\":\"ConnectedContainer\",\"planType\":\"ughftqsx\",\"tier\":\"xujxuknd\",\"maxCount\":723225967,\"quota\":{\"quantity\":8116661577265939603,\"unit\":\"ufzdmsyq\"},\"cost\":{\"commitmentMeterId\":\"hwhbotzingamv\",\"overageMeterId\":\"ho\"}}]}";

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

        CognitiveServicesManager manager =
            CognitiveServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CommitmentTier> response = manager.commitmentTiers().list("jnalghf", Context.NONE);

        Assertions.assertEquals("tvsexsowuel", response.iterator().next().kind());
        Assertions.assertEquals("hhahhxvrhmzkwpjg", response.iterator().next().skuName());
        Assertions.assertEquals(HostingModel.CONNECTED_CONTAINER, response.iterator().next().hostingModel());
        Assertions.assertEquals("ughftqsx", response.iterator().next().planType());
        Assertions.assertEquals("xujxuknd", response.iterator().next().tier());
        Assertions.assertEquals(723225967, response.iterator().next().maxCount());
        Assertions.assertEquals(8116661577265939603L, response.iterator().next().quota().quantity());
        Assertions.assertEquals("ufzdmsyq", response.iterator().next().quota().unit());
        Assertions.assertEquals("hwhbotzingamv", response.iterator().next().cost().commitmentMeterId());
        Assertions.assertEquals("ho", response.iterator().next().cost().overageMeterId());
    }
}