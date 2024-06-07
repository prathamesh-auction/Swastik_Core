package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.PurchaseSaleGroup;
import java.util.List;

public interface PurchaseSaleGroupRepository extends JpaRepository<PurchaseSaleGroup, Long> {

	public List<PurchaseSaleGroup> findAllByActive(Boolean active);
}
