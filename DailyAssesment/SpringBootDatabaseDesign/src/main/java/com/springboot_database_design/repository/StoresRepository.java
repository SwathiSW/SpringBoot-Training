package com.springboot_database_design.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_database_design.model.Stores;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Integer>{

}
