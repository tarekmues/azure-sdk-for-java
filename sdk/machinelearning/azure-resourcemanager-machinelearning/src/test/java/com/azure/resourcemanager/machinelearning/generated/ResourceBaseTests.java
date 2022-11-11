// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ResourceBase;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceBaseTests {
    @Test
    public void testDeserialize() {
        ResourceBase model =
            BinaryData
                .fromString(
                    "{\"description\":\"ss\",\"properties\":{\"uyowqkdwy\":\"twbdsrezpdrhn\"},\"tags\":{\"rcgp\":\"ib\",\"ejzanlfz\":\"kpzi\",\"zonokixrjqci\":\"iavrm\"}}")
                .toObject(ResourceBase.class);
        Assertions.assertEquals("ss", model.description());
        Assertions.assertEquals("twbdsrezpdrhn", model.properties().get("uyowqkdwy"));
        Assertions.assertEquals("ib", model.tags().get("rcgp"));
    }

    @Test
    public void testSerialize() {
        ResourceBase model =
            new ResourceBase()
                .withDescription("ss")
                .withProperties(mapOf("uyowqkdwy", "twbdsrezpdrhn"))
                .withTags(mapOf("rcgp", "ib", "ejzanlfz", "kpzi", "zonokixrjqci", "iavrm"));
        model = BinaryData.fromObject(model).toObject(ResourceBase.class);
        Assertions.assertEquals("ss", model.description());
        Assertions.assertEquals("twbdsrezpdrhn", model.properties().get("uyowqkdwy"));
        Assertions.assertEquals("ib", model.tags().get("rcgp"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}