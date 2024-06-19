package com.samyak.swastik.dto;

import java.io.Serializable;

public class PolishInfo implements Serializable {

	private static final long serialVersionUID = -6078365666568743548L;

	private String polishName;
	private String polishDescription;
	private Integer srNo;

	public String getPolishName() {
		return polishName;
	}

	public void setPolishName(String polishName) {
		this.polishName = polishName;
	}

	public String getPolishDescription() {
		return polishDescription;
	}

	public void setPolishDescription(String polishDescription) {
		this.polishDescription = polishDescription;
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
