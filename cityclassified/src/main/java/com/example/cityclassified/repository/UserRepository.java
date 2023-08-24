package com.example.cityclassified.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cityclassified.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
