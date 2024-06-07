package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class VoucherInfo {

	private UUID voucherId;
	private UUID companyId;
	private Double voucherType;
	private String voucherNo;
	private Timestamp voucherDate;
	private Double toByNos;
	private Double voucherCurrency;
	private Double exchangeRate;
	private Double voucherTotal;
	private Double localTotal;
	private Double dollarTotal;
	private String description;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private UUID referenceVoucherId;
	private Boolean active;
	private UUID costHeadGroupId;
	private UUID costHeadSubGroupID;
	private UUID reconcilationDate;
	private Double yearEndID;
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

	public Double getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(Double voucherType) {
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

	public Double getToByNos() {
		return toByNos;
	}

	public void setToByNos(Double toByNos) {
		this.toByNos = toByNos;
	}

	public Double getVoucherCurrency() {
		return voucherCurrency;
	}

	public void setVoucherCurrency(Double voucherCurrency) {
		this.voucherCurrency = voucherCurrency;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Double getVoucherTotal() {
		return voucherTotal;
	}

	public void setVoucherTotal(Double voucherTotal) {
		this.voucherTotal = voucherTotal;
	}

	public Double getLocalTotal() {
		return localTotal;
	}

	public void setLocalTotal(Double localTotal) {
		this.localTotal = localTotal;
	}

	public Double getDollarTotal() {
		return dollarTotal;
	}

	public void setDollarTotal(Double dollarTotal) {
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

	public Double getYearEndID() {
		return yearEndID;
	}

	public void setYearEndID(Double yearEndID) {
		this.yearEndID = yearEndID;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}
