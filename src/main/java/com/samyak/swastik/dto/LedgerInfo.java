package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class LedgerInfo {

	private UUID ledgerId;
	private Integer companyId;
	private Integer forHead;
	private Integer forHeadId;
	private String ledgerName;
	private String ledgerType;
	private String description;
	private Integer modifiedBy;
	private Timestamp modifiedOn;
	private String modifiedMachineName;
	private Double openingBalance;
	private Double openingLocalBalance;
	private Double openingDollarBalance;
	private Double exchageRate;
	private Boolean active;
	private Double yearEndId;
	private Double closingBalance;
	private Double closingLocalBalance;
	private Double closingDollarBalance;
	private Double closingExchageRate;
	private UUID partyGroupId;
	private Double intrest;
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
		return intrest;
	}

	public void setIntrest(Double intrest) {
		this.intrest = intrest;
	}

	public String getLedgerNameNAtive() {
		return ledgerNameNAtive;
	}

	public void setLedgerNameNAtive(String ledgerNameNAtive) {
		this.ledgerNameNAtive = ledgerNameNAtive;
	}

}
