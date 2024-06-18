package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import com.samyak.swastik.domain.PurchaseSaleGroup;
import com.samyak.swastik.dto.PurchaseSaleGroupInfo;

public interface IPurchaseSaleGroup {

	public List<PurchaseSaleGroupInfo> get();
	
	public Optional<PurchaseSaleGroup> getPurchaseSaleGroupId(String purchaseSaleGroupName);
}
