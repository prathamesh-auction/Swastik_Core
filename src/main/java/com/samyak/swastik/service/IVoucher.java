package com.samyak.swastik.service;

import com.samyak.swastik.dto.VoucherInfo;

public interface IVoucher {

	public String get();

	public void save(VoucherInfo voucherInfo);
}
