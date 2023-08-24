// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterVersionInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterVersionsListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterVersionsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterVersionsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"clusterType\":\"xggicccnxqhuexmk\",\"clusterVersion\":\"lstvlzywe\",\"ossVersion\":\"zrncsdt\",\"clusterPoolVersion\":\"u\",\"isPreview\":true,\"components\":[{\"name\":\"fgytguslfeadcyg\",\"version\":\"kyhejhzisxgf\"},{\"name\":\"lolp\",\"version\":\"ksrpqv\"},{\"name\":\"zraehtwd\",\"version\":\"ftswibyrcdlbhsh\"},{\"name\":\"p\",\"version\":\"cstwity\"}]},\"id\":\"hevxcced\",\"name\":\"pnmdyodnwzxltjcv\",\"type\":\"hlt\"},{\"properties\":{\"clusterType\":\"cxnavv\",\"clusterVersion\":\"qiby\",\"ossVersion\":\"nyowxwlmdjrkvfg\",\"clusterPoolVersion\":\"fvpdbo\",\"isPreview\":true,\"components\":[{\"name\":\"j\",\"version\":\"hkr\"},{\"name\":\"bdeibqipqk\",\"version\":\"vxndz\"}]},\"id\":\"mkrefajpjorwkq\",\"name\":\"yhgbijtjivfx\",\"type\":\"sjabibs\"},{\"properties\":{\"clusterType\":\"awfsdjpvkvpbjxbk\",\"clusterVersion\":\"zkdvncja\",\"ossVersion\":\"durgkakmokz\",\"clusterPoolVersion\":\"jk\",\"isPreview\":false,\"components\":[{\"name\":\"uwqlgzrfzeey\",\"version\":\"izikayuhq\"},{\"name\":\"jbsybbqw\",\"version\":\"t\"},{\"name\":\"gmfpgvmp\",\"version\":\"as\"},{\"name\":\"haq\",\"version\":\"ss\"}]},\"id\":\"wutwbdsre\",\"name\":\"pdrhne\",\"type\":\"yowqkdwytisibir\"}],\"nextLink\":\"pikpz\"}")
                .toObject(ClusterVersionsListResult.class);
        Assertions.assertEquals("xggicccnxqhuexmk", model.value().get(0).clusterType());
        Assertions.assertEquals("lstvlzywe", model.value().get(0).clusterVersion());
        Assertions.assertEquals("zrncsdt", model.value().get(0).ossVersion());
        Assertions.assertEquals("u", model.value().get(0).clusterPoolVersion());
        Assertions.assertEquals(true, model.value().get(0).isPreview());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterVersionsListResult model =
            new ClusterVersionsListResult()
                .withValue(
                    Arrays
                        .asList(
                            new ClusterVersionInner()
                                .withClusterType("xggicccnxqhuexmk")
                                .withClusterVersion("lstvlzywe")
                                .withOssVersion("zrncsdt")
                                .withClusterPoolVersion("u")
                                .withIsPreview(true),
                            new ClusterVersionInner()
                                .withClusterType("cxnavv")
                                .withClusterVersion("qiby")
                                .withOssVersion("nyowxwlmdjrkvfg")
                                .withClusterPoolVersion("fvpdbo")
                                .withIsPreview(true),
                            new ClusterVersionInner()
                                .withClusterType("awfsdjpvkvpbjxbk")
                                .withClusterVersion("zkdvncja")
                                .withOssVersion("durgkakmokz")
                                .withClusterPoolVersion("jk")
                                .withIsPreview(false)));
        model = BinaryData.fromObject(model).toObject(ClusterVersionsListResult.class);
        Assertions.assertEquals("xggicccnxqhuexmk", model.value().get(0).clusterType());
        Assertions.assertEquals("lstvlzywe", model.value().get(0).clusterVersion());
        Assertions.assertEquals("zrncsdt", model.value().get(0).ossVersion());
        Assertions.assertEquals("u", model.value().get(0).clusterPoolVersion());
        Assertions.assertEquals(true, model.value().get(0).isPreview());
    }
}
