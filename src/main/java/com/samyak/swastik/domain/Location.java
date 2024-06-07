package com.samyak.swastik.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MASTER_LOCATION")
public class Location implements Serializable {

	private static final long serialVersionUID = 5494049939047157500L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LOCATION_ID")
	private UUID locationId;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "LOCATION_CODE")
	private String locationCode;

	@Column(name = "LOCATION_NAME")
	private String locationName;

	@Column(name = "LOCATION_DESCRIPTION")
	private String locationDescription;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp ModifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "SR_NO")
	private Double srNo;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	@Column(name = "LOCATION_NAME_NATIVE")
	private String locationNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getLocationId() {
		return locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
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

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedOn() {
		return ModifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		ModifiedOn = modifiedOn;
	}

	public String getModifiedMachineName() {
		return modifiedMachineName;
	}

	public void setModifiedMachineName(String modifiedMachineName) {
		this.modifiedMachineName = modifiedMachineName;
	}

	public Double getSrNo() {
		return srNo;
	}

	public void setSrNo(Double srNo) {
		this.srNo = srNo;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

}
