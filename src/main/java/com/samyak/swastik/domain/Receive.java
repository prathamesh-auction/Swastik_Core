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
@Table(name = "RECEIVE")
public class Receive implements Serializable {

	private static final long serialVersionUID = 9088183136252010924L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "RECEIVE_ID")
	private UUID receiveId;

	@Column(name = "RECEIVE_SELL")
	private Boolean receiveSell;

	@Column(name = "RECEIVE_NO")
	private String receiveNo;

	@Column(name = "RECEIVE_DATE")
	private Timestamp receiveDate;

	@Column(name = "RECEIVE_LOTS")
	private Double receiveLots;

	@Column(name = "RECEIVE_QUANTITY")
	private Double receiveQuantity;

	@Column(name = "RECEIVE_CURRENCY_ID")
	private UUID receiveCurrencyId;

	@Column(name = "EXCHANGE_RATE")
	private Double exchangeRate;

	@Column(name = "RECEIVE_EXCHANGE_RATE")
	private Double receiveExchangeRate;

	@Column(name = "TAX")
	private Double tax;

	@Column(name = "DISCOUNT")
	private Double discount;

	@Column(name = "RECEIVE_TOTAL")
	private Double receiveTool;

	@Column(name = "DOLLAR_TOTAL")
	private Double dollarTool;

	@Column(name = "RECEIVE_FROM_ID")
	private Double receiveFromId;

	@Column(name = "RECEIVE_FROM_NAME")
	private String receiveFromName;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "RECEIVE_BY_NAME")
	private String receiveByName;

	@Column(name = "RECEIVE_INTERNAL")
	private Boolean receiveInternal;

	@Column(name = "PURCHASE")
	private Boolean purchase;

	@Column(name = "DUE_DAYS")
	private Double dueDays;

	@Column(name = "DUE_DATE")
	private Timestamp dueDate;

	@Column(name = "CHALLAN_NO")
	private String challanNo;

	@Column(name = "CHALLAN_DATE")
	private Timestamp challanDate;

	@Column(name = "INVOICE_NO")
	private String invoiceNo;

	@Column(name = "INVOICE_DATE")
	private Timestamp invoiceDate;

	@Column(name = "REMARK")
	private String remark;

	@Column(name = "OPENING_STOCK")
	private Boolean openingStock;

	@Column(name = "SALE_PERSON_ID")
	private UUID salePersonId;

	@Column(name = "CONSIGNMENT_RECEIVED_ID")
	private UUID consignmentReceivedId;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private String modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "R_RETURN")
	private Boolean rReturn;

	@Column(name = "STOCK_DATE")
	private Timestamp stockDate;

	@Column(name = "DIFFERENCE_AMOUNT")
	private Double differenceAmount;

	@Column(name = "DIFFERENCE_LOCAL_AMOUNT")
	private Double differenceLocalAmount;

	@Column(name = "DIFFERENCE_DOLLAR_AMOUNT")
	private Double differenceDollarAmount;

	@Column(name = "INV_TOTAL")
	private Double invAmount;

	@Column(name = "INV_LOCAL_TOTAL")
	private Double invLocalTotal;

	@Column(name = "INV_DOLLAR_TOTAL")
	private Double invDollarTotal;

	@Column(name = "RECEIVE_CATEGORY")
	private Double receiveCategory;

	@Column(name = "STOCK_TRANSFER_TYPE")
	private Double stockTransferType;

	@Column(name = "CGT_RETURN_CONFIRM")
	private Double cgtReturnConfirm;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	@Column(name = "PURCHASE_GROUP_ID")
	private UUID purchaseGroupId;

	@Column(name = "CGT_REF_NO")
	private String cgtRefNo;

	@Column(name = "CGT_REF_DESCRIPTION")
	private String cgtRefDescription;

	@Column(name = "WORK_ORDER_ID")
	private UUID workOrderId;

	@Column(name = "REF_DESIGN_GROUP_ID")
	private UUID refDesignGroupId;

	@Column(name = "MFG_PURCHASE_RID")
	private UUID mfgPurchaseRId;

	@Column(name = "OVER_DAYS")
	private String overDays;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getReceiveFromName() {
		return receiveFromName;
	}

	public void setReceiveFromName(String receiveFromName) {
		this.receiveFromName = receiveFromName;
	}

	public Boolean getrReturn() {
		return rReturn;
	}

	public void setrReturn(Boolean rReturn) {
		this.rReturn = rReturn;
	}

	public String getOverDays() {
		return overDays;
	}

	public void setOverDays(String overDays) {
		this.overDays = overDays;
	}

}
