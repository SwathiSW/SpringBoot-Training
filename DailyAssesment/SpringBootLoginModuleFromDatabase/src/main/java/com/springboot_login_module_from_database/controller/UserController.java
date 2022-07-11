package com.springboot_login_module_from_database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot_login_module_from_database.model.CompanyUser;
import com.springboot_login_module_from_database.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/index")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/signup")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new CompanyUser());

		return "signup";
	}

	@PostMapping("/registrationsuccess")
	public String processRegister(CompanyUser user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		userRepo.save(user);
		System.out.println(user.getUsername());
		return "registrationsuccess";
	}

	@GetMapping("/users")
	public String listUsers(Model model) {
		List<CompanyUser> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);

		return "listusers";
	}

}
