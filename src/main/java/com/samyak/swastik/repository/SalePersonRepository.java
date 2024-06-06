package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.SalePerson;

public interface SalePersonRepository extends JpaRepository<SalePerson, Long> {

}
