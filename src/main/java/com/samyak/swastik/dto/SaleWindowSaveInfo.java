package com.samyak.swastik.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class SaleWindowSaveInfo implements Serializable {

	private static final long serialVersionUID = 3241737740814479182L;

	private String invoiceNo;
	private String companyParty;
	private String saleGroup;
	private Timestamp invoiceDate;
	private String stockDate;
	private String dueDate;
	private String location;
	private String category;
	private String currency;
	private Double exchangeRate;
	private Double dueDays;
	private String salePerson;
	private String refNo;
	private Double subTotal;
	private Double total;
	private String narration;
	private Integer numLots;
	private Double totalQuantity;
	private String cTax;
	private Double cTaxAmount;
	private List<LotListInfo> lotList;
	private List<LedgerListInfo> ledgerList;

	public String getcTax() {
		return cTax;
	}

	public void setcTax(String cTax) {
		this.cTax = cTax;
	}

	public Double getcTaxAmount() {
		return cTaxAmount;
	}

	public void setcTaxAmount(Double cTaxAmount) {
		this.cTaxAmount = cTaxAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<LedgerListInfo> getLedgerList() {
		return ledgerList;
	}

	public void setLedgerList(List<LedgerListInfo> ledgerList) {
		this.ledgerList = ledgerList;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getCompanyParty() {
		return companyParty;
	}

	public void setCompanyParty(String companyParty) {
		this.companyParty = companyParty;
	}

	public String getSaleGroup() {
		return saleGroup;
	}

	public void setSaleGroup(String saleGroup) {
		this.saleGroup = saleGroup;
	}

	public Timestamp getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getStockDate() {
		return stockDate;
	}

	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Double getDueDays() {
		return dueDays;
	}

	public void setDueDays(Double dueDays) {
		this.dueDays = dueDays;
	}

	public String getSalePerson() {
		return salePerson;
	}

	public void setSalePerson(String salePerson) {
		this.salePerson = salePerson;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public Integer getNumLots() {
		return numLots;
	}

	public void setNumLots(Integer numLots) {
		this.numLots = numLots;
	}

	public Double getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Double totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public List<LotListInfo> getLotList() {
		return lotList;
	}

	public void setLotList(List<LotListInfo> lotList) {
		this.lotList = lotList;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}
