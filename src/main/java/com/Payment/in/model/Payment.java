package com.Payment.in.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int payment_id;
	
	
	@Column
	@Enumerated(EnumType.STRING)
	private PaymentStatus PaymentStatus;
	
	@Column
	String transactionId;
	
	
	@Column
	@CreationTimestamp 
	Timestamp timestamp;
	
	@Column
	int orderId;
	
	@Column
	double amount;
	

}
