package com.bbva.creditservice.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bbva.creditservice.dto.get.ClientGetDTO;
import com.bbva.creditservice.dto.get.ClientGetMapper;
import com.bbva.creditservice.entity.Client;
import com.bbva.creditservice.repository.IClientRepository;

@Service
public class ClientServiceImp implements IClientService{

@Autowired
private IClientRepository clientRepository;

@Autowired
private ClientGetMapper clientGetMapper;

	@Transactional
	@Override
	public ClientGetDTO buscarCliente(Long id) { //ClientDTO
		Client client=clientRepository.findById(id).orElse(null);
		if(client==null) {
			return null;
		}
		ClientGetDTO clientGetDTO =clientGetMapper.clientToClientGetDto(client);
		return clientGetDTO;
	}

	@Override
	public Client buscarxDni(Integer dni) {
		return clientRepository.findByDni(dni);
	}



}
