package com.example.cityclassified.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cityclassified.entities.Education;
import com.example.cityclassified.entities.User;
import com.example.cityclassified.repository.EducationRepository;
import com.example.cityclassified.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService{
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Override
	public Education addEducation(Education education) {
		return educationRepository.save(education);
	}
}
