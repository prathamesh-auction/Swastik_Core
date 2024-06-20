package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	public List<Country> findAllByActive(Boolean active);
}
