package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.OpenInclusion;

public interface OpenInclusionRepository extends JpaRepository<OpenInclusion, Long> {

	public List<OpenInclusion> findAllByActive(Boolean active);
}
