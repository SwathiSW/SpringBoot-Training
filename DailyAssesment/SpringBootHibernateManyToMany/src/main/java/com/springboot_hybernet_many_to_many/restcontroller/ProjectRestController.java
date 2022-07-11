package com.springboot_hybernet_many_to_many.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_hybernet_many_to_many.model.Project;
import com.springboot_hybernet_many_to_many.repository.ProjectRepository;

@RestController
@RequestMapping("/project")
public class ProjectRestController {
	@Autowired
	private ProjectRepository prjctRepo;

	@PostMapping("/")
	public Project addProject(@RequestBody Project prjt) {
		return prjctRepo.save(prjt);
	}

	@GetMapping("/")
	public List<Project> listProjects() {
		return prjctRepo.findAll();
	}

	@PutMapping("/")
	public Project updateProject(@RequestBody Project prjt) {
		return prjctRepo.save(prjt);
	}
	
	@DeleteMapping("/")
	public String deleteProject(@RequestBody Project prjt) {
		prjctRepo.delete(prjt);
		return "Project Data Deleted";
	}
}
