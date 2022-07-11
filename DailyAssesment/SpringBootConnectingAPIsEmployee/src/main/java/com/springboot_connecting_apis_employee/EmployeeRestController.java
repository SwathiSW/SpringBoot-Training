package com.springboot_connecting_apis_employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		employeeRepository.createEmployee(employee);
		return "Employee Created with Eid: " + employee.geteId() + " and Name: " + employee.getEmployeeName();
	}
	
	@PutMapping("/update/{id}")
	public String updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		employeeRepository.updateEmployee(id, employee);
		return "Update Employee with Eid: " + employee.geteId() + " and Name: " + employee.getEmployeeName();
	}
	
	@GetMapping("/list")
	public List<Employee> listEmployees() {
		return employeeRepository.getEmployees();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		employeeRepository.deleteEmployee(id);
		return "Removed Employee with Eid: "+ employee.geteId() + " and Name: " + employee.getEmployeeName() + " from the Record.";
	}
}
