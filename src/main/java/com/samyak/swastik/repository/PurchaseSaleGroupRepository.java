package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.PurchaseSaleGroup;
import java.util.List;
import java.util.Optional;

public interface PurchaseSaleGroupRepository extends JpaRepository<PurchaseSaleGroup, Long> {

	public List<PurchaseSaleGroup> findAllByActive(Boolean active);
	
	public Optional<PurchaseSaleGroup> getByActiveAndPurchaseSaleGroupName(Boolean active, String purchaseSaleGroupName);
}
