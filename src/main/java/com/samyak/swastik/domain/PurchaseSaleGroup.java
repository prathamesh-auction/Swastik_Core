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
@Table(name = "MASTER_PURCHASE_SALE_GROUP")
public class PurchaseSaleGroup implements Serializable {

	private static final long serialVersionUID = 9027718528459340438L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "PURCHASE_SALE_GROUP_ID")
	private UUID purchaseSaleGroupId;

	@Column(name = "PURCHASE_SALE_GROUP_TYPE")
	private Integer purchaseSaleGroupType;

	@Column(name = "YEAR_END_ID")
	private Integer yearEndId;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "PURCHASE_SALE_GROUP__NAME")
	private String purchaseSaleGroupName;

	@Column(name = "PURCHASE_SALE_GROUP__CODE")
	private String purchaseSaleGroupCode;

	@Column(name = "SR_NO")
	private Integer srNo;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "PURCHASE_SALE_GROUP_NAME_NATIVE")
	private String purchaseSaleGroupNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
