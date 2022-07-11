package com.springboot_hybernet_one_to_many.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_hybernet_one_to_many.model.Phone;
import com.springboot_hybernet_one_to_many.repository.PhoneRepository;

@RestController
@RequestMapping("/phone")
public class PhoneRestController {
	@Autowired
	private PhoneRepository phnRepo;

	@PostMapping("/")
	public Phone addPhone(@RequestBody Phone phone) {
		return phnRepo.save(phone);
	}

	@GetMapping("/")
	public List<Phone> listPhone() {
		return phnRepo.findAll();
	}

	@PutMapping("/")
	public Phone updatePhone(@RequestBody Phone phone) {
		return phnRepo.save(phone);
	}
	
	@DeleteMapping("/")
	public String deletePhone(@RequestBody Phone ph) {
		phnRepo.delete(ph);
		return "Phone Data Deleted";
	}
}
