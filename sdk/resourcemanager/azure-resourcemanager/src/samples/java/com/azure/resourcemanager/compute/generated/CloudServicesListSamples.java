// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for CloudServices List. */
public final class CloudServicesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-04-04/CloudServiceRP/examples/CloudService_List_BySubscription.json
     */
    /**
     * Sample code: List Cloud Services in a Subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCloudServicesInASubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getCloudServices().list(Context.NONE);
    }
}
