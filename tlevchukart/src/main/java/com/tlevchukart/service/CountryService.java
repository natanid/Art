package com.tlevchukart.service;

import java.util.List;

import com.tlevchukart.entity.Country;



public interface CountryService {

	void save(Country country);

	List<Country> findAll();

	Country findOne(int id);

	void delete(int id);

	void update(Country country);
	
}
