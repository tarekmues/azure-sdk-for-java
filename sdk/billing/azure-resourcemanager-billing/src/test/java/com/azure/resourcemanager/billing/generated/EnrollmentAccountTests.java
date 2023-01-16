// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.Department;
import com.azure.resourcemanager.billing.models.EnrollmentAccount;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class EnrollmentAccountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnrollmentAccount model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"accountName\":\"e\",\"costCenter\":\"alhbx\",\"accountOwner\":\"e\",\"accountOwnerEmail\":\"zzvdudgwds\",\"status\":\"hotwmcynpwlbjnp\",\"startDate\":\"2021-06-10T20:31:16Z\",\"endDate\":\"2021-04-17T12:51:37Z\",\"department\":{\"id\":\"ehxnltyfsop\",\"name\":\"usue\",\"type\":\"nzwdejba\"}},\"id\":\"orxzdmohctbqvud\",\"name\":\"xdn\",\"type\":\"nvowgujju\"}")
                .toObject(EnrollmentAccount.class);
        Assertions.assertEquals("e", model.accountName());
        Assertions.assertEquals("alhbx", model.costCenter());
        Assertions.assertEquals("e", model.accountOwner());
        Assertions.assertEquals("zzvdudgwds", model.accountOwnerEmail());
        Assertions.assertEquals("hotwmcynpwlbjnp", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-10T20:31:16Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T12:51:37Z"), model.endDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnrollmentAccount model =
            new EnrollmentAccount()
                .withAccountName("e")
                .withCostCenter("alhbx")
                .withAccountOwner("e")
                .withAccountOwnerEmail("zzvdudgwds")
                .withStatus("hotwmcynpwlbjnp")
                .withStartDate(OffsetDateTime.parse("2021-06-10T20:31:16Z"))
                .withEndDate(OffsetDateTime.parse("2021-04-17T12:51:37Z"))
                .withDepartment(new Department());
        model = BinaryData.fromObject(model).toObject(EnrollmentAccount.class);
        Assertions.assertEquals("e", model.accountName());
        Assertions.assertEquals("alhbx", model.costCenter());
        Assertions.assertEquals("e", model.accountOwner());
        Assertions.assertEquals("zzvdudgwds", model.accountOwnerEmail());
        Assertions.assertEquals("hotwmcynpwlbjnp", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-10T20:31:16Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T12:51:37Z"), model.endDate());
    }
}