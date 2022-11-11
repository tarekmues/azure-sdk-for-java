// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ImageLimitSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageLimitSettingsTests {
    @Test
    public void testDeserialize() {
        ImageLimitSettings model =
            BinaryData
                .fromString("{\"maxConcurrentTrials\":543709562,\"maxTrials\":848455814,\"timeout\":\"PT224H41M46S\"}")
                .toObject(ImageLimitSettings.class);
        Assertions.assertEquals(543709562, model.maxConcurrentTrials());
        Assertions.assertEquals(848455814, model.maxTrials());
        Assertions.assertEquals(Duration.parse("PT224H41M46S"), model.timeout());
    }

    @Test
    public void testSerialize() {
        ImageLimitSettings model =
            new ImageLimitSettings()
                .withMaxConcurrentTrials(543709562)
                .withMaxTrials(848455814)
                .withTimeout(Duration.parse("PT224H41M46S"));
        model = BinaryData.fromObject(model).toObject(ImageLimitSettings.class);
        Assertions.assertEquals(543709562, model.maxConcurrentTrials());
        Assertions.assertEquals(848455814, model.maxTrials());
        Assertions.assertEquals(Duration.parse("PT224H41M46S"), model.timeout());
    }
}