package com.samyak.swastik.dto;

import java.io.Serializable;

public class BlackInclusionInfo implements Serializable {

	private static final long serialVersionUID = -6375599673806867266L;

	private String blackInclusionName;
	private String blackInclusionDescription;
	private Integer srNo;

	public String getBlackInclusionName() {
		return blackInclusionName;
	}

	public void setBlackInclusionName(String blackInclusionName) {
		this.blackInclusionName = blackInclusionName;
	}

	public String getBlackInclusionDescription() {
		return blackInclusionDescription;
	}

	public void setBlackInclusionDescription(String blackInclusionDescription) {
		this.blackInclusionDescription = blackInclusionDescription;
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
