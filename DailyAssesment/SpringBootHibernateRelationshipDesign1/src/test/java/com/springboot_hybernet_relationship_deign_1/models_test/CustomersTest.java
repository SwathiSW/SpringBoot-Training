package com.springboot_hybernet_relationship_deign_1.models_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot_hibernate_relationship_design_1.models.Customers;
import com.springboot_hibernate_relationship_design_1.repository.CustomersRepository;

public class CustomersTest {
	@Autowired
	private CustomersRepository custRepo;
	
	@Test
	void addCustomerDetails() {
		Customers customer = new Customers();
		customer.setFirstName("Sudeb");
		customer.setLastName("Dolui");
		customer.setEmail("sudebd.in@mouritech.com");
		customer.setPhone(803443);
		assertEquals("Sudeb", customer.getFirstName());
		assertEquals("Dolui", customer.getLastName());
		assertEquals("sudebd.in@mouritech.com", customer.getEmail());
		assertEquals(803443, customer.getPhone());
	}

}
