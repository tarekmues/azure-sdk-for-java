// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

/**
 * Samples for DisasterRecoveryConfigs List.
 */
public final class DisasterRecoveryConfigsListSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/disasterRecoveryConfigs/
     * EHAliasList.json
     */
    /**
     * Sample code: EHAliasList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void eHAliasList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getDisasterRecoveryConfigs()
            .list("exampleResourceGroup", "sdk-Namespace-8859", com.azure.core.util.Context.NONE);
    }
}
