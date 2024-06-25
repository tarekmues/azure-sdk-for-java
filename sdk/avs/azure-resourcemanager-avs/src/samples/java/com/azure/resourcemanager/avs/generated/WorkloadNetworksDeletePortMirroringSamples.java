// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for WorkloadNetworks DeletePortMirroring.
 */
public final class WorkloadNetworksDeletePortMirroringSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2023-09-01/examples/
     * WorkloadNetworks_DeletePortMirroring.json
     */
    /**
     * Sample code: WorkloadNetworks_DeletePortMirroring.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksDeletePortMirroring(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks()
            .deletePortMirroring("group1", "portMirroring1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
