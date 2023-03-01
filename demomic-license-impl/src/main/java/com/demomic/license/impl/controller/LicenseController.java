package com.demomic.license.impl.controller;

import com.demomic.license.api.dto.LicenseResponse;
import com.demomic.license.api.resource.LicenseResource;
import com.demomic.license.impl.mapper.LicenseMapper;
import com.demomic.license.impl.model.License;
import com.demomic.license.impl.repository.LisenceRepository;
import com.demomic.product.api.resource.client.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LicenseController implements LicenseResource {

    private final LicenseMapper licenseMapper;
    private final LisenceRepository lisenceRepository;
    private final ProductClient productClient;

    @Override
    public LicenseResponse hello() {
        var productResponse = productClient.createProduct();
        var license = lisenceRepository.save(new License(productResponse.id(), productResponse.name()));
        return licenseMapper.licenseToRespone(license);
    }
}
