package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.SymmetryInfo;

public interface ISymmetry {

	public List<SymmetryInfo> get();

	public void save(SymmetryInfo symmetryInfo);
}
