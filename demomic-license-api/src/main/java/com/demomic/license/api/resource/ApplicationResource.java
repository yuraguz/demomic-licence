package com.demomic.license.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ApplicationResource {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String getExampleConfigProperty();
}
