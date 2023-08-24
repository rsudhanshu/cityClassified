package com.example.cityclassified.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cityclassified.entities.Education;
import com.example.cityclassified.entities.User;
import com.example.cityclassified.service.EducationService;

@RestController
@RequestMapping("/educations")
public class EducationController {
	
	@Autowired
	public EducationService educationservice; 
	
	@PostMapping("/addEducation")
	public Education addEducation(@RequestBody Education education) {
		return (Education) educationservice.addEducation(education);
	}
}
