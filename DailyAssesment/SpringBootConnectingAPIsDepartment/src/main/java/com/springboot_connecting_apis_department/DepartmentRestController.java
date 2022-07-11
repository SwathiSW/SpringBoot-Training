package com.springboot_connecting_apis_department;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import target.classes.com.springboot_connecting_apis_employees.Employee;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {

	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/create")
	public String createDepartment(@RequestBody Department department) {
		departmentRepository.save(department);
		return "Department Created with Did: " + department.getdId() + " and Name: " + department.getDepartmentName();
	}

	@PutMapping("/update")
	public String updateDepartment(@RequestBody Department department) {
		departmentRepository.save(department);
		return "Department Created with Did: " + department.getdId() + " and Name: " + department.getDepartmentName();
	}

	@GetMapping("/list")
	public List<Department> listDepartments() {
		return departmentRepository.findAll();
	}

	@DeleteMapping("/delete")
	public String deleteDepartment(@RequestBody Department department) {
		departmentRepository.delete(department);
		return "Department Created with Did: " + department.getdId() + " and Name: " + department.getDepartmentName();
	}

	@GetMapping("/listEmployee")
	@HystrixCommand(fallbackMethod = "retrierback")
	public List<Employee> getEmployees() {
		List<Employee> employee = restTemplate.exchange("https://localhost:8086/list", HttpMethod.GET, null, List.class).getBody();
		return employee;
	}

	public List<Employee> retrierback() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		return employees;
	}
}
