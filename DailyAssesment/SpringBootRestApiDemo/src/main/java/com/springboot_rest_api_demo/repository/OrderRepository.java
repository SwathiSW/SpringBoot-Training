package com.springboot_rest_api_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_rest_api_demo.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
