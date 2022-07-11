package com.springboot_query_annotation_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;

import com.springboot_query_annotation_demo.models.Employee;
import com.springboot_query_annotation_demo.repository.EmployeeRepository;

@Service
public class EmployeeService{

	@Autowired
	private EmployeeRepository employeesRepository;
	
	public List<Employee> getEmployees(Example<Employee> employee){
//		return employeesRepository.findAll(employee);
//		return employeesRepository.findAll(Sort.by(Sort.Direction.ASC), "name");
//		return employeesRepository.findAll(Sort.by("phone"));
//		return employeesRepository.findAll(Sort.by("LENGTH(name)"));
//		return employeesRepository.findAll(Sort.by("LENGTH(address)"));
		return employeesRepository.findAll(JpaSort.unsafe("LENGTH(name)"));
	}
}
