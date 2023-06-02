package com.demomic.license.impl.service;

import com.demomic.license.impl.model.data.LicenseData;
import com.demomic.license.impl.model.entity.License;
import com.demomic.license.impl.repository.LicenseRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class LicenseService {

    private final LicenseRepository licenseRepository;

    @Transactional
    public License getLicense(int licenseId) {
        return licenseRepository.getReferenceById(licenseId);
    }

    @Transactional
    public int createLicense(LicenseData data) {
        return licenseRepository.save(License.builder()
                        .id(new Random().nextInt())
                        .description(data.getDescription())
                        .organizationId(data.getOrganizationId())
                        .productName(data.getProductName())
                        .licenseType(data.getLicenseType())
                        .build())
                .getId();
    }

    @Transactional
    public void deleteLicense(int licenseId) {
        licenseRepository.deleteById(licenseId);
    }

}

