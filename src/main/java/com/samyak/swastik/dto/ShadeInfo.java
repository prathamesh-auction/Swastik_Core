package com.samyak.swastik.dto;

import java.io.Serializable;

public class ShadeInfo implements Serializable {

	private static final long serialVersionUID = -3629142865135961897L;

	private String shadeName;
	private String shadeDescription;
	private Integer srNo;

	public String getShadeName() {
		return shadeName;
	}

	public void setShadeName(String shadeName) {
		this.shadeName = shadeName;
	}

	public String getShadeDescription() {
		return shadeDescription;
	}

	public void setShadeDescription(String shadeDescription) {
		this.shadeDescription = shadeDescription;
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
