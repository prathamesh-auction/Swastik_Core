package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class VoucherInfo {

	private UUID voucherId;
	private Integer companyId;
	private Double voucherType;
	private Integer voucherNo;
	private Timestamp voucherDate;
	private Double toByNos;
	private UUID voucherCurrency;
	private Double exchangeRate;
	private Double voucherTotal;
	private Double localTotal;
	private Double dollarTotal;
	private String description;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private Integer referenceVoucherId;
	private Boolean active;
	private Integer costHeadGroupId;
	private Integer costHeadSubGroupID;
	private Timestamp reconcilationDate;
	private Double yearEndID;
	private String refNo;

	public UUID getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(UUID voucherId) {
		this.voucherId = voucherId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Double getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(Double voucherType) {
		this.voucherType = voucherType;
	}

	public Integer getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(Integer voucherNo) {
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

	public UUID getVoucherCurrency() {
		return voucherCurrency;
	}

	public void setVoucherCurrency(UUID voucherCurrency) {
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

	public Integer getReferenceVoucherId() {
		return referenceVoucherId;
	}

	public void setReferenceVoucherId(Integer referenceVoucherId) {
		this.referenceVoucherId = referenceVoucherId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getCostHeadGroupId() {
		return costHeadGroupId;
	}

	public void setCostHeadGroupId(Integer costHeadGroupId) {
		this.costHeadGroupId = costHeadGroupId;
	}

	public Integer getCostHeadSubGroupID() {
		return costHeadSubGroupID;
	}

	public void setCostHeadSubGroupID(Integer costHeadSubGroupID) {
		this.costHeadSubGroupID = costHeadSubGroupID;
	}

	public Timestamp getReconcilationDate() {
		return reconcilationDate;
	}

	public void setReconcilationDate(Timestamp reconcilationDate) {
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
