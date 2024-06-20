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
@Table(name = "MASTER_UNIT")
public class Unit implements Serializable {

	private static final long serialVersionUID = 7378142981469886647L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "UNIT_ID")
	private UUID unitId;
	@Column(name = "COMPANY_ID")
	private Integer companyId;
	@Column(name = "UNIT_NAME")
	private String unitName;
	@Column(name = "UNIT_CODE")
	private String unitCode;
	@Column(name = "UNIT_DESCRIPTION")
	private String unitDescription;
	@Column(name = "SR_NO")
	private Integer srNo;
	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;
	@Column(name = "ACTIVE")
	private Boolean active;
	@Column(name = "YEAR_END_ID")
	private Double yearEndId;
	@Column(name = "UNIT_NAME_NATIVE")
	private String unitNameNative;
	@Column(name = "DECIMAL_PLACES")
	private String decimalPlaces;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getUnitId() {
		return unitId;
	}

	public void setUnitId(UUID unitId) {
		this.unitId = unitId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitDescription() {
		return unitDescription;
	}

	public void setUnitDescription(String unitDescription) {
		this.unitDescription = unitDescription;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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

	public String getUnitNameNative() {
		return unitNameNative;
	}

	public void setUnitNameNative(String unitNameNative) {
		this.unitNameNative = unitNameNative;
	}

	public String getDecimalPlaces() {
		return decimalPlaces;
	}

	public void setDecimalPlaces(String decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
