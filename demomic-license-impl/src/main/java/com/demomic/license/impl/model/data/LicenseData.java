package com.demomic.license.impl.model.data;

import lombok.Data;

@Data
public class LicenseData {

    private String description;

    private String organizationId;

    private String productName;

    private String licenseType;
}
