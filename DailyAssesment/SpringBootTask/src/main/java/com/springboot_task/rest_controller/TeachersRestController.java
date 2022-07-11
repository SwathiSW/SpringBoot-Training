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

import com.springboot_task.models.Teachers;
import com.springboot_task.repository.TeachersRepository;

@RestController
@RequestMapping("/teacher")
public class TeachersRestController {

	@Autowired
	private TeachersRepository teachersRepository;
	
	@PostMapping("/create")
	public Teachers createTeacher(@RequestBody Teachers teacher) {
		return teachersRepository.save(teacher);
	}
	
	@GetMapping("/list")
	public List<Teachers> listTeachers(){
		return teachersRepository.findAll();
	}
	
	@PutMapping("/update")
	public Teachers updateTeacher(@RequestBody Teachers teacher) {
		return teachersRepository.save(teacher);
	}
	
	@DeleteMapping("/delete")
	public String deleteTeacher(@RequestBody Teachers teacher) {
		teachersRepository.delete(teacher);
		return "Deleted Teacher Record";
	}
}
