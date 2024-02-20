package com.bbva.creditservice.dto;



import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Credit;
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CreditMapper {

	    CreditDTO creditToCreditDTO(Credit credit);

	    Credit creditDtoCredit(CreditDTO creditDTO);
}
