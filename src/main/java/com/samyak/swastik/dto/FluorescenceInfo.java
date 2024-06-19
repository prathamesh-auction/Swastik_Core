package com.samyak.swastik.dto;

import java.io.Serializable;

public class FluorescenceInfo implements Serializable {

	private static final long serialVersionUID = 7640980266085195396L;

	private String fluorescenceName;
	private String fluorescenceDescription;
	private Integer srNo;

	public String getFluorescenceName() {
		return fluorescenceName;
	}

	public void setFluorescenceName(String fluorescenceName) {
		this.fluorescenceName = fluorescenceName;
	}

	public String getFluorescenceDescription() {
		return fluorescenceDescription;
	}

	public void setFluorescenceDescription(String fluorescenceDescription) {
		this.fluorescenceDescription = fluorescenceDescription;
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
