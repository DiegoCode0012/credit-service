package com.bbva.creditservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbva.creditservice.entity.Payment;

public interface IPaymentRepository extends JpaRepository<Payment, Long>{

}
