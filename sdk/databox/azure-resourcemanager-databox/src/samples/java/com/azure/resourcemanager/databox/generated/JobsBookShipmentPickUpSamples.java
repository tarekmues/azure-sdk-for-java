// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.resourcemanager.databox.models.ShipmentPickUpRequest;
import java.time.OffsetDateTime;

/** Samples for Jobs BookShipmentPickUp. */
public final class JobsBookShipmentPickUpSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/BookShipmentPickupPost.json
     */
    /**
     * Sample code: BookShipmentPickupPost.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void bookShipmentPickupPost(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .jobs()
            .bookShipmentPickUpWithResponse(
                "bvttoolrg6",
                "TJ-636646322037905056",
                new ShipmentPickUpRequest()
                    .withStartTime(OffsetDateTime.parse("2019-09-20T18:30:00Z"))
                    .withEndTime(OffsetDateTime.parse("2019-09-22T18:30:00Z"))
                    .withShipmentLocation("Front desk"),
                com.azure.core.util.Context.NONE);
    }
}