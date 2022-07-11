package com.springboot_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_task.models.Teachers;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers, Long>{

}
