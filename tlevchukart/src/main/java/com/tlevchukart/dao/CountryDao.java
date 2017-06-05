package com.tlevchukart.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tlevchukart.entity.Country;

public interface CountryDao extends JpaRepository<Country, Integer> {

	}

