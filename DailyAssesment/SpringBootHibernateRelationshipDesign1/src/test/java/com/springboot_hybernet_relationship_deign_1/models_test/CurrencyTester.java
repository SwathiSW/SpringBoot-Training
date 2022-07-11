package com.springboot_hybernet_relationship_deign_1.models_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot_hibernate_relationship_design_1.models.Currencies;
import com.springboot_hibernate_relationship_design_1.repository.CurrenciesRepository;

public class CurrencyTester {

	@Autowired
	private CurrenciesRepository currRepo;
	
	@Test
	public void currencySaveTest() {
		Currencies curr = new Currencies();
		curr.setName("Rupees");
		assertEquals("Rupees", curr.getName());
	}
	
}
