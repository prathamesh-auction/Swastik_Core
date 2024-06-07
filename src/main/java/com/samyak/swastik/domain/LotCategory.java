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
@Table(name="MASTER_LOT_CATEGORY")
public class LotCategory implements Serializable {

	private static final long serialVersionUID = -1498033302268027988L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LOT_CATEGORY_ID")
	private UUID lotCategoryId;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "LOT_CATEGORY_CODE")
	private String lotCategoryCode;

	@Column(name = "LOT_CATEGORY_NAME")
	private String lotCategoryName;

	@Column(name = "LOT_CATEGORY_DESCRIPTION")
	private String lotCategoryDescription;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifeidMachineName;

	@Column(name = "SR_NO")
	private Double srNo;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	@Column(name = "LOT_CATEGORY_NAME_NATIVE")
	private String lotCategoryNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getLotCategoryNameNative() {
		return lotCategoryNameNative;
	}

	public void setLotCategoryNameNative(String lotCategoryNameNative) {
		this.lotCategoryNameNative = lotCategoryNameNative;
	}

}
