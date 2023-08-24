package com.example.cityclassified.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId", length = 10, nullable=false)
	private int id;
	
	@Column(name="userName", length = 30, nullable=false)
	private String name;
	
	@Column(name="userEmail", length = 30, nullable=false)
	private String email;
}
