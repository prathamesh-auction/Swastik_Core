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
@Table(name = "MASTER_OPENINCLUSION")
public class OpenInclusion implements Serializable {

	private static final long serialVersionUID = -1572667029327305303L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "OPENINCLUSION_ID")
	private UUID openInclusionId;
	@Column(name = "OPENINCLUSION_NAME")
	private String openInclusionName;
	@Column(name = "OPENINCLUSION_DESCRIPTION")
	private String openInclusionDescription;
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
	@Column(name = "OPENINCLUSION_NAME_NATIVE")
	private String openInclusionNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getOpenInclusionId() {
		return openInclusionId;
	}

	public void setOpenInclusionId(UUID openInclusionId) {
		this.openInclusionId = openInclusionId;
	}

	public String getOpenInclusionName() {
		return openInclusionName;
	}

	public void setOpenInclusionName(String openInclusionName) {
		this.openInclusionName = openInclusionName;
	}

	public String getOpenInclusionDescription() {
		return openInclusionDescription;
	}

	public void setOpenInclusionDescription(String openInclusionDescription) {
		this.openInclusionDescription = openInclusionDescription;
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

	public String getOpenInclusionNameNative() {
		return openInclusionNameNative;
	}

	public void setOpenInclusionNameNative(String openInclusionNameNative) {
		this.openInclusionNameNative = openInclusionNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
