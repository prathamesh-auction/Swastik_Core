package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.CutHS;

public interface CutHSRepository extends JpaRepository<CutHS, Long> {

	public List<CutHS> findAllByActive(Boolean active);
}
