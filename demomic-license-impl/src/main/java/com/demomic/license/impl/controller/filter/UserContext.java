package com.demomic.license.impl.controller.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserContext {

    public static final String CORRELATION_ID = "tmx-correlation-id";

    private String correlationId;
}
