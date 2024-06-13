package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class ExchangeRateInfo {

	private UUID exchangeRateId;
	private UUID currencyId;
	private Timestamp exchangeDate;
	private Double exchangeRate;
	private String modifiedBy;
	private String modifiedOn;
	private String modifiedMachineName;
	private Boolean active;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	private Double yearEndId;

	public UUID getExchangeRateId() {
		return exchangeRateId;
	}

	public void setExchangeRateId(UUID exchangeRateId) {
		this.exchangeRateId = exchangeRateId;
	}

	public UUID getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(UUID currencyId) {
		this.currencyId = currencyId;
	}

	public Timestamp getExchangeDate() {
		return exchangeDate;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public void setExchangeDate(Timestamp exchangeDate) {
		this.exchangeDate = exchangeDate;
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

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

}
