package com.bbva.creditservice.dto.post;



import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Credit;
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CreateCreditMapper {

	    CreateCreditDTO creditToCreditDTO(Credit credit);

	    Credit creditDtoCredit(CreateCreditDTO creditDTO);
}
