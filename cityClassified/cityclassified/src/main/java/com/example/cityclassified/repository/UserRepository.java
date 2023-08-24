package com.example.cityclassified.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cityclassified.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
