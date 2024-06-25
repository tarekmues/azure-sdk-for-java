// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import java.util.Arrays;

/**
 * Samples for WorkloadNetworks CreateDnsZone.
 */
public final class WorkloadNetworksCreateDnsZoneSamples {
    /*
     * x-ms-original-file:
     * specification/vmware/resource-manager/Microsoft.AVS/stable/2023-09-01/examples/WorkloadNetworks_CreateDnsZone.
     * json
     */
    /**
     * Sample code: WorkloadNetworks_CreateDnsZone.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksCreateDnsZone(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks()
            .defineDnsZone("dnsZone1")
            .withExistingPrivateCloud("group1", "cloud1")
            .withDisplayName("dnsZone1")
            .withDomain(Arrays.asList())
            .withDnsServerIps(Arrays.asList("1.1.1.1"))
            .withSourceIp("8.8.8.8")
            .withRevision(1L)
            .create();
    }
}
