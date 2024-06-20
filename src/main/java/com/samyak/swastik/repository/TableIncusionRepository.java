package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.TableIncusion;

public interface TableIncusionRepository extends JpaRepository<TableIncusion, Long> {

	public List<TableIncusion> findAllByActive(Boolean active);
}
