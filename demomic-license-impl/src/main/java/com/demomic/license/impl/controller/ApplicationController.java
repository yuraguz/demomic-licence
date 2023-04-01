package com.demomic.license.impl.controller;

import com.demomic.license.api.resource.ApplicationResource;
import com.demomic.license.impl.properties.ApplicationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApplicationController implements ApplicationResource {

    private final ApplicationProperties applicationProperties;

    @Override
    public String getExampleConfigProperty() {
        return applicationProperties.getGreetingMessage();
    }
}
