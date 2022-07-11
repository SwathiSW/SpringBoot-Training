package com.springboot_rest_template_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_rest_template_employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
