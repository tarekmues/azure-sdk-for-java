// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.resourcemanager.datalakeanalytics.models.UpdateStorageAccountParameters;

/** Samples for StorageAccounts Update. */
public final class StorageAccountsUpdateSamples {
    /*
     * x-ms-original-file: specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/stable/2016-11-01/examples/StorageAccounts_Update.json
     */
    /**
     * Sample code: Replaces Azure Storage blob account details.
     *
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void replacesAzureStorageBlobAccountDetails(
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        manager
            .storageAccounts()
            .updateWithResponse(
                "contosorg",
                "contosoadla",
                "test_storage",
                new UpdateStorageAccountParameters().withAccessKey("fakeTokenPlaceholder").withSuffix("test_suffix"),
                com.azure.core.util.Context.NONE);
    }
}
