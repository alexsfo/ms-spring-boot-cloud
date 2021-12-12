package com.alexsandro.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.alexsandro.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("João", 500.00, days);
	}
	
}
