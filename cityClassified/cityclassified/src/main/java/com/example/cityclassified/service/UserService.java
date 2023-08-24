package com.example.cityclassified.service;

import java.util.List;

import com.example.cityclassified.entities.User;

public interface UserService {
	
	User addUser(User user);
	
	List<User> allUsers();
}
