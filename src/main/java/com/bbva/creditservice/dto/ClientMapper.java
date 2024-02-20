package com.bbva.creditservice.dto;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Client;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ClientMapper {


    ClientDTO clientToClientDto(Client client);

    Client clientDtoClient(ClientDTO clientDTO);
}
