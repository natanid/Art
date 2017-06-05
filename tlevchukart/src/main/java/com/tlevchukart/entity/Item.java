package com.tlevchukart.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	private int price;
	private int quantity;
	private String description; // itemprop?
	private int stockStatus;

	@ManyToMany
	@JoinTable(name = "orders_item", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "orders_id"))
	private List<Orders> orders = new ArrayList<Orders>();

	@ManyToMany(cascade = CascadeType.REMOVE)
	@JoinTable(name = "item_user", joinColumns = @JoinColumn(name = "id_item"), inverseJoinColumns = @JoinColumn(name = "id_user"))
	private List<User> users = new ArrayList<User>();

	@ManyToMany
	@JoinTable(name = "categories_item", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "categories_id"))
	private List<Category> categories = new ArrayList<Category>();

	public Item() {
	}

	public Item(String itemName, int price, int quantity, String description, int stockStatus) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.stockStatus = stockStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(int stockStatus) {
		this.stockStatus = stockStatus;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + ", stockStatus=" + stockStatus + "]";
	}
}
