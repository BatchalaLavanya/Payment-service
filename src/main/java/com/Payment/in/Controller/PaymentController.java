package com.Payment.in.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Payment.in.model.Payment;
import com.Payment.in.service.PaymentService;


@RestController



public class PaymentController {
	
	private PaymentService paymentService;
	 @Autowired

		public void setPaymentService(PaymentService paymentService) {
			this.paymentService = paymentService;
		}
	 

	
	
	@PostMapping(value="/makePayment")
	public ResponseEntity<Payment> paymentStatus(@RequestBody Payment payment){
		return new ResponseEntity<Payment>(paymentService.makePayment(payment),HttpStatus.CREATED);
	}
	
	
	
	
	
}
