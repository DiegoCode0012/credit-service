package com.bbva.creditservice.service;



import com.bbva.creditservice.dto.get.ClientGetDTO;
import com.bbva.creditservice.entity.Client;

public interface IClientService {
public ClientGetDTO buscarCliente(Long id);
public Client buscarxDni(Integer id);
}
