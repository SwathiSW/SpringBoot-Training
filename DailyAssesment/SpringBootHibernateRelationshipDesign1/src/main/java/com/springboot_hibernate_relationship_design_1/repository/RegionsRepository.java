package com.springboot_hibernate_relationship_design_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_hibernate_relationship_design_1.models.Regions;

@Repository
public interface RegionsRepository extends JpaRepository<Regions, Long>{

}
