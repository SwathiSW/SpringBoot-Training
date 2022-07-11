package com.springboot_hybernetdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository r;

	@PostMapping("/")
	public Employee addRecord(@RequestBody Employee emp) {
		Employee e = r.save(emp);
		return e;
	}

	@PutMapping("/")
	public Employee updateRecord(@RequestBody Employee emp) {
//		Employee e = r.findById(emp.getPid());
		return r.save(emp);
	}

	@DeleteMapping("/")
	public String deleteRecord(@RequestBody Employee emp) {
		r.delete(emp);
		return "Deleted Successfully";
	}

	@GetMapping("/")
	public List<Employee> IsitRecord() {
		return r.findAll();
	}
}
