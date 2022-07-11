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

import com.springboot_database_design.model.SalesFact;
import com.springboot_database_design.repository.SalesFactRepository;

@RestController
@RequestMapping("/SalesFact")
public class SalesFactRestController {
	@Autowired
	private SalesFactRepository salesFactRepository;

	@PostMapping("/add")
	public SalesFact addSalesFact(@RequestBody SalesFact salesFact) {
		return salesFactRepository.save(salesFact);
	}

	@GetMapping("/list")
	public List<SalesFact> listSalesFacts() {
		return salesFactRepository.findAll();
	}

	@PutMapping("/update")
	public SalesFact updateSalesFacts(@RequestBody SalesFact salesFact) {
		return salesFactRepository.save(salesFact);
	}

	@DeleteMapping("/delete")
	public String deleteSalesFact(@RequestBody SalesFact salesFact) {
		salesFactRepository.delete(salesFact);
		return "Deleted Product with Id: " + SalesFact.getSerialversionuid();
	}
}
