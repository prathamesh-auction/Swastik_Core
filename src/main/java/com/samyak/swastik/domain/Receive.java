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
	private Integer receiveLots;

	@Column(name = "RECEIVE_QUANTITY")
	private Integer receiveQuantity;

	@Column(name = "RECEIVE_CURRENCY_ID")
	private UUID receiveCurrencyId;

	@Column(name = "EXCHANGE_RATE")
	private Integer exchangeRate;

	@Column(name = "RECEIVE_EXCHANGE_RATE")
	private Integer receiveExchangeRate;

	@Column(name = "TAX")
	private Integer tax;

	@Column(name = "DISCOUNT")
	private Integer discount;

	@Column(name = "RECEIVE_TOTAL")
	private Integer receiveTool;

	@Column(name = "DOLLAR_TOTAL")
	private Integer dollarTool;

	@Column(name = "RECEIVE_FROM_ID")
	private Integer receiveFromId;

	@Column(name = "RECEIVE_NAME")
	private String receiveName;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "RECEIVE_BY_NAME")
	private String receiveByName;

	@Column(name = "RECEIVE_INTERNAL")
	private Boolean receiveInternal;

	@Column(name = "PURCHASE")
	private Boolean purchase;

	@Column(name = "DUE_DAYS")
	private Integer dueDays;

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

	@Column(name = "STOCK_DATE")
	private Timestamp stockDate;

	@Column(name = "DIFFERENCE_AMOUNT")
	private Integer differenceAmount;

	@Column(name = "DIFFERENCE_LOCAL_AMOUNT")
	private Integer differenceLocalAmount;

	@Column(name = "DIFFERENCE_DOLLAR_AMOUNT")
	private Integer differenceDollarAmount;

	@Column(name = "INV_TOTAL")
	private Integer invAmount;

	@Column(name = "INV_LOCAL_TOTAL")
	private Integer invLocalTotal;

	@Column(name = "INV_DOLLAR_TOTAL")
	private Integer invDollarTotal;

	@Column(name = "RECEIVE_CATEGORY")
	private Integer receiveCategory;

	@Column(name = "STOCK_TRANSFER_TYPE")
	private Integer stockTransferType;

	@Column(name = "CGT_RETURN_CONFIRM")
	private Integer cgtReturnConfirm;

	@Column(name = "YEAR_END_ID")
	private Integer yearEndId;

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

	@Column(name = "OTHER_DAYS")
	private String otherDays;

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
