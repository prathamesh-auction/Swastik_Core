package com.samyak.swastik.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class LotCategoryInfo implements Serializable {

	private static final long serialVersionUID = -5782878263014901509L;

	private UUID lotCategoryId;
	private UUID companyId;
	private String lotCategoryCode;
	private String lotCategoryName;
	private String lotCategoryDescription;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String modifeidMachineName;
	private Integer srNo;
	private Boolean active;
	private Integer yearEndId;
	private String lotCategoryNameNative;

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

	public String getLotCategoryCode() {
		return lotCategoryCode;
	}

	public void setLotCategoryCode(String lotCategoryCode) {
		this.lotCategoryCode = lotCategoryCode;
	}

	public String getLotCategoryName() {
		return lotCategoryName;
	}

	public void setLotCategoryName(String lotCategoryName) {
		this.lotCategoryName = lotCategoryName;
	}

	public String getLotCategoryDescription() {
		return lotCategoryDescription;
	}

	public void setLotCategoryDescription(String lotCategoryDescription) {
		this.lotCategoryDescription = lotCategoryDescription;
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

	public String getModifeidMachineName() {
		return modifeidMachineName;
	}

	public void setModifeidMachineName(String modifeidMachineName) {
		this.modifeidMachineName = modifeidMachineName;
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

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
		this.yearEndId = yearEndId;
	}

	public String getLotCategoryNameNative() {
		return lotCategoryNameNative;
	}

	public void setLotCategoryNameNative(String lotCategoryNameNative) {
		this.lotCategoryNameNative = lotCategoryNameNative;
	}

}
