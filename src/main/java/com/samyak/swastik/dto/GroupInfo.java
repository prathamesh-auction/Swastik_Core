package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class GroupInfo {

	private UUID groupId;
	private UUID lotCategoryId;
	private UUID companyId;
	private UUID lotSubCategoryId;
	private String groupName;
	private String groupDescription;
	private Double srNo;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Double yearEndId;

	public UUID getGroupId() {
		return groupId;
	}

	public void setGroupId(UUID groupId) {
		this.groupId = groupId;
	}

	public UUID getLotCategoryId() {
		return lotCategoryId;
	}

	public void setLotCategoryId(UUID lotCategoryId) {
		this.lotCategoryId = lotCategoryId;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public UUID getLotSubCategoryId() {
		return lotSubCategoryId;
	}

	public void setLotSubCategoryId(UUID lotSubCategoryId) {
		this.lotSubCategoryId = lotSubCategoryId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
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

}
