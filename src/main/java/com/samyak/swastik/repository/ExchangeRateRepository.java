package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.ExchangeRate;
import java.util.List;
import java.util.Optional;
import java.sql.Timestamp;


public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

	public List<ExchangeRate> findAllByActive(Boolean active);
	
	public Optional<ExchangeRate> findAllByActiveAndExchangeDate(Boolean active, Timestamp exchangeDate);
}
