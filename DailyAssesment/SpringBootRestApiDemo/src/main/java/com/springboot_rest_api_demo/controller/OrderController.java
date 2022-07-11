package com.springboot_rest_api_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest_api_demo.model.Order;
import com.springboot_rest_api_demo.repository.OrderRepository;

@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepo;
	
	@PostMapping("/order/create")
	public Order createOrder (@RequestBody Order o) {
		return orderRepo.save(o);
	}
	
	@GetMapping("/order/{id}")
	public Order listOrder(long id) {
		return orderRepo.findById(id).get();
	}
	
	@PutMapping("/order/update")
	public Order updateOrder(@RequestBody Order o) {
		return orderRepo.save(o);
	}
	
	@DeleteMapping("/order/delete") 
	public String deleteOrder (@RequestBody Order o) {
		orderRepo.delete(o);
		return "Deleted Order " + o.getOrderName();
	}

}
