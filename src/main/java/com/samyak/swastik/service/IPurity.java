package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.PurityInfo;

public interface IPurity {

	public List<PurityInfo> get();
	
	public void save(PurityInfo purityInfo);
}
