package com.springboot_database_design.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_database_design.model.SalesFact;

@Repository
public interface SalesFactRepository extends JpaRepository<SalesFact, Integer>{

}
