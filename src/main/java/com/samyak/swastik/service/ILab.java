package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.LabInfo;

public interface ILab {

	public List<LabInfo> get();

	public void save(LabInfo labInfo);
}
