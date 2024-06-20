package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Fluorescence;

public interface FluorescenceRepository extends JpaRepository<Fluorescence, Long> {

	public List<Fluorescence> findAllByActive(Boolean active);
}
