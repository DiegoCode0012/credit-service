package com.bbva.creditservice.dto.post;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bbva.creditservice.entity.Client;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CreateClientMapper {


    CreateClientDTO clientToClientDto(Client client);

    Client clientDtoClient(CreateClientDTO clientDTO);
}
