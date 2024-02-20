package com.bbva.creditservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bbva.creditservice.entity.Credit;

public interface ICreditRepository extends JpaRepository<Credit, Long> {
}
