package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Supplier;
import com.samyak.swastik.dto.SupplierInfo;
import com.samyak.swastik.repository.SupplierRepository;

@Service("supplierService")
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

	@Override
	public void save(SupplierInfo supplierInfo) {
		Supplier supplier = modelMapper.map(supplierInfo, Supplier.class);
		supplier.setSupplierId(UUID.randomUUID());
		supplierRepository.save(supplier);

	}

}
