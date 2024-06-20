package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.OriginColor;

public interface OriginColorRepository extends JpaRepository<OriginColor, Long> {

	public List<OriginColor> findAllByActive(Boolean active);
}
