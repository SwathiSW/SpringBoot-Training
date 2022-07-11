package com.springboot_hibernate_relationship_design_1.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_hibernate_relationship_design_1.models.Customers;
import com.springboot_hibernate_relationship_design_1.repository.CustomersRepository;

@RestController
@RequestMapping("/Customers")
public class CustomersRestController {
	@Autowired
	private CustomersRepository custRepo;
	@PostMapping("/")
	public Customers addCustomer(@RequestBody Customers cust ) {
		return custRepo.save(cust);
	}

	@GetMapping("/")
	public List<Customers> listCustomer() {
		return custRepo.findAll();
	}

	@PutMapping("/")
	public Customers updateCustomer(@RequestBody Customers cust) {
		return custRepo.save(cust);
	}

	@DeleteMapping("/")
	public String deleteCustomer(@RequestBody Customers cust) {
		custRepo.delete(cust);
		return "Deleted Customer";
	}
}
