package com.samyak.swastik.dto;

import java.io.Serializable;
import java.util.List;

public class SaleWindowInfo implements Serializable {

	private static final long serialVersionUID = -3385944472227700627L;

	private List<String> salePerson;
	private List<String> purhcaseSaleGroup;
	private List<String> category;
	private List<String> location;
	private List<String> invoiceType;
	private List<String> currency;
	private List<Double> exchangeRate;
	private List<String> companyParty;

	public List<String> getSalePerson() {
		return salePerson;
	}

	public void setSalePerson(List<String> salePerson) {
		this.salePerson = salePerson;
	}

	public List<String> getPurhcaseSaleGroup() {
		return purhcaseSaleGroup;
	}

	public void setPurhcaseSaleGroup(List<String> purhcaseSaleGroup) {
		this.purhcaseSaleGroup = purhcaseSaleGroup;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	public List<String> getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(List<String> invoiceType) {
		this.invoiceType = invoiceType;
	}

	public List<String> getCurrency() {
		return currency;
	}

	public void setCurrency(List<String> currency) {
		this.currency = currency;
	}

	public List<Double> getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(List<Double> exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public List<String> getCompanyParty() {
		return companyParty;
	}

	public void setCompanyParty(List<String> companyParty) {
		this.companyParty = companyParty;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
