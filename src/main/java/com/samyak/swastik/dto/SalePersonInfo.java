package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class SalePersonInfo {

	private UUID salePersonId;
	private UUID companyId;
	private String salesPersonName;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String pin;
	private String country;
	private String mobile;
	private String phoneO;
	private String phoneR;
	private String fax;
	private String email;
	private String modifiedBy;
	private Timestamp ModifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Integer srNo;
	private Integer yearEndId;
	private Integer commission;
	private String salesPersonNameNative;

	public UUID getSalePersonId() {
		return salePersonId;
	}

	public void setSalePersonId(UUID salePersonId) {
		this.salePersonId = salePersonId;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public String getSalesPersonName() {
		return salesPersonName;
	}

	public void setSalesPersonName(String salesPersonName) {
		this.salesPersonName = salesPersonName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhoneO() {
		return phoneO;
	}

	public void setPhoneO(String phoneO) {
		this.phoneO = phoneO;
	}

	public String getPhoneR() {
		return phoneR;
	}

	public void setPhoneR(String phoneR) {
		this.phoneR = phoneR;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
		this.yearEndId = yearEndId;
	}

	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}

	public String getSalesPersonNameNative() {
		return salesPersonNameNative;
	}

	public void setSalesPersonNameNative(String salesPersonNameNative) {
		this.salesPersonNameNative = salesPersonNameNative;
	}

}
