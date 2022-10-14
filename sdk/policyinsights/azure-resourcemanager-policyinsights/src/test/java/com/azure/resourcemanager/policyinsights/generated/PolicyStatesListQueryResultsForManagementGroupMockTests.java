// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.PolicyState;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PolicyStatesListQueryResultsForManagementGroupMockTests {
    @Test
    public void testListQueryResultsForManagementGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"@odata.id\":\"ex\",\"@odata.context\":\"mfxapjwogqqno\",\"timestamp\":\"2021-04-07T17:43:19Z\",\"resourceId\":\"cdabtqwpwya\",\"policyAssignmentId\":\"zasqbucljgkyexao\",\"policyDefinitionId\":\"yaipidsda\",\"effectiveParameters\":\"tx\",\"isCompliant\":true,\"subscriptionId\":\"mfqwa\",\"resourceType\":\"nqnm\",\"resourceLocation\":\"ngz\",\"resourceGroup\":\"qxtbjwgnyf\",\"resourceTags\":\"fzsvtuikzh\",\"policyAssignmentName\":\"qglcfhmlrqryxynq\",\"policyAssignmentOwner\":\"rd\",\"policyAssignmentParameters\":\"ovw\",\"policyAssignmentScope\":\"nptgoeiybba\",\"policyDefinitionName\":\"fhvfsl\",\"policyDefinitionAction\":\"ntjlr\",\"policyDefinitionCategory\":\"jkskyr\",\"policySetDefinitionId\":\"ovzidsx\",\"policySetDefinitionName\":\"abzmifrygznmmaxr\",\"policySetDefinitionOwner\":\"kzobgopxlhsln\",\"policySetDefinitionCategory\":\"xieixynllxec\",\"policySetDefinitionParameters\":\"rojphslhcawjutif\",\"managementGroupIds\":\"fmvigorqjbttzh\",\"policyDefinitionReferenceId\":\"glka\",\"complianceState\":\"onqjujeickpzvcpo\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[],\"ifNotExistsDetails\":{\"resourceId\":\"wcltyjede\",\"totalResources\":1626288503}},\"policyDefinitionGroupNames\":[\"mkqscaz\"],\"components\":[{\"id\":\"tzxpuamwabzxrv\",\"type\":\"ushsp\",\"name\":\"ivmxyasfl\",\"timestamp\":\"2021-09-18T11:57:58Z\",\"complianceState\":\"zwywako\",\"\":{}},{\"id\":\"smjblmljhlnym\",\"type\":\"tqyryuzcbmqqv\",\"name\":\"vwf\",\"timestamp\":\"2021-09-15T05:34:37Z\",\"complianceState\":\"xo\",\"\":{}},{\"id\":\"e\",\"type\":\"lzqnhcvs\",\"name\":\"tnzoibgsxgnxfy\",\"timestamp\":\"2021-03-20T13:56:14Z\",\"complianceState\":\"p\",\"\":{}}],\"policyDefinitionVersion\":\"dofdbxiqx\",\"policySetDefinitionVersion\":\"iqbi\",\"policyAssignmentVersion\":\"tmwwi\",\"\":{}}]}";

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

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PolicyState> response =
            manager
                .policyStates()
                .listQueryResultsForManagementGroup(
                    PolicyStatesResource.LATEST,
                    "zejnhl",
                    988416731,
                    "pbzpcpiljhahz",
                    "echndbnwieholew",
                    OffsetDateTime.parse("2021-08-19T12:42:57Z"),
                    OffsetDateTime.parse("2021-04-16T07:06:36Z"),
                    "uubw",
                    "fqsfa",
                    "aqtferr",
                    Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-04-07T17:43:19Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("cdabtqwpwya", response.iterator().next().resourceId());
        Assertions.assertEquals("zasqbucljgkyexao", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("yaipidsda", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("tx", response.iterator().next().effectiveParameters());
        Assertions.assertEquals(true, response.iterator().next().isCompliant());
        Assertions.assertEquals("mfqwa", response.iterator().next().subscriptionId());
        Assertions.assertEquals("nqnm", response.iterator().next().resourceType());
        Assertions.assertEquals("ngz", response.iterator().next().resourceLocation());
        Assertions.assertEquals("qxtbjwgnyf", response.iterator().next().resourceGroup());
        Assertions.assertEquals("fzsvtuikzh", response.iterator().next().resourceTags());
        Assertions.assertEquals("qglcfhmlrqryxynq", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("rd", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("ovw", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("nptgoeiybba", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("fhvfsl", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("ntjlr", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("jkskyr", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("ovzidsx", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("abzmifrygznmmaxr", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("kzobgopxlhsln", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("xieixynllxec", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("rojphslhcawjutif", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("fmvigorqjbttzh", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("glka", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("onqjujeickpzvcpo", response.iterator().next().complianceState());
        Assertions
            .assertEquals(
                "wcltyjede", response.iterator().next().policyEvaluationDetails().ifNotExistsDetails().resourceId());
        Assertions
            .assertEquals(
                1626288503, response.iterator().next().policyEvaluationDetails().ifNotExistsDetails().totalResources());
        Assertions.assertEquals("mkqscaz", response.iterator().next().policyDefinitionGroupNames().get(0));
        Assertions.assertEquals("tzxpuamwabzxrv", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("ushsp", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("ivmxyasfl", response.iterator().next().components().get(0).name());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-18T11:57:58Z"),
                response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("zwywako", response.iterator().next().components().get(0).complianceState());
    }
}
