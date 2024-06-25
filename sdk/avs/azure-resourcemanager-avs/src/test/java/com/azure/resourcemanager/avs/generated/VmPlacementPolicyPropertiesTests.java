// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.AffinityType;
import com.azure.resourcemanager.avs.models.PlacementPolicyState;
import com.azure.resourcemanager.avs.models.VmPlacementPolicyProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VmPlacementPolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmPlacementPolicyProperties model = BinaryData.fromString(
            "{\"type\":\"VmVm\",\"vmMembers\":[\"zov\",\"jjziuxxpsh\"],\"affinityType\":\"AntiAffinity\",\"state\":\"Enabled\",\"displayName\":\"lfg\",\"provisioningState\":\"Failed\"}")
            .toObject(VmPlacementPolicyProperties.class);
        Assertions.assertEquals(PlacementPolicyState.ENABLED, model.state());
        Assertions.assertEquals("lfg", model.displayName());
        Assertions.assertEquals("zov", model.vmMembers().get(0));
        Assertions.assertEquals(AffinityType.ANTI_AFFINITY, model.affinityType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmPlacementPolicyProperties model = new VmPlacementPolicyProperties().withState(PlacementPolicyState.ENABLED)
            .withDisplayName("lfg")
            .withVmMembers(Arrays.asList("zov", "jjziuxxpsh"))
            .withAffinityType(AffinityType.ANTI_AFFINITY);
        model = BinaryData.fromObject(model).toObject(VmPlacementPolicyProperties.class);
        Assertions.assertEquals(PlacementPolicyState.ENABLED, model.state());
        Assertions.assertEquals("lfg", model.displayName());
        Assertions.assertEquals("zov", model.vmMembers().get(0));
        Assertions.assertEquals(AffinityType.ANTI_AFFINITY, model.affinityType());
    }
}
