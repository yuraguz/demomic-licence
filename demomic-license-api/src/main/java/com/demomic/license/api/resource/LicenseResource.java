package com.demomic.license.api.resource;

import com.demomic.license.api.dto.LicenseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface LicenseResource {

    @RequestMapping(value = "/license", method = RequestMethod.GET)
    LicenseResponse hello();

}
