package com.springboot_task.rest_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_task.models.Courses;
import com.springboot_task.repository.CoursesRepository;

@RestController
@RequestMapping("/course")
public class CoursesRestController {

	@Autowired
	private CoursesRepository coursesRepository;
	
	@PostMapping("/create")
	public Courses createCourse(@RequestBody Courses course) {
		return coursesRepository.save(course);
	}
	
	@GetMapping("/list")
	public List<Courses> listCourses(){
		return coursesRepository.findAll();
	}
	
	@PutMapping("/update")
	public Courses updateCourses(@RequestBody Courses course) {
		return coursesRepository.save(course);
	}
	
	@DeleteMapping("/delete")
	public String deleteCourse(@RequestBody Courses course) {
		coursesRepository.delete(course);
		return "Deleted Course Record";
	}
}