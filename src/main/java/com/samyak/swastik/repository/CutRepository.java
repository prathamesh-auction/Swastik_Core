package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Cut;

public interface CutRepository extends JpaRepository<Cut, Long> {

	public List<Cut> findAllByActive(Boolean active);
}
