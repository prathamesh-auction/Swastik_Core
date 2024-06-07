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
@Table(name = "MASTER_EXCHANGE_RATE")
public class ExchangeRate implements Serializable {

	private static final long serialVersionUID = 6944644238001165782L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "EXCHANGE_RATE_ID")
	private UUID exchangeRateId;

	@Column(name = "CURRENCY_ID")
	private UUID currencyId;

	@Column(name = "EXCHANGE_DATE")
	private Timestamp exchangeDate;

	@Column(name = "EXCHANGE_RATE")
	private Double exchangeRate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private String modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

}
