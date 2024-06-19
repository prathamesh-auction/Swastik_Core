package com.samyak.swastik.dto;

import java.io.Serializable;

public class PurityInfo implements Serializable {

	private static final long serialVersionUID = -8263306463348114091L;

	private String purityName;
	private String purityDescription;
	private Integer srNo;

	public String getPurityName() {
		return purityName;
	}

	public void setPurityName(String purityName) {
		this.purityName = purityName;
	}

	public String getPurityDescription() {
		return purityDescription;
	}

	public void setPurityDescription(String purityDescription) {
		this.purityDescription = purityDescription;
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
