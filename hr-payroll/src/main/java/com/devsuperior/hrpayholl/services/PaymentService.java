package com.devsuperior.hrpayholl.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayholl.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
	
}
