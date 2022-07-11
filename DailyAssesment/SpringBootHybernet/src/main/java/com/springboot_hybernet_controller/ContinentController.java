package com.springboot_hybernet_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot_hybernet.Continent;
import com.springboot_hybernet_repository.ContinentRepository;

@Controller
public class ContinentController {
	@Autowired
	private ContinentRepository continentRepository;
	
	@GetMapping("/continent")
	public List<Continent>getAllContinents() {
		return continentRepository.findAll();
	}
	
	@PostMapping("/continent/blank")
	public Continent addBlankContinent() {
		return continentRepository.save(new Continent());
	}
	
	@PostMapping("/continent")
	public Continent addNewContinent(@RequestBody Continent continent) {
		return continentRepository.save(continent);
	}
	
	@PutMapping("/continent")
	public Continent updateContinent(@RequestBody Continent continent) {
		return continentRepository.save(continent);
	}
	
	@DeleteMapping("/continent")
    public String deleteContinent(@RequestBody Continent continent) {
        continentRepository.save(continent);
        return "Deleted Successfully";
	}
}
