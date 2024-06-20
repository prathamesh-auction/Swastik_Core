package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.CutEX;

public interface CutEXRepository extends JpaRepository<CutEX, Long> {

	public List<CutEX> findAllByActive(Boolean active);
}
