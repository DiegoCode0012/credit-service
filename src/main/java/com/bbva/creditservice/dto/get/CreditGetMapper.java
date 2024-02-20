package com.bbva.creditservice.dto.get;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Credit;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CreditGetMapper {

	CreditGetDTO creditToCreditGetDto(Credit credit);
	Credit creditGetDtoCredit (CreditGetDTO CreditGettDTO);
}
