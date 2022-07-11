package com.springboot_query_annotation_demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_query_annotation_demo.models.Employee;
import com.springboot_query_annotation_demo.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	public List<Employee> listEmployees(Example<Employee> employee) {
		return employeeService.getEmployees(employee);
	}
}
