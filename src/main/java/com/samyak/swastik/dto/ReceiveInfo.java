package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class ReceiveInfo {

	private UUID receiveId;
	private Boolean receiveSell;
	private String receiveNo;
	private Timestamp receiveDate;
	private Double receiveLots;
	private Double receiveQuantity;
	private UUID receiveCurrencyId;
	private Double exchangeRate;
	private Double receiveExchangeRate;
	private Double tax;
	private Double discount;
	private Double receiveTool;
	private Double dollarTool;
	private Double receiveFromId;
	private String receiveFromName;
	private UUID companyId;
	private String receiveByName;
	private Boolean receiveInternal;
	private Boolean purchase;
	private Double dueDays;
	private Timestamp dueDate;
	private String challanNo;
	private Timestamp challanDate;
	private String invoiceNo;
	private Timestamp invoiceDate;
	private String remark;
	private Boolean openingStock;
	private UUID salePersonId;
	private UUID consignmentReceivedId;
	private String modifiedBy;
	private String modifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Boolean rReturn;
	private Timestamp stockDate;
	private Double differenceAmount;
	private Double differenceLocalAmount;
	private Double differenceDollarAmount;
	private Double invAmount;
	private Double invLocalTotal;
	private Double invDollarTotal;
	private Double receiveCategory;
	private Double stockTransferType;
	private Double cgtReturnConfirm;
	private Double yearEndId;
	private UUID purchaseGroupId;
	private String cgtRefNo;
	private String cgtRefDescription;
	private UUID workOrderId;
	private UUID refDesignGroupId;
	private UUID mfgPurchaseRId;
	private String overDays;

	public UUID getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(UUID receiveId) {
		this.receiveId = receiveId;
	}

	public Boolean getReceiveSell() {
		return receiveSell;
	}

	public void setReceiveSell(Boolean receiveSell) {
		this.receiveSell = receiveSell;
	}

	public String getReceiveNo() {
		return receiveNo;
	}

	public void setReceiveNo(String receiveNo) {
		this.receiveNo = receiveNo;
	}

	public Timestamp getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Timestamp receiveDate) {
		this.receiveDate = receiveDate;
	}

	public Double getReceiveLots() {
		return receiveLots;
	}

	public void setReceiveLots(Double receiveLots) {
		this.receiveLots = receiveLots;
	}

	public Double getReceiveQuantity() {
		return receiveQuantity;
	}

	public void setReceiveQuantity(Double receiveQuantity) {
		this.receiveQuantity = receiveQuantity;
	}

	public UUID getReceiveCurrencyId() {
		return receiveCurrencyId;
	}

	public void setReceiveCurrencyId(UUID receiveCurrencyId) {
		this.receiveCurrencyId = receiveCurrencyId;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Double getReceiveExchangeRate() {
		return receiveExchangeRate;
	}

	public void setReceiveExchangeRate(Double receiveExchangeRate) {
		this.receiveExchangeRate = receiveExchangeRate;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getReceiveTool() {
		return receiveTool;
	}

	public void setReceiveTool(Double receiveTool) {
		this.receiveTool = receiveTool;
	}

	public Double getDollarTool() {
		return dollarTool;
	}

	public void setDollarTool(Double dollarTool) {
		this.dollarTool = dollarTool;
	}

	public Double getReceiveFromId() {
		return receiveFromId;
	}

	public void setReceiveFromId(Double receiveFromId) {
		this.receiveFromId = receiveFromId;
	}

	public String getReceiveFromName() {
		return receiveFromName;
	}

	public void setReceiveFromName(String receiveFromName) {
		this.receiveFromName = receiveFromName;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public String getReceiveByName() {
		return receiveByName;
	}

	public void setReceiveByName(String receiveByName) {
		this.receiveByName = receiveByName;
	}

	public Boolean getReceiveInternal() {
		return receiveInternal;
	}

	public void setReceiveInternal(Boolean receiveInternal) {
		this.receiveInternal = receiveInternal;
	}

	public Boolean getPurchase() {
		return purchase;
	}

	public void setPurchase(Boolean purchase) {
		this.purchase = purchase;
	}

	public Double getDueDays() {
		return dueDays;
	}

	public void setDueDays(Double dueDays) {
		this.dueDays = dueDays;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public Timestamp getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(Timestamp challanDate) {
		this.challanDate = challanDate;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Timestamp getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(Boolean openingStock) {
		this.openingStock = openingStock;
	}

	public UUID getSalePersonId() {
		return salePersonId;
	}

	public void setSalePersonId(UUID salePersonId) {
		this.salePersonId = salePersonId;
	}

	public UUID getConsignmentReceivedId() {
		return consignmentReceivedId;
	}

	public void setConsignmentReceivedId(UUID consignmentReceivedId) {
		this.consignmentReceivedId = consignmentReceivedId;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedMachineName() {
		return modifiedMachineName;
	}

	public void setModifiedMachineName(String modifiedMachineName) {
		this.modifiedMachineName = modifiedMachineName;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getrReturn() {
		return rReturn;
	}

	public void setrReturn(Boolean rReturn) {
		this.rReturn = rReturn;
	}

	public Timestamp getStockDate() {
		return stockDate;
	}

	public void setStockDate(Timestamp stockDate) {
		this.stockDate = stockDate;
	}

	public Double getDifferenceAmount() {
		return differenceAmount;
	}

	public void setDifferenceAmount(Double differenceAmount) {
		this.differenceAmount = differenceAmount;
	}

	public Double getDifferenceLocalAmount() {
		return differenceLocalAmount;
	}

	public void setDifferenceLocalAmount(Double differenceLocalAmount) {
		this.differenceLocalAmount = differenceLocalAmount;
	}

	public Double getDifferenceDollarAmount() {
		return differenceDollarAmount;
	}

	public void setDifferenceDollarAmount(Double differenceDollarAmount) {
		this.differenceDollarAmount = differenceDollarAmount;
	}

	public Double getInvAmount() {
		return invAmount;
	}

	public void setInvAmount(Double invAmount) {
		this.invAmount = invAmount;
	}

	public Double getInvLocalTotal() {
		return invLocalTotal;
	}

	public void setInvLocalTotal(Double invLocalTotal) {
		this.invLocalTotal = invLocalTotal;
	}

	public Double getInvDollarTotal() {
		return invDollarTotal;
	}

	public void setInvDollarTotal(Double invDollarTotal) {
		this.invDollarTotal = invDollarTotal;
	}

	public Double getReceiveCategory() {
		return receiveCategory;
	}

	public void setReceiveCategory(Double receiveCategory) {
		this.receiveCategory = receiveCategory;
	}

	public Double getStockTransferType() {
		return stockTransferType;
	}

	public void setStockTransferType(Double stockTransferType) {
		this.stockTransferType = stockTransferType;
	}

	public Double getCgtReturnConfirm() {
		return cgtReturnConfirm;
	}

	public void setCgtReturnConfirm(Double cgtReturnConfirm) {
		this.cgtReturnConfirm = cgtReturnConfirm;
	}

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

	public UUID getPurchaseGroupId() {
		return purchaseGroupId;
	}

	public void setPurchaseGroupId(UUID purchaseGroupId) {
		this.purchaseGroupId = purchaseGroupId;
	}

	public String getCgtRefNo() {
		return cgtRefNo;
	}

	public void setCgtRefNo(String cgtRefNo) {
		this.cgtRefNo = cgtRefNo;
	}

	public String getCgtRefDescription() {
		return cgtRefDescription;
	}

	public void setCgtRefDescription(String cgtRefDescription) {
		this.cgtRefDescription = cgtRefDescription;
	}

	public UUID getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(UUID workOrderId) {
		this.workOrderId = workOrderId;
	}

	public UUID getRefDesignGroupId() {
		return refDesignGroupId;
	}

	public void setRefDesignGroupId(UUID refDesignGroupId) {
		this.refDesignGroupId = refDesignGroupId;
	}

	public UUID getMfgPurchaseRId() {
		return mfgPurchaseRId;
	}

	public void setMfgPurchaseRId(UUID mfgPurchaseRId) {
		this.mfgPurchaseRId = mfgPurchaseRId;
	}

	public String getOverDays() {
		return overDays;
	}

	public void setOverDays(String overDays) {
		this.overDays = overDays;
	}

}
