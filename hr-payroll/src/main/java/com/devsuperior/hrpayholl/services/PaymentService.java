package com.devsuperior.hrpayholl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayholl.entities.Payment;
import com.devsuperior.hrpayholl.entities.Worker;
import com.devsuperior.hrpayholl.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkerFeignClient workerFeignClient; 
	
	public Payment getPayment(long workerId, int days) {
		
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
