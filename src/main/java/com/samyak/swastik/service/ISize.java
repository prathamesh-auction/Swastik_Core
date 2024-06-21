package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.SizeInfo;

public interface ISize {

	public List<SizeInfo> get();

	public void save(SizeInfo sizeInfo);
}
