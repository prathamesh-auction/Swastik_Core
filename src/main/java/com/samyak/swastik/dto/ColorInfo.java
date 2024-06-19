package com.samyak.swastik.dto;

import java.io.Serializable;

public class ColorInfo implements Serializable {

	private static final long serialVersionUID = 1199712891247569066L;

	private String colorName;
	private String colorDescription;
	private Integer srNo;

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorDescription() {
		return colorDescription;
	}

	public void setColorDescription(String colorDescription) {
		this.colorDescription = colorDescription;
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
