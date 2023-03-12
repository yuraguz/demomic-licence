package com.demomic.license.impl.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class License {

    @Id
    private int id;

    private String description;

    private String organizationId;

    private String productName;

    private String licenseType;
}
