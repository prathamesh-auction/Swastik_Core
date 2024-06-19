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
@Table(name = "MASTER_PURITY")
public class Purity implements Serializable {

	private static final long serialVersionUID = 3300733097438611388L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "PURITY_ID")
	private UUID purityId;
	@Column(name = "PURITY_NAME")
	private String purityName;
	@Column(name = "PURITY_DESCRIPTION")
	private String purityDescription;
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
	@Column(name = "YEAR_END")
	private Double yearEndId;
	@Column(name = "PURITY_NAME_NATIVE")
	private String purityNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getPurityId() {
		return purityId;
	}

	public void setPurityId(UUID purityId) {
		this.purityId = purityId;
	}

	public String getPurityName() {
		return purityName;
	}

	public void setPurityName(String purityName) {
		this.purityName = purityName;
	}

	public String getPurityDescription() {
		return purityDescription;
	}

	public void setPurityDescription(String purityDescription) {
		this.purityDescription = purityDescription;
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

	public String getPurityNameNative() {
		return purityNameNative;
	}

	public void setPurityNameNative(String purityNameNative) {
		this.purityNameNative = purityNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
