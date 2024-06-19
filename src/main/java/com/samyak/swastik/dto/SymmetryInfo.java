package com.samyak.swastik.dto;

import java.io.Serializable;

public class SymmetryInfo implements Serializable {

	private static final long serialVersionUID = -2137214395263357662L;

	private String symmetryName;
	private String symmetryDescription;
	private Integer srNo;

	public String getSymmetryName() {
		return symmetryName;
	}

	public void setSymmetryName(String symmetryName) {
		this.symmetryName = symmetryName;
	}

	public String getSymmetryDescription() {
		return symmetryDescription;
	}

	public void setSymmetryDescription(String symmetryDescription) {
		this.symmetryDescription = symmetryDescription;
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
