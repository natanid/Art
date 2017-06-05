package com.tlevchukart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoppingCart {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//title
	//address
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}
	
	
}
