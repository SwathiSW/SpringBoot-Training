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

import com.springboot_database_design.model.Products;
import com.springboot_database_design.repository.ProductsRepository;

@RestController
@RequestMapping("/product")
public class ProductsRestController {

	@Autowired
	private ProductsRepository productsRepository;

	@PostMapping("/add")
	public Products addProduct(@RequestBody Products product) {
		return productsRepository.save(product);
	}

	@GetMapping("/list")
	public List<Products> listProducts() {
		return productsRepository.findAll();
	}

	@PutMapping("/update")
	public Products updateProduct(@RequestBody Products product) {
		return productsRepository.save(product);
	}

	@DeleteMapping("/delete")
	public String deleteProduct(@RequestBody Products product) {
		productsRepository.delete(product);
		return "Deleted Product with Id: " + Products.getSerialversionuid();
	}
}
