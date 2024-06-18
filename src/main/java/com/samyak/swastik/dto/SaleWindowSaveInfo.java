package com.samyak.swastik.dto;

import java.io.Serializable;
import java.sql.Timestamp;

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
	private String lotNo;
	private Double quantity;
	private Double rate;
	private Double amount;
	private String remark;
	private Double subTotal;
	private Double cTax;
	private Double total;
	private String narration;
	private Double numLots;
	private Double totalQuantity;

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

	public String getLotNo() {
		return lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getcTax() {
		return cTax;
	}

	public void setcTax(Double cTax) {
		this.cTax = cTax;
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

	public Double getNumLots() {
		return numLots;
	}

	public void setNumLots(Double numLots) {
		this.numLots = numLots;
	}

	public Double getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Double totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
