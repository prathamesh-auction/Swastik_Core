package com.samyak.swastik.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class CurrencyInfo implements Serializable {

	private static final long serialVersionUID = -6721499931820657260L;

	private UUID currencyId;
	private String currencyName;
	private String currencySymbol;
	private UUID companyId;
	private Double baseExchangeRate;
	private Boolean localCurrency;
	private Double decimalPlaces;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Double yearEndId;
	private String currencyNameNative;
	private String currencySymbolNative;

	public UUID getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(UUID currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public Double getBaseExchangeRate() {
		return baseExchangeRate;
	}

	public void setBaseExchangeRate(Double baseExchangeRate) {
		this.baseExchangeRate = baseExchangeRate;
	}

	public Boolean getLocalCurrency() {
		return localCurrency;
	}

	public void setLocalCurrency(Boolean localCurrency) {
		this.localCurrency = localCurrency;
	}

	public Double getDecimalPlaces() {
		return decimalPlaces;
	}

	public void setDecimalPlaces(Double decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

	public String getCurrencyNameNative() {
		return currencyNameNative;
	}

	public void setCurrencyNameNative(String currencyNameNative) {
		this.currencyNameNative = currencyNameNative;
	}

	public String getCurrencySymbolNative() {
		return currencySymbolNative;
	}

	public void setCurrencySymbolNative(String currencySymbolNative) {
		this.currencySymbolNative = currencySymbolNative;
	}

}
