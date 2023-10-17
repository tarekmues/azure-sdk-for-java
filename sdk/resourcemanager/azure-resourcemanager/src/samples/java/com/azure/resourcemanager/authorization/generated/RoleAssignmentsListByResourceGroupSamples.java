// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

/** Samples for RoleAssignments ListByResourceGroup. */
public final class RoleAssignmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_ListForResourceGroup.json
     */
    /**
     * Sample code: List role assignments for resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listRoleAssignmentsForResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleAssignments()
            .listByResourceGroup("testrg", null, null, com.azure.core.util.Context.NONE);
    }
}
