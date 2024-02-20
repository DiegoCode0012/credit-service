package com.bbva.creditservice.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.creditservice.dto.ClientDTO;
import com.bbva.creditservice.dto.ClientMapper;
import com.bbva.creditservice.entity.Client;
import com.bbva.creditservice.repository.IClientRepository;

@Service
public class ClientServiceImp implements IClientService{

@Autowired
private IClientRepository clientRepository;

@Autowired
private ClientMapper clientMapper;

	@Override
	public ClientDTO buscarCliente(Long id) { //ClientDTO
		Client client=clientRepository.findById(id).orElse(null);
		if(client==null) {
			return null;
		}
		ClientDTO clientDTO =clientMapper.clientToClientDto(client);
		return clientDTO;
	}

	@Override
	public Client buscarxDni(Integer dni) {
		return clientRepository.findByDni(dni);
	}



}
