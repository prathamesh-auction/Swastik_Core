package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.TableIncusionInfo;

public interface ITableIncusion {

	public List<TableIncusionInfo> get();

	public void save(TableIncusionInfo tableIncusionInfo);
}
