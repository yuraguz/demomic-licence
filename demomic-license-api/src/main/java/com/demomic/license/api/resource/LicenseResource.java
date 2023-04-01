package com.demomic.license.api.resource;

import com.demomic.license.api.dto.LicenseFullInfoResponse;
import com.demomic.license.api.dto.LicenseResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

public interface LicenseResource {

    @RequestMapping(value = "/api/v1/license/{licenseId}", method = RequestMethod.GET)
    LicenseFullInfoResponse getLicenseFullInfo(@PathVariable("licenseId") int licenseId);

    @RequestMapping(value = "/api/v1/organization/{organizationId}/license/{licenseId}", method = RequestMethod.GET)
    LicenseResponse getLicense(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") int licenseId,
                               @RequestHeader(value = "Accept-Language", required = false) Locale locale);

    @RequestMapping(value = "/api/v1/organization/{organizationId}/license/{licenseId}", method = RequestMethod.DELETE)
    void deleteLicense(@PathVariable("organizationId") String organizationId,
                       @PathVariable("licenseId") int licenseId,
                       @RequestHeader(value = "Accept-Language", required = false) Locale locale);

}
