package com.Payment.in.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Payment.in.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{
	

}
