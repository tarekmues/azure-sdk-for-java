// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestack.fluent.models.ProductLogInner;

public final class ProductLogInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductLogInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"f\",\"productId\":\"t\",\"subscriptionId\":\"n\",\"registrationName\":\"lexxbczwtru\",\"resourceGroupName\":\"qzbqjvsov\",\"operation\":\"okacspk\",\"startDate\":\"hzdobpxjmflbvvnc\",\"endDate\":\"kcciwwzjuqkhr\",\"status\":\"jiwkuofoskghsau\",\"error\":\"mjmvxieduugidyjr\",\"details\":\"byao\"}")
                .toObject(ProductLogInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductLogInner model = new ProductLogInner();
        model = BinaryData.fromObject(model).toObject(ProductLogInner.class);
    }
}