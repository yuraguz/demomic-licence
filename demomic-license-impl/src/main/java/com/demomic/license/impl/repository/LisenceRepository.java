package com.demomic.license.impl.repository;

import com.demomic.license.impl.model.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LisenceRepository extends JpaRepository<License, UUID> {
}
