package com.bbva.creditservice.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.creditservice.entity.Account;
import com.bbva.creditservice.repository.IAccountRepository;

@Service
public class IAccountServiceImp implements IAccountService{
	
		@Autowired
		private IAccountRepository accountRepository;
	
	
	@Override
	public Account buscarCuenta(Long id) {
		return accountRepository.findById(id).orElse(null);
	}

}
