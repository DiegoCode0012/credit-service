package com.bbva.creditservice.dto.post;



import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Payment;
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring") 
public interface CreatePaymentMapper {
	CreatePaymentDTO paymentToPaymentDTO(Payment payment);

    Payment paymentDTOtoPayment(CreatePaymentDTO paymentDTO);
}
