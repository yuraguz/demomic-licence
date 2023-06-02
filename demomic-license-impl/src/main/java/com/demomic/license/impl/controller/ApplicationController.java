package com.demomic.license.impl.controller;

import com.demomic.license.impl.properties.ApplicationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationProperties applicationProperties;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getExampleConfigProperty() {
        return applicationProperties.getGreetingMessage();
    }
}
