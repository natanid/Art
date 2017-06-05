package com.tlevchukart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tlevchukart.entity.Checkout;

public interface CheckoutDao extends JpaRepository<Checkout, Integer>{

}
