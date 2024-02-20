package com.bbva.creditservice.service;


import com.bbva.creditservice.dto.post.CreatePaymentDTO;

public interface IPaymentService {

	public CreatePaymentDTO createNewPayment(CreatePaymentDTO payment);
}
