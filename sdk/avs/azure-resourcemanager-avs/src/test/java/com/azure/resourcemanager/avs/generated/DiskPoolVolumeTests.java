// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.DiskPoolVolume;
import com.azure.resourcemanager.avs.models.MountOptionEnum;
import org.junit.jupiter.api.Assertions;

public final class DiskPoolVolumeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskPoolVolume model = BinaryData.fromString(
            "{\"targetId\":\"wgipwhono\",\"lunName\":\"kgshwa\",\"mountOption\":\"ATTACH\",\"path\":\"zbinjeputtm\"}")
            .toObject(DiskPoolVolume.class);
        Assertions.assertEquals("wgipwhono", model.targetId());
        Assertions.assertEquals("kgshwa", model.lunName());
        Assertions.assertEquals(MountOptionEnum.ATTACH, model.mountOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskPoolVolume model = new DiskPoolVolume().withTargetId("wgipwhono")
            .withLunName("kgshwa")
            .withMountOption(MountOptionEnum.ATTACH);
        model = BinaryData.fromObject(model).toObject(DiskPoolVolume.class);
        Assertions.assertEquals("wgipwhono", model.targetId());
        Assertions.assertEquals("kgshwa", model.lunName());
        Assertions.assertEquals(MountOptionEnum.ATTACH, model.mountOption());
    }
}
