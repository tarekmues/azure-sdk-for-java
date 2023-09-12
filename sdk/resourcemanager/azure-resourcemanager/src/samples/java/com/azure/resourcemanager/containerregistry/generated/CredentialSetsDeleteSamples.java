// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for CredentialSets Delete. */
public final class CredentialSetsDeleteSamples {
    /*
     * x-ms-original-file: mgmt_containerregistry_add_readonly/specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/CredentialSetDelete.json
     */
    /**
     * Sample code: CredentialSetDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void credentialSetDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getCredentialSets()
            .delete("myResourceGroup", "myRegistry", "myCredentialSet", com.azure.core.util.Context.NONE);
    }
}
