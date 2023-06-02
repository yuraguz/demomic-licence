package com.demomic.license.impl.controller;

import com.demomic.license.api.client.LicenseClient;
import com.demomic.license.api.dto.LicenseFullInfoResponse;
import com.demomic.license.api.dto.LicenseResponse;
import com.demomic.license.impl.mapper.LicenseMapper;
import com.demomic.license.impl.service.LicenseService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@Slf4j
@RestController
@RequiredArgsConstructor
public class LicenseController implements LicenseClient {

    private final LicenseMapper licenseMapper;
    private final LicenseService licenseService;

    @Override
    @CircuitBreaker(name = "demomic-license")
    public LicenseFullInfoResponse getLicenseFullInfo(int licenseId) {
        var license = licenseService.getLicense(licenseId);
        return new LicenseFullInfoResponse(licenseMapper.licenseToResponse(license));
    }

    @Override
    public LicenseResponse getLicense(String organizationId, int licenseId, Locale locale) {
        var license = licenseService.getLicense(licenseId);
        return licenseMapper.licenseToResponse(license);
    }

    @Override
    public void deleteLicense(String organizationId, int licenseId, Locale locale) {
        licenseService.deleteLicense(licenseId);
    }
}
