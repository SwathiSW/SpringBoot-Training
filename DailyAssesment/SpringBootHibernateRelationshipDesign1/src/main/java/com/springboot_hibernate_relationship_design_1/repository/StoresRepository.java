package com.springboot_hibernate_relationship_design_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot_hibernate_relationship_design_1.models.Stores;

public interface StoresRepository extends JpaRepository<Stores, Long>{

}
