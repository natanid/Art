package com.tlevchukart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tlevchukart.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
