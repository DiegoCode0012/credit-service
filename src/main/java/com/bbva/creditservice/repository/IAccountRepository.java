package com.bbva.creditservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbva.creditservice.entity.Account;

public interface IAccountRepository extends JpaRepository<Account,Long>{

}
