package com.example.cityclassified.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Education {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String desc;
	private String city;
	private String image;
}
