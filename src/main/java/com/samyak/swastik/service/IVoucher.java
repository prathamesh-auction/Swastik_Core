package com.samyak.swastik.service;

import com.samyak.swastik.domain.Voucher;
import com.samyak.swastik.dto.VoucherInfo;

public interface IVoucher {

	public String get();

	public Voucher save(VoucherInfo voucherInfo);
	
	public Integer voucherNoCount();
}
