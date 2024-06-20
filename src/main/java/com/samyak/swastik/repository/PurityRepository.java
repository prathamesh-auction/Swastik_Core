package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Purity;

public interface PurityRepository extends JpaRepository<Purity, Long> {

	public List<Purity> findAllByActive(Boolean active);
}
