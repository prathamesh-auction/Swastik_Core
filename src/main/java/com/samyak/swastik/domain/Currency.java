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
@Table(name="MASTER_CURRENCY")
public class Currency implements Serializable {

	private static final long serialVersionUID = 8926170250368659235L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "CURRENCY_ID")
	private UUID currencyId;

	@Column(name = "CURRENCY_NAME")
	private String currencyName;

	@Column(name = "CURRENCY_SYMBOL")
	private String currencySymbol;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "BASE_EXCHANGE_RATE")
	private Double baseExchangeRate;

	@Column(name = "LOCAL_CURRENCY")
	private Boolean localCurrency;

	@Column(name = "DECIMAL_PLACES")
	private Double decimalPlaces;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp ModifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	@Column(name = "CURRENCY_NAME_NATIVE")
	private String currencyNameNative;

	@Column(name = "CURRENCY_SYMBOL_NATIVE")
	private String currencySymbolNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
