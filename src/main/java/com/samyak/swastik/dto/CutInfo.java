package com.samyak.swastik.dto;

import java.io.Serializable;

public class CutInfo implements Serializable {

	private static final long serialVersionUID = 2701475035114014282L;

	private String cutName;
	private String cutDescription;
	private Integer srNo;

	public String getCutName() {
		return cutName;
	}

	public void setCutName(String cutName) {
		this.cutName = cutName;
	}

	public String getCutDescription() {
		return cutDescription;
	}

	public void setCutDescription(String cutDescription) {
		this.cutDescription = cutDescription;
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
