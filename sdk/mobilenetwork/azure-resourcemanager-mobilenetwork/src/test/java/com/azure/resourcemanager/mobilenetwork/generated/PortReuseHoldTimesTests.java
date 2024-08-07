// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.PortReuseHoldTimes;
import org.junit.jupiter.api.Assertions;

public final class PortReuseHoldTimesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortReuseHoldTimes model
            = BinaryData.fromString("{\"tcp\":1977100929,\"udp\":1527303417}").toObject(PortReuseHoldTimes.class);
        Assertions.assertEquals(1977100929, model.tcp());
        Assertions.assertEquals(1527303417, model.udp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortReuseHoldTimes model = new PortReuseHoldTimes().withTcp(1977100929).withUdp(1527303417);
        model = BinaryData.fromObject(model).toObject(PortReuseHoldTimes.class);
        Assertions.assertEquals(1977100929, model.tcp());
        Assertions.assertEquals(1527303417, model.udp());
    }
}
