package com.springboot_hybernet_one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_hybernet_one_to_many.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{

}
