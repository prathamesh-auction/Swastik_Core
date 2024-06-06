package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Currency;
import java.util.List;
import java.util.UUID;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

	public List<Currency> findAllByActive(Boolean active);

	public List<Currency> getByActiveAndCurrencyId(Boolean active, UUID currencyId);

}
