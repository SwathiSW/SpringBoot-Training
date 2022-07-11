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

import com.springboot_task.models.Student;
import com.springboot_task.repository.StudentsRepository;

@RestController
@RequestMapping("/student")
public class StudentsRestController {

	@Autowired
	private StudentsRepository studentsRepository;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentsRepository.save(student);
	}
	
	@GetMapping("/list")
	public List<Student> listStudents(){
		return studentsRepository.findAll();
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentsRepository.save(student);
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestBody Student student) {
		studentsRepository.delete(student);
		return "Deleted Student Record";
	}
}
