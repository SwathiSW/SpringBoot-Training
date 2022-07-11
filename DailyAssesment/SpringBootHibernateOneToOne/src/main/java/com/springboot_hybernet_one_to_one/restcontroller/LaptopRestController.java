package com.springboot_hybernet_one_to_one.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_hybernet_one_to_one.model.Laptop;
import com.springboot_hybernet_one_to_one.repository.LaptopRepository;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {
	@Autowired
	private LaptopRepository lapRepo;

	@PostMapping("/")
	public Laptop addLaptop(@RequestBody Laptop lap) {
		return lapRepo.save(lap);
	}

	@GetMapping("/")
	public List<Laptop> listLaptop() {
		return lapRepo.findAll();
	}
	
	@PutMapping("/")
	public Laptop updateLaptop(@RequestBody Laptop lap) {
		return lapRepo.save(lap);
	}
	
	@DeleteMapping("/")
	public String deleteLaptop(@RequestBody Laptop lap) {
		lapRepo.delete(lap);
		return "Deleted Laptop";
	}
}
