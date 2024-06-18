package com.samyak.swastik.service;

import com.samyak.swastik.dto.SaleWindowInfo;
import com.samyak.swastik.dto.SaleWindowSaveInfo;

public interface ISaleWindow {

	public void save(SaleWindowSaveInfo saleWindowSaveInfo);

	public SaleWindowInfo get();

}
