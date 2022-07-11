package com.springboot_hybernet_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_hybernet.Continent;
 
@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long>{
 
}