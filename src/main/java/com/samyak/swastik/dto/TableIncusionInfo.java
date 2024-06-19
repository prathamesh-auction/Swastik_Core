package com.samyak.swastik.dto;

import java.io.Serializable;

public class TableIncusionInfo implements Serializable {

	private static final long serialVersionUID = 1429756312469891763L;

	private String tableIncusionName;
	private String tableIncusionDescription;
	private Integer srNo;

	public String getTableIncusionName() {
		return tableIncusionName;
	}

	public void setTableIncusionName(String tableIncusionName) {
		this.tableIncusionName = tableIncusionName;
	}

	public String getTableIncusionDescription() {
		return tableIncusionDescription;
	}

	public void setTableIncusionDescription(String tableIncusionDescription) {
		this.tableIncusionDescription = tableIncusionDescription;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
