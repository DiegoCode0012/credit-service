package com.bbva.creditservice.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bbva.creditservice.dto.PaymentDTO;
import com.bbva.creditservice.dto.PaymentMapper;
import com.bbva.creditservice.entity.Credit;
import com.bbva.creditservice.entity.Payment;
import com.bbva.creditservice.repository.IPaymentRepository;

@Service
public class PaymentServiceImp implements IPaymentService{

	@Autowired
	private IPaymentRepository paymentRepository;
	@Autowired
	private PaymentMapper paymentMapper;
	@Autowired
	private ICreditService creditService;
	@Override
	public PaymentDTO createNewPayment(PaymentDTO paymentDTO) {
		
		Payment payment =paymentMapper.paymentDTOtoPayment(paymentDTO);
		Credit credit =creditService.buscarCredito(paymentDTO.getCredit_id());
		if(credit==null) {
			return null;
		//	response.put("mensaje", "credito no encontrado, porfavor digite un credito correcto a pagar");
		//	return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}	
			payment.setCredit(credit);
			paymentRepository.save(payment);
		return paymentDTO;
	}
	

}
