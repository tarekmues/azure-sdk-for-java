// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.UserAssignedIdentity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UserAssignedIdentityTests {
    @Test
    public void testDeserialize() {
        UserAssignedIdentity model =
            BinaryData
                .fromString("{\"principalId\":\"sxlzevgbmqj\",\"clientId\":\"bcypmi\",\"tenantId\":\"w\"}")
                .toObject(UserAssignedIdentity.class);
        Assertions.assertEquals("w", model.tenantId());
    }

    @Test
    public void testSerialize() {
        UserAssignedIdentity model = new UserAssignedIdentity().withTenantId("w");
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentity.class);
        Assertions.assertEquals("w", model.tenantId());
    }
}