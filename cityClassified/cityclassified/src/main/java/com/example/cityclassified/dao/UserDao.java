package com.example.cityclassified.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cityclassified.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
