package com.springboot_hybernet_one_to_one.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_hybernet_one_to_one.model.Employee;
import com.springboot_hybernet_one_to_one.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@Autowired
	private EmployeeRepository empRepo;

	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}

	@GetMapping("/")
	public List<Employee> listEmployee(){
		return empRepo.findAll();
	}
	
	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@DeleteMapping("/")
	public String deleteEmployee(@RequestBody Employee emp) {
		empRepo.delete(emp);
		return "Deleted Employee";
	}
}
