package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.ExchangeRate;
import java.util.List;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

	public List<ExchangeRate> findAllByActive(Boolean active);
}
