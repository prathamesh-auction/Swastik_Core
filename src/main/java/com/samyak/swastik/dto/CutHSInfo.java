package com.samyak.swastik.dto;

import java.io.Serializable;

public class CutHSInfo implements Serializable {

	private static final long serialVersionUID = -578509821367239862L;
	private String cutHSName;
	private String cutHSDescription;
	private Integer srNo;

	public String getCutHSName() {
		return cutHSName;
	}

	public void setCutHSName(String cutHSName) {
		this.cutHSName = cutHSName;
	}

	public String getCutHSDescription() {
		return cutHSDescription;
	}

	public void setCutHSDescription(String cutHSDescription) {
		this.cutHSDescription = cutHSDescription;
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
