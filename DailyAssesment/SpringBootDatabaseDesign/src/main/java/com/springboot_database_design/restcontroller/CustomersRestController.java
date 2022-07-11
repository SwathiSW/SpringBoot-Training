package com.springboot_database_design.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_database_design.model.Customers;
import com.springboot_database_design.repository.CustomersRepository;

@RestController
@RequestMapping("/customer")
public class CustomersRestController {
	@Autowired
	private CustomersRepository customersRepository;

	@PostMapping("/add")
	public Customers addCustomer(@RequestBody Customers customer) {
		return customersRepository.save(customer);
	}

	@GetMapping("/list")
	public List<Customers> listCustomers() {
		return customersRepository.findAll();
	}

	@PutMapping("/update")
	public Customers updateCustomer(@RequestBody Customers customers) {
		return customersRepository.save(customers);
	}

	@DeleteMapping("/delete")
	public String deleteCustomer(@RequestBody Customers customers) {
		customersRepository.delete(customers);
		return "Deleted Customer of customerId: " + Customers.getSerialversionuid();
	}
}
