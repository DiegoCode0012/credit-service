package com.bbva.creditservice.service;


import java.util.List;

import com.bbva.creditservice.dto.CreditDTO;
import com.bbva.creditservice.entity.Credit;

public interface ICreditService {
	public Credit buscarCredito(Long id); //devolver CreditDTO
	public CreditDTO solicitarCredito(CreditDTO credit); //devolver CreditDTO, parametros
	public List<CreditDTO> listarCreditoDelCliente(Long id);
	}
