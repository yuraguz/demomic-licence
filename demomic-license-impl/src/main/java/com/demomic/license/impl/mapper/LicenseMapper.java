package com.demomic.license.impl.mapper;

import com.demomic.license.api.dto.LicenseResponse;
import com.demomic.license.impl.model.License;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LicenseMapper {

    LicenseResponse licenseToRespone(License license);
}
