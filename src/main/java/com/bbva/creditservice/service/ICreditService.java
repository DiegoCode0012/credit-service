package com.bbva.creditservice.service;


import java.util.List;

import com.bbva.creditservice.dto.post.CreateCreditDTO;
import com.bbva.creditservice.entity.Credit;

public interface ICreditService {
	public Credit buscarCredito(Long id); //devolver CreditDTO
	public CreateCreditDTO solicitarCredito(CreateCreditDTO credit); //devolver CreditDTO, parametros
	public List<CreateCreditDTO> listarCreditoDelCliente(Long id);
	}
