package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Polish;

public interface PolishRepository extends JpaRepository<Polish, Long> {

	public List<Polish> findAllByActive(Boolean active);
}
