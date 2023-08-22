package com.example.cityclassified.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cityclassified.entities.User;
import com.example.cityclassified.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return
		
	}
	
	public User getUsers() {
		
	}

}
