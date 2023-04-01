package com.demomic.license.impl.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Validated
@Component
@ConfigurationProperties(prefix = "demomic-license")
public class ApplicationProperties {

    @NotEmpty
    private String greetingMessage;

}
