package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Lot;

public interface LotRepository extends JpaRepository<Lot, Long> {

}
