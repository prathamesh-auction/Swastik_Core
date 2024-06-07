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
@Table(name = "VOUCHER")
public class Voucher implements Serializable {

	private static final long serialVersionUID = -3466514772381298556L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "VOUCHER_ID")
	private UUID voucherId;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "VOUCHER_TYPE")
	private Double voucherType;

	@Column(name = "VOUCHER_NO")
	private String voucherNo;

	@Column(name = "VOUCHER_DATE")
	private Timestamp voucherDate;

	@Column(name = "TOBY_NOS")
	private Double toByNos;

	@Column(name = "VOUCHER_CURRENCY")
	private Double voucherCurrency;

	@Column(name = "EXCHANGE_RATE")
	private Double exchangeRate;

	@Column(name = "VOUCHER_TOTAL")
	private Double voucherTotal;

	@Column(name = "LOCAL_TOTAL")
	private Double localTotal;

	@Column(name = "DOLLAR_TOTAL")
	private Double dollarTotal;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp ModifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "REFERENCE_VOUCHER_ID")
	private UUID referenceVoucherId;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "COST_HEADGROUP_ID")
	private UUID costHeadGroupId;

	@Column(name = "COST_HEADSUBGROUP_ID")
	private UUID costHeadSubGroupID;

	@Column(name = "RECONCILIATION_DATE")
	private Timestamp reconcilationDate;

	@Column(name = "YEAR_END_ID")
	private Double yearEndID;

	@Column(name = "REF_NO")
	private String refNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
