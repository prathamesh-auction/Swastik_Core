package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class StatusInfo {

	private UUID statusId;
	private String statusName;
	private String statusDescription;
	private Double srNo;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Double yearEndId;
	private String statusNameNative;

	public UUID getStatusId() {
		return statusId;
	}

	public void setStatusId(UUID statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Double getSrNo() {
		return srNo;
	}

	public void setSrNo(Double srNo) {
		this.srNo = srNo;
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

	public String getStatusNameNative() {
		return statusNameNative;
	}

	public void setStatusNameNative(String statusNameNative) {
		this.statusNameNative = statusNameNative;
	}

}
