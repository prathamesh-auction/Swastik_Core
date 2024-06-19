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
@Table(name = "MASTER_LOCATION")
public class FinancialTransaction implements Serializable {

	private static final long serialVersionUID = -3305335685956211892L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "TRANSACTION_ID")
	private UUID transactionId;

	@Column(name = "COMPANY_ID")
	private Integer companyId;

	@Column(name = "VOUCHER_ID")
	private UUID voucherId;

	@Column(name = "SR_NO")
	private Double srNo;

	@Column(name = "FOR_HEAD")
	private Integer forHead;

	@Column(name = "FOR_HEAD_ID")
	private Integer forHeadID;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "TRANSACTION_TYPE")
	private Boolean transactionType;

	@Column(name = "AMOUNT")
	private Double amount;

	@Column(name = "LOCAL_AMOUNT")
	private Double localAmount;

	@Column(name = "DOLLAR_AMOUNT")
	private Double dollarAmount;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp ModifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "LEDGER_ID")
	private UUID ledgerId;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "PAYMENT_MODE")
	private Boolean paymentMode;

	@Column(name = "CHECK_NO")
	private String checkNo;

	@Column(name = "CHECK_DATE")
	private Timestamp checkDate;

	@Column(name = "BANK_NAME")
	private String bankName;

	@Column(name = "ACCOUNT_ID")
	private UUID accountId;

	@Column(name = "EXCHANGE_RATE")
	private Double excahngeRate;

	@Column(name = "EXCHANGE_DATE")
	private Timestamp exchangeDate;

	@Column(name = "TRANSACTION_DATE")
	private Timestamp transactionDate;

	@Column(name = "TRANSACTION_NO")
	private String transcationNo;

	@Column(name = "RECEIVE_ID")
	private UUID receiveId;

	@Column(name = "RECEIVE_FROM_LEDGER_ID")
	private UUID receiveFromLedgerId;

	@Column(name = "COST_HEADGROUP_ID")
	private UUID costHeadGroupId;

	@Column(name = "COST_HEADSUBGROUP_ID")
	private UUID costHeadSubGroupId;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public UUID getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(UUID voucherId) {
		this.voucherId = voucherId;
	}

	public Double getSrNo() {
		return srNo;
	}

	public void setSrNo(Double srNo) {
		this.srNo = srNo;
	}

	public Integer getForHead() {
		return forHead;
	}

	public void setForHead(Integer forHead) {
		this.forHead = forHead;
	}

	public Integer getForHeadID() {
		return forHeadID;
	}

	public void setForHeadID(Integer forHeadID) {
		this.forHeadID = forHeadID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(Boolean transactionType) {
		this.transactionType = transactionType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getLocalAmount() {
		return localAmount;
	}

	public void setLocalAmount(Double localAmount) {
		this.localAmount = localAmount;
	}

	public Double getDollarAmount() {
		return dollarAmount;
	}

	public void setDollarAmount(Double dollarAmount) {
		this.dollarAmount = dollarAmount;
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

	public UUID getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(UUID ledgerId) {
		this.ledgerId = ledgerId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Boolean paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public Timestamp getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Timestamp checkDate) {
		this.checkDate = checkDate;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public UUID getAccountId() {
		return accountId;
	}

	public void setAccountId(UUID accountId) {
		this.accountId = accountId;
	}

	public Double getExcahngeRate() {
		return excahngeRate;
	}

	public void setExcahngeRate(Double excahngeRate) {
		this.excahngeRate = excahngeRate;
	}

	public Timestamp getExchangeDate() {
		return exchangeDate;
	}

	public void setExchangeDate(Timestamp exchangeDate) {
		this.exchangeDate = exchangeDate;
	}

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTranscationNo() {
		return transcationNo;
	}

	public void setTranscationNo(String transcationNo) {
		this.transcationNo = transcationNo;
	}

	public UUID getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(UUID receiveId) {
		this.receiveId = receiveId;
	}

	public UUID getReceiveFromLedgerId() {
		return receiveFromLedgerId;
	}

	public void setReceiveFromLedgerId(UUID receiveFromLedgerId) {
		this.receiveFromLedgerId = receiveFromLedgerId;
	}

	public UUID getCostHeadGroupId() {
		return costHeadGroupId;
	}

	public void setCostHeadGroupId(UUID costHeadGroupId) {
		this.costHeadGroupId = costHeadGroupId;
	}

	public UUID getCostHeadSubGroupId() {
		return costHeadSubGroupId;
	}

	public void setCostHeadSubGroupId(UUID costHeadSubGroupId) {
		this.costHeadSubGroupId = costHeadSubGroupId;
	}

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

}
