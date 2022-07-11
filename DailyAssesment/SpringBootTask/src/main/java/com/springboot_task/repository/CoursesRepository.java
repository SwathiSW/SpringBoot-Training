package com.springboot_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_task.models.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long>{

}
