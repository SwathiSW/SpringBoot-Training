package com.springboot_connecting_apis_employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee Created with Eid: " + employee.geteId() + " and Name: " + employee.getEmployeeName();
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Update Employee with Eid: " + employee.geteId() + " and Name: " + employee.getEmployeeName();
	}
	
	@GetMapping("/list")
	public List<Employee> listEmployees() {
		return employeeRepository.findAll();
	}
	
	@DeleteMapping("/delete")
	public String deleteEmployee(@RequestBody Employee employee) {
		employeeRepository.delete(employee);
		return "Removed Employee with Eid: "+ employee.geteId() + " and Name: " + employee.getEmployeeName() + " from the Record.";
	}
}
