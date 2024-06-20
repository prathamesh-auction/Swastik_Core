package com.samyak.swastik.dto;

import java.io.Serializable;

public class SizeInfo implements Serializable {

	private static final long serialVersionUID = 2897233989138369091L;

	private String sizeName;
	private String sizeDescription;
	private Integer srNo;

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	public String getSizeDescription() {
		return sizeDescription;
	}

	public void setSizeDescription(String sizeDescription) {
		this.sizeDescription = sizeDescription;
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
