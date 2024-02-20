package com.bbva.creditservice.dto;



import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Payment;
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring") 
public interface PaymentMapper {
	PaymentDTO paymentToPaymentDTO(Payment payment);

    Payment paymentDTOtoPayment(PaymentDTO paymentDTO);
}
