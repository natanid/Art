package com.tlevchukart.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
/* @Table(name = "customer") */
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	// address

	@OneToMany(mappedBy = "user")
	private List<Orders> orders;

	@ManyToMany
	@JoinTable(name = "item_user", joinColumns = @JoinColumn(name = "id_user"), inverseJoinColumns = @JoinColumn(name = "id_item"))
	private List<Item> items;

	public User() {
		// TODO Auto-generated constructor stub
	}

}
