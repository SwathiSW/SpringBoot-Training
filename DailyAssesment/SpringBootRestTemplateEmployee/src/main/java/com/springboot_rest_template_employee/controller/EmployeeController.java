package com.springboot_rest_template_employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest_template_employee.model.Employee;
import com.springboot_rest_template_employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/create")
	public Employee createEmployee (@RequestBody Employee e) {
		return employeeRepository.save(e);
	}
	
	@GetMapping("/list")
	public List<Employee> listEmployees( ) {
		return employeeRepository.findAll();
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e) {
		return employeeRepository.save(e);
	}
	
	@DeleteMapping("/delete") 
	public String deleteEmployee (@RequestBody Employee e) {
		String name = e.getEmployeeName();
		employeeRepository.delete(e);
		return "Deleted Employee From DataBase " + name;
	}

}
