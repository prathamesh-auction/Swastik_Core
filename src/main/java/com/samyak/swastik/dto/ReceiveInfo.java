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
	private Double receiveTotol;
	private Double localTotal;
	private Double dollarTotol;
	private UUID receiveFromId;
	private String receiveFromName;
	private Double companyId;
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
	private String consignmentReceivedId;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Boolean proActive;
	private Boolean rReturn;
	private Timestamp stockDate;
	private Double differenceAmount;
	private Double differenceLocalAmount;
	private Double differenceDollarAmount;
	private Double invTotal;
	private Double invLocalTotal;
	private Double invDollarTotal;
	private UUID receiveCategory;
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

	public Double getLocalTotal() {
		return localTotal;
	}

	public void setLocalTotal(Double localTotal) {
		this.localTotal = localTotal;
	}

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

	public Double getReceiveTotol() {
		return receiveTotol;
	}

	public void setReceiveTotol(Double receiveTotol) {
		this.receiveTotol = receiveTotol;
	}

	public Double getDollarTotol() {
		return dollarTotol;
	}

	public void setDollarTotol(Double dollarTotol) {
		this.dollarTotol = dollarTotol;
	}

	public String getReceiveFromName() {
		return receiveFromName;
	}

	public void setReceiveFromName(String receiveFromName) {
		this.receiveFromName = receiveFromName;
	}

	public UUID getReceiveFromId() {
		return receiveFromId;
	}

	public void setReceiveFromId(UUID receiveFromId) {
		this.receiveFromId = receiveFromId;
	}

	public Double getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Double companyId) {
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

	public String getConsignmentReceivedId() {
		return consignmentReceivedId;
	}

	public void setConsignmentReceivedId(String consignmentReceivedId) {
		this.consignmentReceivedId = consignmentReceivedId;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getProActive() {
		return proActive;
	}

	public void setProActive(Boolean proActive) {
		this.proActive = proActive;
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

	public Double getInvTotal() {
		return invTotal;
	}

	public void setInvTotal(Double invTotal) {
		this.invTotal = invTotal;
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

	public UUID getReceiveCategory() {
		return receiveCategory;
	}

	public void setReceiveCategory(UUID receiveCategory) {
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
