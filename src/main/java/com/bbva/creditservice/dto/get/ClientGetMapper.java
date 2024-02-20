package com.bbva.creditservice.dto.get;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Client;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ClientGetMapper {
	ClientGetDTO clientToClientGetDto(Client client);
	Client clientGetDtoClient (ClientGetDTO ClientGettDTO);
	
}
