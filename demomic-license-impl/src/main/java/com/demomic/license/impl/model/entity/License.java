package com.demomic.license.impl.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
