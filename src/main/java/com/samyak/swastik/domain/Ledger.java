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
@Table(name = "LEDGER")
public class Ledger implements Serializable {

	private static final long serialVersionUID = -8181093460968966278L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LEDGER_ID")
	private UUID ledgerId;

	@Column(name = "COMPANY_ID")
	private Integer companyId;

	@Column(name = "FORHEAD")
	private Integer forHead;

	@Column(name = "FORHEAD_ID")
	private Integer forHeadId;

	@Column(name = "LEDGER_NAME")
	private String ledgerName;

	@Column(name = "LEDGER_TYPE")
	private String ledgerType;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "OPENING_BALANCE")
	private Double openingBalance;

	@Column(name = "OPENING_LOCAL_BALANCE")
	private Double openingLocalBalance;

	@Column(name = "OPENING_DOLLAR_BALANCE")
	private Double openingDollarBalance;

	@Column(name = "EXCHANGE_RATE")
	private Double exchageRate;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	@Column(name = "CLOSING_BALANCE")
	private Double closingBalance;

	@Column(name = "CLOSING_LOCAL_BALANCE")
	private Double closingLocalBalance;

	@Column(name = "CLOSING_DOLLAR_BALANCE")
	private Double closingDollarBalance;

	@Column(name = "CLOSING_EXCHANGE")
	private Double closingExchageRate;

	@Column(name = "PARTY_GROUP_ID")
	private UUID partyGroupId;

	@Column(name = "INTEREST")
	private Double interest;

	@Column(name = "LEDGER_NAME_NATIVE")
	private String ledgerNameNAtive;

	public UUID getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(UUID ledgerId) {
		this.ledgerId = ledgerId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getForHead() {
		return forHead;
	}

	public void setForHead(Integer forHead) {
		this.forHead = forHead;
	}

	public Integer getForHeadId() {
		return forHeadId;
	}

	public void setForHeadId(Integer forHeadId) {
		this.forHeadId = forHeadId;
	}

	public String getLedgerName() {
		return ledgerName;
	}

	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
	}

	public String getLedgerType() {
		return ledgerType;
	}

	public void setLedgerType(String ledgerType) {
		this.ledgerType = ledgerType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedMachineName() {
		return modifiedMachineName;
	}

	public void setModifiedMachineName(String modifiedMachineName) {
		this.modifiedMachineName = modifiedMachineName;
	}

	public Double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(Double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public Double getOpeningLocalBalance() {
		return openingLocalBalance;
	}

	public void setOpeningLocalBalance(Double openingLocalBalance) {
		this.openingLocalBalance = openingLocalBalance;
	}

	public Double getOpeningDollarBalance() {
		return openingDollarBalance;
	}

	public void setOpeningDollarBalance(Double openingDollarBalance) {
		this.openingDollarBalance = openingDollarBalance;
	}

	public Double getExchageRate() {
		return exchageRate;
	}

	public void setExchageRate(Double exchageRate) {
		this.exchageRate = exchageRate;
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

	public Double getClosingBalance() {
		return closingBalance;
	}

	public void setClosingBalance(Double closingBalance) {
		this.closingBalance = closingBalance;
	}

	public Double getClosingLocalBalance() {
		return closingLocalBalance;
	}

	public void setClosingLocalBalance(Double closingLocalBalance) {
		this.closingLocalBalance = closingLocalBalance;
	}

	public Double getClosingDollarBalance() {
		return closingDollarBalance;
	}

	public void setClosingDollarBalance(Double closingDollarBalance) {
		this.closingDollarBalance = closingDollarBalance;
	}

	public Double getClosingExchageRate() {
		return closingExchageRate;
	}

	public void setClosingExchageRate(Double closingExchageRate) {
		this.closingExchageRate = closingExchageRate;
	}

	public UUID getPartyGroupId() {
		return partyGroupId;
	}

	public void setPartyGroupId(UUID partyGroupId) {
		this.partyGroupId = partyGroupId;
	}

	public Double getIntrest() {
		return interest;
	}

	public void setIntrest(Double interest) {
		this.interest = interest;
	}

	public String getLedgerNameNAtive() {
		return ledgerNameNAtive;
	}

	public void setLedgerNameNAtive(String ledgerNameNAtive) {
		this.ledgerNameNAtive = ledgerNameNAtive;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
