// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterVersionInner;
import org.junit.jupiter.api.Assertions;

public final class ClusterVersionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterVersionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"clusterType\":\"j\",\"clusterVersion\":\"nlfzxiavrmbz\",\"ossVersion\":\"okixrjqcir\",\"clusterPoolVersion\":\"pfrlazsz\",\"isPreview\":false,\"components\":[{\"name\":\"ndfpwpj\",\"version\":\"wbtlhflsjcdh\"}]},\"id\":\"zfjvfbgofe\",\"name\":\"jagrqmqhldvr\",\"type\":\"iiojnal\"}")
                .toObject(ClusterVersionInner.class);
        Assertions.assertEquals("j", model.clusterType());
        Assertions.assertEquals("nlfzxiavrmbz", model.clusterVersion());
        Assertions.assertEquals("okixrjqcir", model.ossVersion());
        Assertions.assertEquals("pfrlazsz", model.clusterPoolVersion());
        Assertions.assertEquals(false, model.isPreview());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterVersionInner model =
            new ClusterVersionInner()
                .withClusterType("j")
                .withClusterVersion("nlfzxiavrmbz")
                .withOssVersion("okixrjqcir")
                .withClusterPoolVersion("pfrlazsz")
                .withIsPreview(false);
        model = BinaryData.fromObject(model).toObject(ClusterVersionInner.class);
        Assertions.assertEquals("j", model.clusterType());
        Assertions.assertEquals("nlfzxiavrmbz", model.clusterVersion());
        Assertions.assertEquals("okixrjqcir", model.ossVersion());
        Assertions.assertEquals("pfrlazsz", model.clusterPoolVersion());
        Assertions.assertEquals(false, model.isPreview());
    }
}
