// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.DppBaseResourceInner;

public final class DppBaseResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppBaseResourceInner model = BinaryData.fromString("{\"id\":\"gj\",\"name\":\"gdknnqv\",\"type\":\"znqntoru\"}")
            .toObject(DppBaseResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppBaseResourceInner model = new DppBaseResourceInner();
        model = BinaryData.fromObject(model).toObject(DppBaseResourceInner.class);
    }
}
