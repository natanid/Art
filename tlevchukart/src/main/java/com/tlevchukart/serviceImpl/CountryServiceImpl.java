package com.tlevchukart.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlevchukart.dao.CountryDao;
import com.tlevchukart.entity.Country;
import com.tlevchukart.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao countryDao;
	
	public void save(Country country) {
		country.setCountryName(country.getCountryName().toUpperCase());
		countryDao.save(country);
	}

	public List<Country> findAll() {
		return countryDao.findAll();
	}

	public Country findOne(int id) {
		return countryDao.findOne(id);
	}

	public void delete(int id) {
		countryDao.delete(id);
	}

	public void update(Country country) {
		countryDao.save(country);
	}

	
	
	
	
}
