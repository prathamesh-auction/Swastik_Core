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
@Table(name = "MASTER_SALE_PERSON")
public class SalePerson implements Serializable {

	private static final long serialVersionUID = -7909373203198470836L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "SALE_PERSON_ID")
	private UUID salePersonId;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "SALES_PERSON_NAME")
	private String salesPersonName;

	@Column(name = "ADDRESS1")
	private String address1;

	@Column(name = "ADDRESS2")
	private String address2;

	@Column(name = "ADDRESS3")
	private String address3;

	@Column(name = "CITY")
	private String city;

	@Column(name = "PIN")
	private String pin;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "MOBILE")
	private String mobile;

	@Column(name = "PHONE_O")
	private String phoneO;

	@Column(name = "PHONE_R")
	private String phoneR;

	@Column(name = "FAX")
	private String fax;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp ModifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "SR_NO")
	private Double srNo;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	@Column(name = "COMMISSION")
	private Double commission;

	@Column(name = "SALES_PERSON_NAME_NATIVE")
	private String salesPersonNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Double getSrNo() {
		return srNo;
	}

	public void setSrNo(Double srNo) {
		this.srNo = srNo;
	}

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public String getSalesPersonNameNative() {
		return salesPersonNameNative;
	}

	public void setSalesPersonNameNative(String salesPersonNameNative) {
		this.salesPersonNameNative = salesPersonNameNative;
	}

}
