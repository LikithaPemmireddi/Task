package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Std")
public class Std {
	@Id
	private int stdId;
	private String stdName;
	private String stdDept;
	
	
	

}
