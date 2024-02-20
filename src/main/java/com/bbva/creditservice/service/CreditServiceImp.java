package com.bbva.creditservice.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.creditservice.dto.CreditDTO;
import com.bbva.creditservice.dto.CreditMapper;
import com.bbva.creditservice.entity.Account;
import com.bbva.creditservice.entity.Client;
import com.bbva.creditservice.entity.Credit;
import com.bbva.creditservice.repository.ICreditRepository;

@Service
public class CreditServiceImp implements ICreditService{

	@Autowired
	private ICreditRepository creditRepository;

	@Autowired
	private CreditMapper credditMapper;
	

	@Autowired
	private IClientService serviceClient;
	@Override
	public CreditDTO solicitarCredito(CreditDTO creditDTO) {
		Credit credit=credditMapper.creditDtoCredit(creditDTO); //convertimos el DTO de entrada al enttity
		Integer dni=credit.getClient().getDni();
		Client 	cliente=serviceClient.buscarxDni(dni);
		if(cliente!=null) { //COMPROBAMOS SI QUE EL CLIENTE EXISTA
			credit.setClient(cliente);
		}
		
		Account account = new Account();
		account.setBalance(-creditDTO.getAmount());
		account.setState("Falta pagar el credito");
		account.setAccount_type("Corriente");
		credit.setAccount(account);	
		credit.setState("En revision");
		credit.setReturned_interest_rate(0.01);
		creditRepository.save(credit);
		return creditDTO;
	}
	
	@Override
	public Credit buscarCredito(Long id) {
		return creditRepository.findById(id).orElse(null);
	}

	@Override
	public List<CreditDTO> listarCreditoDelCliente(Long id) {
		List<Credit>creditos=creditRepository.findAll();
		return creditos.stream().filter(x->x.getClient().getClient_id()==id).map(credditMapper::creditToCreditDTO).collect(Collectors.toList());
	}
	

}
