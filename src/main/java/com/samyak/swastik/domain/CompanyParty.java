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
@Table(name = "MASTER_COMPANY_PARTY")
public class CompanyParty implements Serializable {

	private static final long serialVersionUID = 3043814864871064945L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "COMPANY_PARTY_ID")
	private UUID companyPartyId;

	@Column(name = "GROUP_COMPANY_ID")
	private UUID groupCompanyId;

	@Column(name = "COMPANY_PARTY_NAME")
	private String companyPartyName;

	@Column(name = "CATEGORY_CODE")
	private String categoryCode;

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

	@Column(name = "SUPER")
	private Boolean superV;

	@Column(name = "COMPANY")
	private Boolean company;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "INCOME_TAX_NO")
	private String incomeTaxNo;

	@Column(name = "SALES_TAX_no")
	private String salesTaxNo;

	@Column(name = "PHONE_OFF")
	private String PhoneOff;

	@Column(name = "PHONE_RESI")
	private String phoneResi;

	@Column(name = "MOBILE")
	private String mobile;

	@Column(name = "WEBSITE")
	private String website;

	@Column(name = "PERSON1")
	private String person1;

	@Column(name = "PERSON2")
	private String person2;

	@Column(name = "FAX")
	private String fax;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp ModifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "SR_NO")
	private Integer srNo;

	@Column(name = "TRANSACTION_CURRENECY")
	private Integer transactionCurrency;

	@Column(name = "OPENING_DATE")
	private Timestamp openingDate;

	@Column(name = "OPENING_RLOCAL_BALANCE")
	private Integer openingRlocalBalace;

	@Column(name = "OPENING_RDOLLAR_BALANCE")
	private Integer openingRdollarBalace;

	@Column(name = "OPENING_REXCHANGE_RATE")
	private Integer openingRexchangeRate;

	@Column(name = "NET_RLOCAL_BALANCE")
	private Integer netRlocalBalance;

	@Column(name = "NET_RDOLLAR_BALANCE")
	private Integer netRdollarBalance;

	@Column(name = "R_EXCHANGE_RATE")
	private Integer rExchangeRate;

	@Column(name = "OPENING_PLOCAL_BALANCE")
	private Integer openingPlocalBalace;

	@Column(name = "OPENING_PDOLLAR_BALANCE")
	private Integer openingPdollarBalace;

	@Column(name = "OPENING_PEXCHANGE_RATE")
	private Integer openingPexchangeRate;

	@Column(name = "NET_PLOCAL_BALANCE")
	private Integer netPlocalBalance;

	@Column(name = "NET_PDOLLAR_BALANCE")
	private Integer netPdollarBalance;

	@Column(name = "P_EXCHANGE_RATE")
	private Integer pExchangeRate;

	@Column(name = "OPENING_PNLOCAL_BALANCE")
	private Integer openingPnlocalBalace;

	@Column(name = "OPENING_PNDOLLAR_BALANCE")
	private Integer openingPndollarBalace;

	@Column(name = "OPENING_PNEXCHANGE_RATE")
	private Integer openingPnexchangeRate;

	@Column(name = "SALE")
	private Boolean sale;

	@Column(name = "PURCHASE")
	private Boolean purchase;

	@Column(name = "PN")
	private Boolean pn;

	@Column(name = "PURCHASE_ADVANCE_LOCAL")
	private Integer purchaseAdvanceLocal;

	@Column(name = "SALE_ADVANCE_LOCAL")
	private Integer saleAdvanceLocal;

	@Column(name = "PN_ADVANCE_LOCAL")
	private Integer pnAdvanceLocal;

	@Column(name = "PURCHASE_ADVANCE_DOLLAR")
	private Integer purchaseAdvanceDollar;

	@Column(name = "SALE_ADVANCE_DOLLAR")
	private Integer saleAdvanceDollar;

	@Column(name = "PN_ADVANCE_DOLLAR")
	private Integer pnAdvanceDollar;

	@Column(name = "PAYMENT_DATE")
	private Integer paymentDate;

	@Column(name = "CLOSING_DATE")
	private Integer closingDate;

	@Column(name = "CREDIT_LIMIT")
	private Integer creditLimit;

	@Column(name = "SHIKESHO")
	private Boolean shikesho;

	@Column(name = "DUE_DAYS")
	private Integer dueDays;

	@Column(name = "SALES_PERSON_ID")
	private UUID salesPersonId;

	@Column(name = "YEAR_END_ID")
	private Integer yearEndId;

	@Column(name = "COMPANY_PARTY_NAME_NATIVE")
	private String companyPartyNameNative;

	@Column(name = "ADDRESS1_NATIVE")
	private String address1Native;

	@Column(name = "ADDRESS2_NATIVE")
	private String address2Native;

	@Column(name = "ADDRESS3_NATIVE")
	private String address3Native;

	@Column(name = "CITY_NATIVE")
	private String cityNative;

	@Column(name = "COUNTRY_NATIVE")
	private String countryNative;

	@Column(name = "PAYMENT_TERMS_ID")
	private UUID paymentTermsId;

	@Column(name = "PN_REALISATION_ID")
	private UUID pnRealisationId;

	@Column(name = "BANK_CHARGES")
	private Integer bankCharges;

	@Column(name = "PN_NARRTION")
	private String pnNarration;

	@Column(name = "CUSTOMER_CODE")
	private String customerCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getCompanyPartyId() {
		return companyPartyId;
	}

	public void setCompanyPartyId(UUID companyPartyId) {
		this.companyPartyId = companyPartyId;
	}

	public UUID getGroupCompanyId() {
		return groupCompanyId;
	}

	public void setGroupCompanyId(UUID groupCompanyId) {
		this.groupCompanyId = groupCompanyId;
	}

	public String getCompanyPartyName() {
		return companyPartyName;
	}

	public void setCompanyPartyName(String companyPartyName) {
		this.companyPartyName = companyPartyName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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

	public Boolean getSuperV() {
		return superV;
	}

	public void setSuperV(Boolean superV) {
		this.superV = superV;
	}

	public Boolean getCompany() {
		return company;
	}

	public void setCompany(Boolean company) {
		this.company = company;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public String getIncomeTaxNo() {
		return incomeTaxNo;
	}

	public void setIncomeTaxNo(String incomeTaxNo) {
		this.incomeTaxNo = incomeTaxNo;
	}

	public String getSalesTaxNo() {
		return salesTaxNo;
	}

	public void setSalesTaxNo(String salesTaxNo) {
		this.salesTaxNo = salesTaxNo;
	}

	public String getPhoneOff() {
		return PhoneOff;
	}

	public void setPhoneOff(String phoneOff) {
		PhoneOff = phoneOff;
	}

	public String getPhoneResi() {
		return phoneResi;
	}

	public void setPhoneResi(String phoneResi) {
		this.phoneResi = phoneResi;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPerson1() {
		return person1;
	}

	public void setPerson1(String person1) {
		this.person1 = person1;
	}

	public String getPerson2() {
		return person2;
	}

	public void setPerson2(String person2) {
		this.person2 = person2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public Integer getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(Integer transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public Timestamp getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Timestamp openingDate) {
		this.openingDate = openingDate;
	}

	public Integer getOpeningRlocalBalace() {
		return openingRlocalBalace;
	}

	public void setOpeningRlocalBalace(Integer openingRlocalBalace) {
		this.openingRlocalBalace = openingRlocalBalace;
	}

	public Integer getOpeningRdollarBalace() {
		return openingRdollarBalace;
	}

	public void setOpeningRdollarBalace(Integer openingRdollarBalace) {
		this.openingRdollarBalace = openingRdollarBalace;
	}

	public Integer getOpeningRexchangeRate() {
		return openingRexchangeRate;
	}

	public void setOpeningRexchangeRate(Integer openingRexchangeRate) {
		this.openingRexchangeRate = openingRexchangeRate;
	}

	public Integer getNetRlocalBalance() {
		return netRlocalBalance;
	}

	public void setNetRlocalBalance(Integer netRlocalBalance) {
		this.netRlocalBalance = netRlocalBalance;
	}

	public Integer getNetRdollarBalance() {
		return netRdollarBalance;
	}

	public void setNetRdollarBalance(Integer netRdollarBalance) {
		this.netRdollarBalance = netRdollarBalance;
	}

	public Integer getrExchangeRate() {
		return rExchangeRate;
	}

	public void setrExchangeRate(Integer rExchangeRate) {
		this.rExchangeRate = rExchangeRate;
	}

	public Integer getOpeningPlocalBalace() {
		return openingPlocalBalace;
	}

	public void setOpeningPlocalBalace(Integer openingPlocalBalace) {
		this.openingPlocalBalace = openingPlocalBalace;
	}

	public Integer getOpeningPdollarBalace() {
		return openingPdollarBalace;
	}

	public void setOpeningPdollarBalace(Integer openingPdollarBalace) {
		this.openingPdollarBalace = openingPdollarBalace;
	}

	public Integer getOpeningPexchangeRate() {
		return openingPexchangeRate;
	}

	public void setOpeningPexchangeRate(Integer openingPexchangeRate) {
		this.openingPexchangeRate = openingPexchangeRate;
	}

	public Integer getNetPlocalBalance() {
		return netPlocalBalance;
	}

	public void setNetPlocalBalance(Integer netPlocalBalance) {
		this.netPlocalBalance = netPlocalBalance;
	}

	public Integer getNetPdollarBalance() {
		return netPdollarBalance;
	}

	public void setNetPdollarBalance(Integer netPdollarBalance) {
		this.netPdollarBalance = netPdollarBalance;
	}

	public Integer getpExchangeRate() {
		return pExchangeRate;
	}

	public void setpExchangeRate(Integer pExchangeRate) {
		this.pExchangeRate = pExchangeRate;
	}

	public Integer getOpeningPnlocalBalace() {
		return openingPnlocalBalace;
	}

	public void setOpeningPnlocalBalace(Integer openingPnlocalBalace) {
		this.openingPnlocalBalace = openingPnlocalBalace;
	}

	public Integer getOpeningPndollarBalace() {
		return openingPndollarBalace;
	}

	public void setOpeningPndollarBalace(Integer openingPndollarBalace) {
		this.openingPndollarBalace = openingPndollarBalace;
	}

	public Integer getOpeningPnexchangeRate() {
		return openingPnexchangeRate;
	}

	public void setOpeningPnexchangeRate(Integer openingPnexchangeRate) {
		this.openingPnexchangeRate = openingPnexchangeRate;
	}

	public Boolean getSale() {
		return sale;
	}

	public void setSale(Boolean sale) {
		this.sale = sale;
	}

	public Boolean getPurchase() {
		return purchase;
	}

	public void setPurchase(Boolean purchase) {
		this.purchase = purchase;
	}

	public Boolean getPn() {
		return pn;
	}

	public void setPn(Boolean pn) {
		this.pn = pn;
	}

	public Integer getPurchaseAdvanceLocal() {
		return purchaseAdvanceLocal;
	}

	public void setPurchaseAdvanceLocal(Integer purchaseAdvanceLocal) {
		this.purchaseAdvanceLocal = purchaseAdvanceLocal;
	}

	public Integer getSaleAdvanceLocal() {
		return saleAdvanceLocal;
	}

	public void setSaleAdvanceLocal(Integer saleAdvanceLocal) {
		this.saleAdvanceLocal = saleAdvanceLocal;
	}

	public Integer getPnAdvanceLocal() {
		return pnAdvanceLocal;
	}

	public void setPnAdvanceLocal(Integer pnAdvanceLocal) {
		this.pnAdvanceLocal = pnAdvanceLocal;
	}

	public Integer getPurchaseAdvanceDollar() {
		return purchaseAdvanceDollar;
	}

	public void setPurchaseAdvanceDollar(Integer purchaseAdvanceDollar) {
		this.purchaseAdvanceDollar = purchaseAdvanceDollar;
	}

	public Integer getSaleAdvanceDollar() {
		return saleAdvanceDollar;
	}

	public void setSaleAdvanceDollar(Integer saleAdvanceDollar) {
		this.saleAdvanceDollar = saleAdvanceDollar;
	}

	public Integer getPnAdvanceDollar() {
		return pnAdvanceDollar;
	}

	public void setPnAdvanceDollar(Integer pnAdvanceDollar) {
		this.pnAdvanceDollar = pnAdvanceDollar;
	}

	public Integer getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Integer paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Integer getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Integer closingDate) {
		this.closingDate = closingDate;
	}

	public Integer getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Boolean getShikesho() {
		return shikesho;
	}

	public void setShikesho(Boolean shikesho) {
		this.shikesho = shikesho;
	}

	public Integer getDueDays() {
		return dueDays;
	}

	public void setDueDays(Integer dueDays) {
		this.dueDays = dueDays;
	}

	public UUID getSalesPersonId() {
		return salesPersonId;
	}

	public void setSalesPersonId(UUID salesPersonId) {
		this.salesPersonId = salesPersonId;
	}

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
		this.yearEndId = yearEndId;
	}

	public String getCompanyPartyNameNative() {
		return companyPartyNameNative;
	}

	public void setCompanyPartyNameNative(String companyPartyNameNative) {
		this.companyPartyNameNative = companyPartyNameNative;
	}

	public String getAddress1Native() {
		return address1Native;
	}

	public void setAddress1Native(String address1Native) {
		this.address1Native = address1Native;
	}

	public String getAddress2Native() {
		return address2Native;
	}

	public void setAddress2Native(String address2Native) {
		this.address2Native = address2Native;
	}

	public String getAddress3Native() {
		return address3Native;
	}

	public void setAddress3Native(String address3Native) {
		this.address3Native = address3Native;
	}

	public String getCityNative() {
		return cityNative;
	}

	public void setCityNative(String cityNative) {
		this.cityNative = cityNative;
	}

	public String getCountryNative() {
		return countryNative;
	}

	public void setCountryNative(String countryNative) {
		this.countryNative = countryNative;
	}

	public UUID getPaymentTermsId() {
		return paymentTermsId;
	}

	public void setPaymentTermsId(UUID paymentTermsId) {
		this.paymentTermsId = paymentTermsId;
	}

	public UUID getPnRealisationId() {
		return pnRealisationId;
	}

	public void setPnRealisationId(UUID pnRealisationId) {
		this.pnRealisationId = pnRealisationId;
	}

	public Integer getBankCharges() {
		return bankCharges;
	}

	public void setBankCharges(Integer bankCharges) {
		this.bankCharges = bankCharges;
	}

	public String getPnNarration() {
		return pnNarration;
	}

	public void setPnNarration(String pnNarration) {
		this.pnNarration = pnNarration;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
