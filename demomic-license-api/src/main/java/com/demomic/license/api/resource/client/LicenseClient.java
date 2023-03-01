package com.demomic.license.api.resource.client;

import com.demomic.license.api.resource.LicenseResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "DemomicLicenseClient",
        url = "http://localhost:8090")
public interface LicenseClient extends LicenseResource {
}
