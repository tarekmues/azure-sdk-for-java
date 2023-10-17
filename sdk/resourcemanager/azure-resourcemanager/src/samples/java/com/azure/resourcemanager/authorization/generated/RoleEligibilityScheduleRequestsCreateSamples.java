// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

import com.azure.resourcemanager.authorization.fluent.models.RoleEligibilityScheduleRequestInner;
import com.azure.resourcemanager.authorization.models.RequestType;
import com.azure.resourcemanager.authorization.models.RoleEligibilityScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.models.RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleEligibilityScheduleRequests Create. */
public final class RoleEligibilityScheduleRequestsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/PutRoleEligibilityScheduleRequest.json
     */
    /**
     * Sample code: PutRoleEligibilityScheduleRequest.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putRoleEligibilityScheduleRequest(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleEligibilityScheduleRequests()
            .createWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                new RoleEligibilityScheduleRequestInner()
                    .withRoleDefinitionId(
                        "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
                    .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
                    .withRequestType(RequestType.ADMIN_ASSIGN)
                    .withScheduleInfo(
                        new RoleEligibilityScheduleRequestPropertiesScheduleInfo()
                            .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:31:27.91Z"))
                            .withExpiration(
                                new RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration()
                                    .withType(Type.AFTER_DURATION)
                                    .withDuration("P365D")))
                    .withCondition(
                        "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                            + " StringEqualsIgnoreCase 'foo_storage_container'")
                    .withConditionVersion("1.0"),
                com.azure.core.util.Context.NONE);
    }
}
