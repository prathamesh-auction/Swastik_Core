package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.PurchaseSaleGroup;
import com.samyak.swastik.dto.PurchaseSaleGroupInfo;
import com.samyak.swastik.repository.PurchaseSaleGroupRepository;

@Service("")
public class PurchaseSaleGroupService implements IPurchaseSaleGroup {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private PurchaseSaleGroupRepository purchaseSaleGroupRepository;

	@Override
	public List<PurchaseSaleGroupInfo> get() {
		List<PurchaseSaleGroup> purchaseSaleGroups = purchaseSaleGroupRepository.findAllByActive(true);
		return purchaseSaleGroups.stream().map(e -> modelMapper.map(e, PurchaseSaleGroupInfo.class)).toList();
	}

	@Override
	public Optional<PurchaseSaleGroup> getPurchaseSaleGroupId(String purchaseSaleGroupName) {
		Optional<PurchaseSaleGroup> saleGroupName = purchaseSaleGroupRepository
				.getByActiveAndPurchaseSaleGroupName(true, purchaseSaleGroupName);
		return saleGroupName;
	}

}
