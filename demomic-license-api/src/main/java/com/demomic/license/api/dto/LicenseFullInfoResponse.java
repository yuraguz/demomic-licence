package com.demomic.license.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class LicenseFullInfoResponse {

    private LicenseResponse license;

}