package com.samyak.swastik.dto;

import java.util.UUID;

public class LocationInfo {

	private UUID locationId;
	private String locationCode;
	private String locationName;
	private String lotLocation;
	private String locationDescription;
	private Double srNo;
	private Double yearEndId;
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

	public Double getSrNo() {
		return srNo;
	}

	public void setSrNo(Double srNo) {
		this.srNo = srNo;
	}

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

	public String getLocationNameNative() {
		return locationNameNative;
	}

	public void setLocationNameNative(String locationNameNative) {
		this.locationNameNative = locationNameNative;
	}

	public String getLotLocation() {
		return lotLocation;
	}

	public void setLotLocation(String lotLocation) {
		this.lotLocation = lotLocation;
	}

}
