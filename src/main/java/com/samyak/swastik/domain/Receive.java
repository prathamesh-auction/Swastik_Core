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
	private Double receiveTotal;

	@Column(name = "LOCAL_TOTAL")
	private Double localTotal;

	@Column(name = "DOLLAR_TOTAL")
	private Double dollarTotal;

	@Column(name = "RECEIVE_FROM_ID")
	private UUID receiveFromId;

	@Column(name = "RECEIVE_FROM_NAME")
	private String receiveFromName;

	@Column(name = "COMPANY_ID")
	private Integer companyId;

	@Column(name = "RECEIVE_BY_NAME")
	private String receiveByName;

	@Column(name = "RECEIVE_INTERNAL")
	private Boolean receiveInternal;

	@Column(name = "PURCHASE")
	private Boolean purchase;

	@Column(name = "DUEDAYS")
	private Integer dueDays;

	@Column(name = "DUEDATE")
	private Timestamp dueDate;

	@Column(name = "CHALLAN_NO")
	private String challanNo;

	@Column(name = "CJALLAN_DATE")
	private Timestamp challanDate;

	@Column(name = "IVOICE_NO")
	private String invoiceNo;

	@Column(name = "INVOICE_DATE")
	private Timestamp invoiceDate;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "OPENING_STOCK")
	private Boolean openingStock;

	@Column(name = "SALE_PERSON_ID")
	private UUID salePersonId;

	@Column(name = "CONSIGNMENT_RECEIVE_ID")
	private Integer consignmentReceiveId;

	@Column(name = "MODIFIEDON")
	private Timestamp modifiedOn;

	@Column(name = "MODIFIEDBY")
	private Integer ModifiedBy;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "PROACTIVE")
	private Boolean proActive;

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
	private Double invTotal;

	@Column(name = "INV_LOCAL_TOTAL")
	private Double invLocalTotal;

	@Column(name = "INV_DOLLAR_TOTAL")
	private Double invDollarTotal;

	@Column(name = "RECEIVE_CATEGORY")
	private UUID receiveCategory;

	@Column(name = "STOCK_TRANSFER_TYPE")
	private Integer stockTransferType;

	@Column(name = "CGT_RETURN_CONFIRM")
	private Integer cgtReturnConfirm;

	@Column(name = "YEAR_END_ID")
	private Integer yearEndId;

	@Column(name = "PURCHASE_SALE_GROUP_ID")
	private UUID purchaseSaleGroupId;

	@Column(name = "CGT_REF_NO")
	private String cgtRefNo;

	@Column(name = "CGT_DESCRIPTION")
	private String cgtDescription;

	@Column(name = "WORK_ORDER_ID")
	private Double workOrderId;

	@Column(name = "REF_DESIGN_GROUP_ID")
	private Double refDesignGroupId;

	@Column(name = "MFG_PURCHASE_RID")
	private Integer mfgPurchaseRId;

	@Column(name = "OVERDAYS")
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

	public Integer getReceiveLots() {
		return receiveLots;
	}

	public void setReceiveLots(Integer receiveLots) {
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

	public Double getReceiveTotal() {
		return receiveTotal;
	}

	public void setReceiveTotal(Double receiveTotal) {
		this.receiveTotal = receiveTotal;
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

	public UUID getReceiveFromId() {
		return receiveFromId;
	}

	public void setReceiveFromId(UUID receiveFromId) {
		this.receiveFromId = receiveFromId;
	}

	public String getReceiveFromName() {
		return receiveFromName;
	}

	public void setReceiveFromName(String receiveFromName) {
		this.receiveFromName = receiveFromName;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public Integer getConsignmentReceiveId() {
		return consignmentReceiveId;
	}

	public void setConsignmentReceiveId(Integer consignmentReceiveId) {
		this.consignmentReceiveId = consignmentReceiveId;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Integer getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		ModifiedBy = modifiedBy;
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

	public UUID getPurchaseSaleGroupId() {
		return purchaseSaleGroupId;
	}

	public void setPurchaseSaleGroupId(UUID purchaseSaleGroupId) {
		this.purchaseSaleGroupId = purchaseSaleGroupId;
	}

	public String getCgtRefNo() {
		return cgtRefNo;
	}

	public void setCgtRefNo(String cgtRefNo) {
		this.cgtRefNo = cgtRefNo;
	}

	public String getCgtDescription() {
		return cgtDescription;
	}

	public void setCgtDescription(String cgtDescription) {
		this.cgtDescription = cgtDescription;
	}

	public Double getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(Double workOrderId) {
		this.workOrderId = workOrderId;
	}

	public Double getRefDesignGroupId() {
		return refDesignGroupId;
	}

	public void setRefDesignGroupId(Double refDesignGroupId) {
		this.refDesignGroupId = refDesignGroupId;
	}

	public Integer getMfgPurchaseRId() {
		return mfgPurchaseRId;
	}

	public void setMfgPurchaseRId(Integer mfgPurchaseRId) {
		this.mfgPurchaseRId = mfgPurchaseRId;
	}

	public String getOverDays() {
		return overDays;
	}

	public void setOverDays(String overDays) {
		this.overDays = overDays;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
