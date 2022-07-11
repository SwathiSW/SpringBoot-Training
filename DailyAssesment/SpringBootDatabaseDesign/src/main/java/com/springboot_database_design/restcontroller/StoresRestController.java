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

import com.springboot_database_design.model.Stores;
import com.springboot_database_design.repository.StoresRepository;

@RestController
@RequestMapping("/Store")
public class StoresRestController {
	@Autowired
	private StoresRepository storesRepository;

	@PostMapping("/add")
	public Stores addStore(@RequestBody Stores store) {
		return storesRepository.save(store);
	}

	@GetMapping("/list")
	public List<Stores> listStores() {
		return storesRepository.findAll();
	}

	@PutMapping("/update")
	public Stores updateStore(@RequestBody Stores store) {
		return storesRepository.save(store);
	}

	@DeleteMapping("/delete")
	public String deleteStore(@RequestBody Stores store) {
		storesRepository.delete(store);
		return "Deleted Product with Id: " + Stores.getSerialversionuid();
	}
}
