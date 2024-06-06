package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class FInancialTransactionInfo {

	private UUID transactionId;
	private UUID companyId;
	private UUID voucherId;
	private Integer srNo;
	private Integer forHead;
	private UUID forHeadID;
	private String description;
	private Boolean transactionType;
	private Integer amount;
	private Integer localAmount;
	private Integer dollarAmount;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private UUID ledgerId;
	private Boolean active;
	private Boolean paymentMode;
	private String checkNo;
	private Timestamp checkDate;
	private String bankName;
	private UUID accountId;
	private Integer excahngeRate;
	private Timestamp exchangeDate;
	private Timestamp transactionDate;
	private String transcationNo;
	private UUID receiveId;
	private UUID receiveFromLedgerId;
	private UUID costHeadGroupId;
	private UUID costHeadSubGroupId;
	private Integer yearEndId;

	public UUID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public UUID getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(UUID voucherId) {
		this.voucherId = voucherId;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public Integer getForHead() {
		return forHead;
	}

	public void setForHead(Integer forHead) {
		this.forHead = forHead;
	}

	public UUID getForHeadID() {
		return forHeadID;
	}

	public void setForHeadID(UUID forHeadID) {
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getLocalAmount() {
		return localAmount;
	}

	public void setLocalAmount(Integer localAmount) {
		this.localAmount = localAmount;
	}

	public Integer getDollarAmount() {
		return dollarAmount;
	}

	public void setDollarAmount(Integer dollarAmount) {
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

	public Integer getExcahngeRate() {
		return excahngeRate;
	}

	public void setExcahngeRate(Integer excahngeRate) {
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

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
		this.yearEndId = yearEndId;
	}

}
