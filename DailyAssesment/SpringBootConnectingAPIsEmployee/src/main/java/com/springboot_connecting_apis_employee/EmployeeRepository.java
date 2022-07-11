package com.springboot_connecting_apis_employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public abstract void createEmployee(Employee employee);
	public abstract void updateEmployee(Long eId, Employee employee);
	public abstract void deleteEmployee(Long eId);
	public abstract List<Employee> getEmployees();
}
