package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.TableIncusion;
import com.samyak.swastik.dto.TableIncusionInfo;
import com.samyak.swastik.repository.TableIncusionRepository;

@Service("tableIncusionService")
public class TableIncusionService implements ITableIncusion {

	@Autowired
	private TableIncusionRepository tableIncusionRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<TableIncusionInfo> get() {
		List<TableIncusion> tableIncusions = tableIncusionRepository.findAllByActive(true);
		List<TableIncusionInfo> tableIncusionInfos = new ArrayList<>();
		tableIncusions.forEach(tableIncusion -> {
			TableIncusionInfo tableIncusionInfo = modelMapper.map(tableIncusion, TableIncusionInfo.class);
			tableIncusionInfos.add(tableIncusionInfo);
		});
		return tableIncusionInfos;
	}

	@Override
	public void save(TableIncusionInfo tableIncusionInfo) {
		TableIncusion tableIncusion = modelMapper.map(tableIncusionInfo, TableIncusion.class);
		tableIncusion.setTableIncusionId(UUID.randomUUID());
		tableIncusionRepository.save(tableIncusion);

	}

}
