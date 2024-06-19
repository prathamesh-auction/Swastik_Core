package com.samyak.swastik.dto;

import java.io.Serializable;

public class OriginColorInfo implements Serializable {

	private static final long serialVersionUID = 3469904834842413576L;

	private String originColorName;
	private String originColorDescription;
	private Integer srNo;

	public String getOriginColorName() {
		return originColorName;
	}

	public void setOriginColorName(String originColorName) {
		this.originColorName = originColorName;
	}

	public String getOriginColorDescription() {
		return originColorDescription;
	}

	public void setOriginColorDescription(String originColorDescription) {
		this.originColorDescription = originColorDescription;
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
