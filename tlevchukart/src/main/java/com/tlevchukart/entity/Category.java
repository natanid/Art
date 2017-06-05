package com.tlevchukart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoryName;
	//titles
	
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	
}
