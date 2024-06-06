package com.samyak.swastik.dto;

import java.util.UUID;

public class LocationInfo {

	private UUID locationId;
	private String locationCode;
	private String locationName;
	private String locationDescription;
	private Integer srNo;
	private Integer yearEndId;
	private String locationNameNative;

	public UUID getLocationId() {
		return locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
		this.yearEndId = yearEndId;
	}

	public String getLocationNameNative() {
		return locationNameNative;
	}

	public void setLocationNameNative(String locationNameNative) {
		this.locationNameNative = locationNameNative;
	}

}
