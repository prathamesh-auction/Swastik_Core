package com.samyak.swastik.dto;

import java.io.Serializable;

public class LusterInfo implements Serializable {

	private static final long serialVersionUID = 3229953786575052369L;

	private String lusterName;
	private String lusterDescription;
	private Integer srNo;

	public String getLusterName() {
		return lusterName;
	}

	public void setLusterName(String lusterName) {
		this.lusterName = lusterName;
	}

	public String getLusterDescription() {
		return lusterDescription;
	}

	public void setLusterDescription(String lusterDescription) {
		this.lusterDescription = lusterDescription;
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
