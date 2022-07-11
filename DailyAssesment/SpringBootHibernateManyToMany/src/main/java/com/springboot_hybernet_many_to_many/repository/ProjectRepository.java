package com.springboot_hybernet_many_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_hybernet_many_to_many.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
