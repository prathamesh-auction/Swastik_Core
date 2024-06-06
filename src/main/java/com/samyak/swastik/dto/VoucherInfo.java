package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class VoucherInfo {

	private UUID voucherId;
	private UUID companyId;
	private Integer voucherType;
	private String voucherNo;
	private Timestamp voucherDate;
	private Integer toByNos;
	private Integer voucherCurrency;
	private Integer exchangeRate;
	private Integer voucherTotal;
	private Integer localTotal;
	private Integer dollarTotal;
	private String description;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private UUID referenceVoucherId;
	private Boolean active;
	private UUID costHeadGroupId;
	private UUID costHeadSubGroupID;
	private UUID reconcilationDate;
	private Integer yearEndID;
	private String refNo;

	public UUID getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(UUID voucherId) {
		this.voucherId = voucherId;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public Integer getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(Integer voucherType) {
		this.voucherType = voucherType;
	}

	public String getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public Timestamp getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(Timestamp voucherDate) {
		this.voucherDate = voucherDate;
	}

	public Integer getToByNos() {
		return toByNos;
	}

	public void setToByNos(Integer toByNos) {
		this.toByNos = toByNos;
	}

	public Integer getVoucherCurrency() {
		return voucherCurrency;
	}

	public void setVoucherCurrency(Integer voucherCurrency) {
		this.voucherCurrency = voucherCurrency;
	}

	public Integer getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Integer exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Integer getVoucherTotal() {
		return voucherTotal;
	}

	public void setVoucherTotal(Integer voucherTotal) {
		this.voucherTotal = voucherTotal;
	}

	public Integer getLocalTotal() {
		return localTotal;
	}

	public void setLocalTotal(Integer localTotal) {
		this.localTotal = localTotal;
	}

	public Integer getDollarTotal() {
		return dollarTotal;
	}

	public void setDollarTotal(Integer dollarTotal) {
		this.dollarTotal = dollarTotal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public UUID getReferenceVoucherId() {
		return referenceVoucherId;
	}

	public void setReferenceVoucherId(UUID referenceVoucherId) {
		this.referenceVoucherId = referenceVoucherId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public UUID getCostHeadGroupId() {
		return costHeadGroupId;
	}

	public void setCostHeadGroupId(UUID costHeadGroupId) {
		this.costHeadGroupId = costHeadGroupId;
	}

	public UUID getCostHeadSubGroupID() {
		return costHeadSubGroupID;
	}

	public void setCostHeadSubGroupID(UUID costHeadSubGroupID) {
		this.costHeadSubGroupID = costHeadSubGroupID;
	}

	public UUID getReconcilationDate() {
		return reconcilationDate;
	}

	public void setReconcilationDate(UUID reconcilationDate) {
		this.reconcilationDate = reconcilationDate;
	}

	public Integer getYearEndID() {
		return yearEndID;
	}

	public void setYearEndID(Integer yearEndID) {
		this.yearEndID = yearEndID;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}
