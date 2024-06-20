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
@Table(name = "MASTER_SHADE")
public class Shade implements Serializable {

	private static final long serialVersionUID = 302836321757704126L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "SHADE_ID")
	private UUID shadeId;
	@Column(name = "SHADE_NAME")
	private String shadeName;
	@Column(name = "SHADE_DESCRIPTION")
	private String shadeDescription;
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
	@Column(name = "SHADE_NAME_NATIVE")
	private String shadeNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getShadeId() {
		return shadeId;
	}

	public void setShadeId(UUID shadeId) {
		this.shadeId = shadeId;
	}

	public String getShadeName() {
		return shadeName;
	}

	public void setShadeName(String shadeName) {
		this.shadeName = shadeName;
	}

	public String getShadeDescription() {
		return shadeDescription;
	}

	public void setShadeDescription(String shadeDescription) {
		this.shadeDescription = shadeDescription;
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

	public String getShadeNameNative() {
		return shadeNameNative;
	}

	public void setShadeNameNative(String shadeNameNative) {
		this.shadeNameNative = shadeNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
