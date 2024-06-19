package com.samyak.swastik.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Voucher;
import com.samyak.swastik.dto.VoucherInfo;
import com.samyak.swastik.repository.VoucherRepository;

@Service
public class VoucherService implements IVoucher {

	@Autowired
	private VoucherRepository voucherRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String get() {
		Voucher lastVoucherNo = voucherRepository.findTopByOrderByIdDesc();
		String newVoucherNo;
		if (lastVoucherNo != null) {
			newVoucherNo = String.valueOf(Integer.parseInt(lastVoucherNo.getVoucherNo()) + 1);

		} else {
			newVoucherNo = "1";
		}

		return newVoucherNo;
	}

	@Override
	public Voucher save(VoucherInfo voucherInfo) {
		Voucher voucher = modelMapper.map(voucherInfo, Voucher.class);
		voucher.setVoucherId(UUID.randomUUID());
		return voucherRepository.save(voucher);

	}

	@Override
	public Integer voucherNoCount() {
		List<Voucher> vouchers = voucherRepository.getAllByActive(true);
		return vouchers.size();
	}
}
