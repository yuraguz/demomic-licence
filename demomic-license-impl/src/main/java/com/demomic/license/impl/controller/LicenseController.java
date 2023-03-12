package com.demomic.license.impl.controller;

import com.demomic.license.api.dto.LicenseResponse;
import com.demomic.license.api.resource.LicenseResource;
import com.demomic.license.impl.mapper.LicenseMapper;
import com.demomic.license.impl.service.LicenseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Slf4j
@RestController
@RequiredArgsConstructor
public class LicenseController implements LicenseResource {

    private final MessageSource messageSource;
    private final LicenseMapper licenseMapper;
    private final LicenseService licenseService;

    @Override
    public LicenseResponse getLicense(String organizationId, int licenseId, Locale locale) {
        log.info(messageSource.getMessage("license.get.message", null, locale));
        var license = licenseService.getLicense(licenseId);
        return licenseMapper.licenseToResponse(license)
                .add(linkTo(methodOn(LicenseResource.class)
                        .getLicense(organizationId, licenseId, locale))
                        .withSelfRel());
    }

    @Override
    public void deleteLicense(String organizationId, int licenseId, Locale locale) {
        log.info(messageSource.getMessage("license.delete.message", null, locale));
        licenseService.deleteLicense(licenseId);
    }
}
