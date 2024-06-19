package com.samyak.swastik.dto;

import java.io.Serializable;

public class LabInfo implements Serializable {

	private static final long serialVersionUID = 4848939941283956304L;

	private String labName;
	private String labDescription;
	private Integer srNo;

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabDescription() {
		return labDescription;
	}

	public void setLabDescription(String labDescription) {
		this.labDescription = labDescription;
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
