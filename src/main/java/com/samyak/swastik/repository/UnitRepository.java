package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long> {

	public List<Unit> findAllByActive(Boolean active);
}
