package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Luster;

public interface LusterRepository extends JpaRepository<Luster, Long> {

	public List<Luster> findAllByActive(Boolean active);
}
