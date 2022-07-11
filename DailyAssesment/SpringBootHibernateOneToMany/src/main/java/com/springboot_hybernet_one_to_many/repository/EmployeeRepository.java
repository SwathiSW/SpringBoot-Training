package com.springboot_hybernet_one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_hybernet_one_to_many.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
