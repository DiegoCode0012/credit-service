package com.bbva.creditservice.service;


import com.bbva.creditservice.dto.PaymentDTO;

public interface IPaymentService {

	public PaymentDTO createNewPayment(PaymentDTO payment);
}
