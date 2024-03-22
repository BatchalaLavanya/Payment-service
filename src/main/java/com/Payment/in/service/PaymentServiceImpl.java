package com.Payment.in.service;

import java.util.UUID;

import com.Payment.in.Repository.PaymentRepository;
import com.Payment.in.model.Payment;

public class PaymentServiceImpl implements PaymentService{
	
	PaymentRepository paymentRepo;
	
	
	
	@Override
	public Payment makePayment(Payment payment) {
//		payment.setTransactionId(UUID.randomUUID().toString());
//        payment.setPaymentStatus(new Random().nextBoolean()? PaymentStatus.SUCCESS:PaymentStatus.FAILED);
		return paymentRepo.save(payment);
		
	}

}
