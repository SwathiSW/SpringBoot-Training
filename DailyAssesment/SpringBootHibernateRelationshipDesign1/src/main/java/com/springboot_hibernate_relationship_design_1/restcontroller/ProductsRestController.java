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

import com.springboot_hibernate_relationship_design_1.models.Products;
import com.springboot_hibernate_relationship_design_1.repository.ProductsRepository;

@RestController
@RequestMapping("/Products")
public class ProductsRestController {
	@Autowired
	private ProductsRepository prodRepo;
	@PostMapping("/")
	public Products addProduct(@RequestBody Products product ) {
		return prodRepo.save(product);
	}

	@GetMapping("/")
	public List<Products> listProduct() {
		return prodRepo.findAll();
	}

	@PutMapping("/")
	public Products updateProduct(@RequestBody Products product) {
		return prodRepo.save(product);
	}

	@DeleteMapping("/")
	public String deleteProduct(@RequestBody Products product) {
		prodRepo.delete(product);
		return "Deleted Product";
	}
}
