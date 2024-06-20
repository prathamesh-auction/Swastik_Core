package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Supplier;
import com.samyak.swastik.dto.SupplierInfo;
import com.samyak.swastik.repository.SupplierRepository;

@Service
public class SupplierService implements ISupplier {

	@Autowired
	private SupplierRepository supplierRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<SupplierInfo> get() {
		List<Supplier> suppliers = supplierRepository.findAllByActive(true);
		List<SupplierInfo> supplierInfos = new ArrayList<>();
		suppliers.forEach(supplier -> {
			SupplierInfo supplierInfo = modelMapper.map(supplier, SupplierInfo.class);
			supplierInfos.add(supplierInfo);
		});
		return supplierInfos;
	}

}
