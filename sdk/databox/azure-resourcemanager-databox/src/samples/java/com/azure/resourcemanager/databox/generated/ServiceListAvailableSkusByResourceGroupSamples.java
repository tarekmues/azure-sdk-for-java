// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.resourcemanager.databox.models.AvailableSkuRequest;
import com.azure.resourcemanager.databox.models.TransferType;

/** Samples for Service ListAvailableSkusByResourceGroup. */
public final class ServiceListAvailableSkusByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/AvailableSkusPost.json
     */
    /**
     * Sample code: AvailableSkusPost.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void availableSkusPost(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .services()
            .listAvailableSkusByResourceGroup(
                "bvttoolrg6",
                "westus",
                new AvailableSkuRequest()
                    .withTransferType(TransferType.IMPORT_TO_AZURE)
                    .withCountry("US")
                    .withLocation("westus"),
                com.azure.core.util.Context.NONE);
    }
}