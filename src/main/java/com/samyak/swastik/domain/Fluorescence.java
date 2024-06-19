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
@Table(name = "MASTER_FLUORESCENCE")
public class Fluorescence implements Serializable {

	private static final long serialVersionUID = -6078719708239712214L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "FLUORESCENCE_ID")
	private UUID fluorescenceId;
	@Column(name = "FLUORESCENCE_NAME")
	private String fluorescenceName;
	@Column(name = "FLUORESCENCE_DESCRIPTION")
	private String fluorescenceDescription;
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
	@Column(name = "FLUORESCENCE_NAME_NATIVE")
	private String fluorescenceNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getFluorescenceId() {
		return fluorescenceId;
	}

	public void setFluorescenceId(UUID fluorescenceId) {
		this.fluorescenceId = fluorescenceId;
	}

	public String getFluorescenceName() {
		return fluorescenceName;
	}

	public void setFluorescenceName(String fluorescenceName) {
		this.fluorescenceName = fluorescenceName;
	}

	public String getFluorescenceDescription() {
		return fluorescenceDescription;
	}

	public void setFluorescenceDescription(String fluorescenceDescription) {
		this.fluorescenceDescription = fluorescenceDescription;
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

	public String getFluorescenceNameNative() {
		return fluorescenceNameNative;
	}

	public void setFluorescenceNameNative(String fluorescenceNameNative) {
		this.fluorescenceNameNative = fluorescenceNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
