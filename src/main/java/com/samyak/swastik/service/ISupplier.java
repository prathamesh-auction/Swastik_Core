package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.SupplierInfo;

public interface ISupplier {

	public List<SupplierInfo> get();

	public void save(SupplierInfo supplierInfo);
}
