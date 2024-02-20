package com.bbva.creditservice.service;



import com.bbva.creditservice.dto.ClientDTO;
import com.bbva.creditservice.entity.Client;

public interface IClientService {
public ClientDTO buscarCliente(Long id);
public Client buscarxDni(Integer id);
}
