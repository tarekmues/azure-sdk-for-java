// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkVirtualMachineInner;
import com.azure.resourcemanager.avs.models.WorkloadNetworkVirtualMachinesList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkVirtualMachinesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkVirtualMachinesList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"fcluyov\",\"vmType\":\"EDGE\"},\"id\":\"kfezzxscyhwz\",\"name\":\"g\",\"type\":\"rujbzbomvzzbtdc\"},{\"properties\":{\"provisioningState\":\"Failed\",\"displayName\":\"yujviylwdshfssn\",\"vmType\":\"EDGE\"},\"id\":\"efr\",\"name\":\"msgaoj\",\"type\":\"mwn\"}],\"nextLink\":\"tmr\"}")
            .toObject(WorkloadNetworkVirtualMachinesList.class);
        Assertions.assertEquals("fcluyov", model.value().get(0).displayName());
        Assertions.assertEquals("tmr", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkVirtualMachinesList model = new WorkloadNetworkVirtualMachinesList()
            .withValue(Arrays.asList(new WorkloadNetworkVirtualMachineInner().withDisplayName("fcluyov"),
                new WorkloadNetworkVirtualMachineInner().withDisplayName("yujviylwdshfssn")))
            .withNextLink("tmr");
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkVirtualMachinesList.class);
        Assertions.assertEquals("fcluyov", model.value().get(0).displayName());
        Assertions.assertEquals("tmr", model.nextLink());
    }
}
