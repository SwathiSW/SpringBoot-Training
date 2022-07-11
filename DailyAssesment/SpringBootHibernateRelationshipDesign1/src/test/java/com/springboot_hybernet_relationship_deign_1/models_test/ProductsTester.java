package com.springboot_hybernet_relationship_deign_1.models_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot_hibernate_relationship_design_1.models.Products;
import com.springboot_hibernate_relationship_design_1.repository.ProductsRepository;

public class ProductsTester {

	@Autowired
	private ProductsRepository prodRepo;
	
	@Test
	void addProduct() {
		Products prod = new Products();
		prod.setName("Watch");
		prod.setColour("Blue");
		prod.setSize("Medium");
		assertEquals("Watch", prod.getName());
		assertEquals("Blue", prod.getColour());
		assertEquals("Medium", prod.getSize());
	}
}
