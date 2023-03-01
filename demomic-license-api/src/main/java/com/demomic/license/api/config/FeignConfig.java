package com.demomic.license.api.config;

import com.demomic.license.api.resource.client.LicenseClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = LicenseClient.class)
public class FeignConfig {
}
