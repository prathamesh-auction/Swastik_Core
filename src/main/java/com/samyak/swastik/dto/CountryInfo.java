package com.samyak.swastik.dto;

import java.io.Serializable;

public class CountryInfo implements Serializable {

	private static final long serialVersionUID = 5045833422255292606L;

	private String countryName;
	private String countryDescription;
	private Integer srNo;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryDescription() {
		return countryDescription;
	}

	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
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
