package com.tlevchukart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentMethodDirectBankTransfer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public PaymentMethodDirectBankTransfer() {
		// TODO Auto-generated constructor stub
	}
}
