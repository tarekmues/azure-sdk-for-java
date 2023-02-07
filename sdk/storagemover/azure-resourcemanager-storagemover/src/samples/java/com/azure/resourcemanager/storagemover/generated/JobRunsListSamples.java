// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/** Samples for JobRuns List. */
public final class JobRunsListSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2023-03-01/examples/JobRuns_List.json
     */
    /**
     * Sample code: JobRuns_List.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void jobRunsList(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .jobRuns()
            .list(
                "examples-rg",
                "examples-storageMoverName",
                "examples-projectName",
                "examples-jobDefinitionName",
                com.azure.core.util.Context.NONE);
    }
}
