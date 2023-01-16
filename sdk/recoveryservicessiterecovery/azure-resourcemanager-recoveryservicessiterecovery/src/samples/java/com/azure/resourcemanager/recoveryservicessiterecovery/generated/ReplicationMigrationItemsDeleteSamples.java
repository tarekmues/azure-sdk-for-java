// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationMigrationItems Delete. */
public final class ReplicationMigrationItemsDeleteSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationMigrationItems_Delete.json
     */
    /**
     * Sample code: Delete the migration item.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void deleteTheMigrationItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationMigrationItems()
            .delete(
                "migrationvault",
                "resourcegroup1",
                "vmwarefabric1",
                "vmwareContainer1",
                "virtualmachine1",
                null,
                com.azure.core.util.Context.NONE);
    }
}