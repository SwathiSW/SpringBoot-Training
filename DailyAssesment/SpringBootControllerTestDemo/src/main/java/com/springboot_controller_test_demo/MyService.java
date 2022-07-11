package com.springboot_controller_test_demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	private EmployeeRepository empRepo;

	public Employee addEmployee(Employee employee) {

		return employee;
	}
}
