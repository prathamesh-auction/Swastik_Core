package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
