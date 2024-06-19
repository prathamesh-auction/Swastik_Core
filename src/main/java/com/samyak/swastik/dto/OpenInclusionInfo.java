package com.samyak.swastik.dto;

import java.io.Serializable;

public class OpenInclusionInfo implements Serializable {

	private static final long serialVersionUID = -140304868957665250L;

	private String openInclusionName;
	private String openInclusionDescription;
	private Integer srNo;

	public String getOpenInclusionName() {
		return openInclusionName;
	}

	public void setOpenInclusionName(String openInclusionName) {
		this.openInclusionName = openInclusionName;
	}

	public String getOpenInclusionDescription() {
		return openInclusionDescription;
	}

	public void setOpenInclusionDescription(String openInclusionDescription) {
		this.openInclusionDescription = openInclusionDescription;
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
