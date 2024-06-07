package com.samyak.swastik.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.InvoiceType;
import com.samyak.swastik.dto.InvoiceTypeInfo;
import com.samyak.swastik.repository.InvoiceRepository;

@Service("")
public class InvoiceTypeService implements IInvoiceType {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private InvoiceRepository invoiceRepository;

	@Override
	public List<InvoiceTypeInfo> get() {
		List<InvoiceType> invoiceTypes = invoiceRepository.findAllByActive(true);
		return invoiceTypes.stream().map(e -> modelMapper.map(e, InvoiceTypeInfo.class)).toList();
	}

}
