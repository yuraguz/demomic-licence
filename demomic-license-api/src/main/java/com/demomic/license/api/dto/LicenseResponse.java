package com.demomic.license.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.hateoas.RepresentationModel;

@Data
@Accessors(chain = true)
public class LicenseResponse extends RepresentationModel<LicenseResponse> {

    private int id;

    private String name;

}
