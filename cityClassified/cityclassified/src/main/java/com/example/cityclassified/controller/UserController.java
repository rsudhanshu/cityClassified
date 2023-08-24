package com.example.cityclassified.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cityclassified.entities.User;
import com.example.cityclassified.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userservice.addUser(user);
	}
	
	@GetMapping("/allUsers")
	public List<User> getAllUsers(){
		return userservice.allUsers();
	}
}
