package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.ExchangeRate;

public interface ExchangeRepository extends JpaRepository<ExchangeRate, Long> {

}
