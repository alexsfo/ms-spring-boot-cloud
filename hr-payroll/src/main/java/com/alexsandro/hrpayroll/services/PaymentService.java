package com.alexsandro.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alexsandro.hrpayroll.entities.Payment;
import com.alexsandro.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;

	public Payment getPayment(Long workerId, int days) {
		
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("id", workerId.toString());
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}",  Worker.class, uriVariables);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
