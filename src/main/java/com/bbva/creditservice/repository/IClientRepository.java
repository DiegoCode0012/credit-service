package com.bbva.creditservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbva.creditservice.entity.Client;

public interface IClientRepository extends JpaRepository<Client, Long>{
public Client findByDni(Integer dni);
}
