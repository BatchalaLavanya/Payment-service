package com.Payment.in.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Payment.in.Repository.PaymentRepository;
import com.Payment.in.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	PaymentRepository paymentRepo;
	
	
	
	
	public PaymentServiceImpl(PaymentRepository paymentRepo) {
		super();
		this.paymentRepo = paymentRepo;
	}




	@Override
	public Payment makePayment(Payment payment) {
//		payment.setTransactionId(UUID.randomUUID().toString());
//        payment.setPaymentStatus(new Random().nextBoolean()? PaymentStatus.SUCCESS:PaymentStatus.FAILED);
		return paymentRepo.save(payment);
		
	}

}
