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

import com.springboot_hibernate_relationship_design_1.models.Stores;
import com.springboot_hibernate_relationship_design_1.repository.StoresRepository;

@RestController
@RequestMapping("/Stores")
public class StoresRestController {
	@Autowired
	private StoresRepository storeRepo;

	@GetMapping
	public List<Stores> listStores() {
		return storeRepo.findAll();
	}

	@PostMapping
	public Stores addStore(@RequestBody Stores store) {
		return storeRepo.save(store);
	}

	@PutMapping
	public Stores updateStore(@RequestBody Stores store) {
		return storeRepo.save(store);
	}

	@DeleteMapping
	public String deleteStore(@RequestBody Stores store) {
		storeRepo.delete(store);
		return "Deleted Store";
	}
}
