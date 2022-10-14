// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.IfNotExistsEvaluationDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IfNotExistsEvaluationDetailsTests {
    @Test
    public void testDeserialize() {
        IfNotExistsEvaluationDetails model =
            BinaryData
                .fromString("{\"resourceId\":\"ndnhj\",\"totalResources\":1922459268}")
                .toObject(IfNotExistsEvaluationDetails.class);
        Assertions.assertEquals("ndnhj", model.resourceId());
        Assertions.assertEquals(1922459268, model.totalResources());
    }

    @Test
    public void testSerialize() {
        IfNotExistsEvaluationDetails model =
            new IfNotExistsEvaluationDetails().withResourceId("ndnhj").withTotalResources(1922459268);
        model = BinaryData.fromObject(model).toObject(IfNotExistsEvaluationDetails.class);
        Assertions.assertEquals("ndnhj", model.resourceId());
        Assertions.assertEquals(1922459268, model.totalResources());
    }
}
