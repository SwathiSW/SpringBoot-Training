package com.springboot_login_module_from_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_login_module_from_database.model.CompanyUser;

@Repository
public interface CompanyUserRepository extends JpaRepository<CompanyUser, Long> {

}
