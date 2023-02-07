// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/** Samples for JobDefinitions Get. */
public final class JobDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2023-03-01/examples/JobDefinitions_Get.json
     */
    /**
     * Sample code: JobDefinitions_Get.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void jobDefinitionsGet(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .jobDefinitions()
            .getWithResponse(
                "examples-rg",
                "examples-storageMoverName",
                "examples-projectName",
                "examples-jobDefinitionName",
                com.azure.core.util.Context.NONE);
    }
}
