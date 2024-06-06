package com.samyak.swastik.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class PurchaseSaleGroupInfo implements Serializable {

	private static final long serialVersionUID = -8872031239160162723L;

	private UUID purchaseSaleGroupId;
	private Integer purchaseSaleGroupType;
	private Integer yearEndId;
	private UUID companyId;
	private String purchaseSaleGroupName;
	private String purchaseSaleGroupCode;
	private Integer srNo;
	private Boolean active;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String modifiedMachineName;
	private String purchaseSaleGroupNameNative;

	public UUID getPurchaseSaleGroupId() {
		return purchaseSaleGroupId;
	}

	public void setPurchaseSaleGroupId(UUID purchaseSaleGroupId) {
		this.purchaseSaleGroupId = purchaseSaleGroupId;
	}

	public Integer getPurchaseSaleGroupType() {
		return purchaseSaleGroupType;
	}

	public void setPurchaseSaleGroupType(Integer purchaseSaleGroupType) {
		this.purchaseSaleGroupType = purchaseSaleGroupType;
	}

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
		this.yearEndId = yearEndId;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public String getPurchaseSaleGroupName() {
		return purchaseSaleGroupName;
	}

	public void setPurchaseSaleGroupName(String purchaseSaleGroupName) {
		this.purchaseSaleGroupName = purchaseSaleGroupName;
	}

	public String getPurchaseSaleGroupCode() {
		return purchaseSaleGroupCode;
	}

	public void setPurchaseSaleGroupCode(String purchaseSaleGroupCode) {
		this.purchaseSaleGroupCode = purchaseSaleGroupCode;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedMachineName() {
		return modifiedMachineName;
	}

	public void setModifiedMachineName(String modifiedMachineName) {
		this.modifiedMachineName = modifiedMachineName;
	}

	public String getPurchaseSaleGroupNameNative() {
		return purchaseSaleGroupNameNative;
	}

	public void setPurchaseSaleGroupNameNative(String purchaseSaleGroupNameNative) {
		this.purchaseSaleGroupNameNative = purchaseSaleGroupNameNative;
	}

}
