package com.example.cityclassified.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cityclassified.entities.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer>{

}
