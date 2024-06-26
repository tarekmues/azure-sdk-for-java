// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedPrivateEndpointResourceInner;
import com.azure.resourcemanager.datafactory.models.ConnectionStateProperties;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoint;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpointListResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"connectionState\":{\"actionsRequired\":\"itlhguyn\",\"description\":\"hlgmltxdwhmoz\",\"status\":\"gzvlnsnn\"},\"fqdns\":[\"pafolp\",\"mwamxqzragpgdph\",\"vdulajv\",\"ejchcsrlz\"],\"groupId\":\"mzlanru\",\"isReserved\":false,\"privateLinkResourceId\":\"nphcnzqtpjhmqrh\",\"provisioningState\":\"hlaiwd\",\"\":{\"hqvlnnpxybafiqg\":\"datamlzzhzdtxetlgyd\",\"klbyulidwcw\":\"dataaarbgjekg\",\"hj\":\"datamzegjon\",\"zhzmtksjci\":\"datarwgdnqzbrfks\"}},\"name\":\"igsxcdgljplk\",\"type\":\"acht\",\"etag\":\"flrytswfpfm\",\"id\":\"ycxnmskw\"}],\"nextLink\":\"jjyslurlps\"}")
            .toObject(ManagedPrivateEndpointListResponse.class);
        Assertions.assertEquals("ycxnmskw", model.value().get(0).id());
        Assertions.assertEquals("pafolp", model.value().get(0).properties().fqdns().get(0));
        Assertions.assertEquals("mzlanru", model.value().get(0).properties().groupId());
        Assertions.assertEquals("nphcnzqtpjhmqrh", model.value().get(0).properties().privateLinkResourceId());
        Assertions.assertEquals("jjyslurlps", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointListResponse model = new ManagedPrivateEndpointListResponse()
            .withValue(Arrays.asList(new ManagedPrivateEndpointResourceInner().withId("ycxnmskw")
                .withProperties(new ManagedPrivateEndpoint().withConnectionState(new ConnectionStateProperties())
                    .withFqdns(Arrays.asList("pafolp", "mwamxqzragpgdph", "vdulajv", "ejchcsrlz"))
                    .withGroupId("mzlanru")
                    .withPrivateLinkResourceId("nphcnzqtpjhmqrh")
                    .withAdditionalProperties(mapOf("isReserved", false, "provisioningState", "hlaiwd")))))
            .withNextLink("jjyslurlps");
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointListResponse.class);
        Assertions.assertEquals("ycxnmskw", model.value().get(0).id());
        Assertions.assertEquals("pafolp", model.value().get(0).properties().fqdns().get(0));
        Assertions.assertEquals("mzlanru", model.value().get(0).properties().groupId());
        Assertions.assertEquals("nphcnzqtpjhmqrh", model.value().get(0).properties().privateLinkResourceId());
        Assertions.assertEquals("jjyslurlps", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
