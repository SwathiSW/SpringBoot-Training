package com.springboot_login_module_from_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_login_module_from_database.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
