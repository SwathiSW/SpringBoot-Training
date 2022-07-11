package com.springboot_hybernet_one_to_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_hybernet_one_to_one.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{

}
