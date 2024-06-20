package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Lab;

public interface LabRepository extends JpaRepository<Lab, Long> {

	public List<Lab> findAllByActive(Boolean active);
}
