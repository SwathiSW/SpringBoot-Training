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

import com.springboot_hibernate_relationship_design_1.models.Currencies;
import com.springboot_hibernate_relationship_design_1.repository.CurrenciesRepository;


@RestController
@RequestMapping("/Currencies")
public class CurrenciesRestController {
	@Autowired
	private CurrenciesRepository curncyRepo;

	@PostMapping("/")
	public Currencies addCurrencies(@RequestBody Currencies curncy ) {
		return curncyRepo.save(curncy);
	}

	@GetMapping("/")
	public List<Currencies> listCurrencies() {
		return curncyRepo.findAll();
	}

	@PutMapping("/")
	public Currencies updateCurrencies(@RequestBody Currencies curncy) {
		return curncyRepo.save(curncy);
	}

	@DeleteMapping("/")
	public String deleteCurrencies(@RequestBody Currencies curncy) {
		curncyRepo.delete(curncy);
		return "Deleted Currency";
	}
}
