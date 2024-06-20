package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Symmetry;

public interface SymmetryRepository extends JpaRepository<Symmetry, Long> {

	public List<Symmetry> findAllByActive(Boolean active);
}
