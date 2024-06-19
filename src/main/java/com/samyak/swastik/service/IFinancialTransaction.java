package com.samyak.swastik.service;

import com.samyak.swastik.dto.FinancialTransactionInfo;

public interface IFinancialTransaction {

	public void save(FinancialTransactionInfo fInancialTransactionInfo);
	
	public Integer getFinancialTransactionCount();
}
