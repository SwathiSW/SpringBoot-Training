package com.springboot_database_design.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_database_design.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer>{

}
