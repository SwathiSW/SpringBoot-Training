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

import com.springboot_hibernate_relationship_design_1.models.Regions;
import com.springboot_hibernate_relationship_design_1.repository.RegionsRepository;

@RestController
@RequestMapping("/Regions")
public class RegionsRestController {
	@Autowired
	private RegionsRepository regRepo;

	@PostMapping("/")
	public Regions addRegion(@RequestBody Regions reg) {
		return regRepo.save(reg);
	}

	@GetMapping("/")
	public List<Regions> listRegion() {
		return regRepo.findAll();
	}

	@PutMapping("/")
	public Regions updateRegion(@RequestBody Regions reg) {
		return regRepo.save(reg);
	}

	@DeleteMapping("/")
	public String deleteRegion(@RequestBody Regions reg) {
		regRepo.delete(reg);
		return "Deleted Region";
	}

}
