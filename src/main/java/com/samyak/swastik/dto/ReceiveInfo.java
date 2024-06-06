package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class ReceiveInfo {

	private UUID receiveId;
	private Boolean receiveSell;
	private String receiveNo;
	private Timestamp receiveDate;
	private Integer receiveLots;
	private Integer receiveQuantity;
	private UUID receiveCurrencyId;
	private Integer exchangeRate;
	private Integer receiveExchangeRate;
	private Integer tax;
	private Integer discount;
	private Integer receiveTool;
	private Integer dollarTool;
	private Integer receiveFromId;
	private String receiveName;
	private UUID companyId;
	private String receiveByName;
	private Boolean receiveInternal;
	private Boolean purchase;
	private Integer dueDays;
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
	private Timestamp stockDate;
	private Integer differenceAmount;
	private Integer differenceLocalAmount;
	private Integer differenceDollarAmount;
	private Integer invAmount;
	private Integer invLocalTotal;
	private Integer invDollarTotal;
	private Integer receiveCategory;
	private Integer stockTransferType;
	private Integer cgtReturnConfirm;
	private Integer yearEndId;
	private UUID purchaseGroupId;
	private String cgtRefNo;
	private String cgtRefDescription;
	private UUID workOrderId;
	private UUID refDesignGroupId;
	private UUID mfgPurchaseRId;
	private String otherDays;

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

	public Integer getReceiveLots() {
		return receiveLots;
	}

	public void setReceiveLots(Integer receiveLots) {
		this.receiveLots = receiveLots;
	}

	public Integer getReceiveQuantity() {
		return receiveQuantity;
	}

	public void setReceiveQuantity(Integer receiveQuantity) {
		this.receiveQuantity = receiveQuantity;
	}

	public UUID getReceiveCurrencyId() {
		return receiveCurrencyId;
	}

	public void setReceiveCurrencyId(UUID receiveCurrencyId) {
		this.receiveCurrencyId = receiveCurrencyId;
	}

	public Integer getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Integer exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Integer getReceiveExchangeRate() {
		return receiveExchangeRate;
	}

	public void setReceiveExchangeRate(Integer receiveExchangeRate) {
		this.receiveExchangeRate = receiveExchangeRate;
	}

	public Integer getTax() {
		return tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getReceiveTool() {
		return receiveTool;
	}

	public void setReceiveTool(Integer receiveTool) {
		this.receiveTool = receiveTool;
	}

	public Integer getDollarTool() {
		return dollarTool;
	}

	public void setDollarTool(Integer dollarTool) {
		this.dollarTool = dollarTool;
	}

	public Integer getReceiveFromId() {
		return receiveFromId;
	}

	public void setReceiveFromId(Integer receiveFromId) {
		this.receiveFromId = receiveFromId;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
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

	public Integer getDueDays() {
		return dueDays;
	}

	public void setDueDays(Integer dueDays) {
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

	public Timestamp getStockDate() {
		return stockDate;
	}

	public void setStockDate(Timestamp stockDate) {
		this.stockDate = stockDate;
	}

	public Integer getDifferenceAmount() {
		return differenceAmount;
	}

	public void setDifferenceAmount(Integer differenceAmount) {
		this.differenceAmount = differenceAmount;
	}

	public Integer getDifferenceLocalAmount() {
		return differenceLocalAmount;
	}

	public void setDifferenceLocalAmount(Integer differenceLocalAmount) {
		this.differenceLocalAmount = differenceLocalAmount;
	}

	public Integer getDifferenceDollarAmount() {
		return differenceDollarAmount;
	}

	public void setDifferenceDollarAmount(Integer differenceDollarAmount) {
		this.differenceDollarAmount = differenceDollarAmount;
	}

	public Integer getInvAmount() {
		return invAmount;
	}

	public void setInvAmount(Integer invAmount) {
		this.invAmount = invAmount;
	}

	public Integer getInvLocalTotal() {
		return invLocalTotal;
	}

	public void setInvLocalTotal(Integer invLocalTotal) {
		this.invLocalTotal = invLocalTotal;
	}

	public Integer getInvDollarTotal() {
		return invDollarTotal;
	}

	public void setInvDollarTotal(Integer invDollarTotal) {
		this.invDollarTotal = invDollarTotal;
	}

	public Integer getReceiveCategory() {
		return receiveCategory;
	}

	public void setReceiveCategory(Integer receiveCategory) {
		this.receiveCategory = receiveCategory;
	}

	public Integer getStockTransferType() {
		return stockTransferType;
	}

	public void setStockTransferType(Integer stockTransferType) {
		this.stockTransferType = stockTransferType;
	}

	public Integer getCgtReturnConfirm() {
		return cgtReturnConfirm;
	}

	public void setCgtReturnConfirm(Integer cgtReturnConfirm) {
		this.cgtReturnConfirm = cgtReturnConfirm;
	}

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
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

	public String getOtherDays() {
		return otherDays;
	}

	public void setOtherDays(String otherDays) {
		this.otherDays = otherDays;
	}

}
