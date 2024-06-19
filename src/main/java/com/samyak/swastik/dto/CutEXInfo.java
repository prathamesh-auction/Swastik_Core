package com.samyak.swastik.dto;

import java.io.Serializable;

public class CutEXInfo implements Serializable {

	private static final long serialVersionUID = 1633290426539007418L;
	private String cutEXName;
	private String cutEXDescription;
	private Integer srNo;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCutEXName() {
		return cutEXName;
	}

	public void setCutEXName(String cutEXName) {
		this.cutEXName = cutEXName;
	}

	public String getCutEXDescription() {
		return cutEXDescription;
	}

	public void setCutEXDescription(String cutEXDescription) {
		this.cutEXDescription = cutEXDescription;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

}
