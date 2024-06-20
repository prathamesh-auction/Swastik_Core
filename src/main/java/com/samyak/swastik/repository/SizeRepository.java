package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Size;

public interface SizeRepository extends JpaRepository<Size, Long> {

	public List<Size> findAllByActive(Boolean active);
}
