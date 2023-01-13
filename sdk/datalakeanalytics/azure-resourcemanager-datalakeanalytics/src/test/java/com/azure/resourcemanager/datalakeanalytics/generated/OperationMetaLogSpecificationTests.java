// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.models.OperationMetaLogSpecification;
import org.junit.jupiter.api.Assertions;

public final class OperationMetaLogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationMetaLogSpecification model =
            BinaryData
                .fromString("{\"name\":\"sl\",\"displayName\":\"ayqigynduhav\",\"blobDuration\":\"lkthu\"}")
                .toObject(OperationMetaLogSpecification.class);
        Assertions.assertEquals("sl", model.name());
        Assertions.assertEquals("ayqigynduhav", model.displayName());
        Assertions.assertEquals("lkthu", model.blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationMetaLogSpecification model =
            new OperationMetaLogSpecification()
                .withName("sl")
                .withDisplayName("ayqigynduhav")
                .withBlobDuration("lkthu");
        model = BinaryData.fromObject(model).toObject(OperationMetaLogSpecification.class);
        Assertions.assertEquals("sl", model.name());
        Assertions.assertEquals("ayqigynduhav", model.displayName());
        Assertions.assertEquals("lkthu", model.blobDuration());
    }
}
