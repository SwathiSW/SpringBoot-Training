package com.springboot_login_module_from_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot_login_module_from_database.model.CompanyUser;

@Repository
public interface UserRepository extends JpaRepository<CompanyUser, Long> {

	@Query("SELECT u FROM CompanyUser u WHERE u.email = ?1")
	public CompanyUser findByEmail(String email);

	public CompanyUser findByUsername(String user);
}
