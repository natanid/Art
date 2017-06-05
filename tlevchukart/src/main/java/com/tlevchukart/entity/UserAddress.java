package com.tlevchukart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAddress {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//country
	private String userPostCode;
	private String userCity;
	private String userStreet;
	private String userHouseNumber;
	private String userFlatNumber;
	
	public UserAddress() {
		// TODO Auto-generated constructor stub
	}
}
