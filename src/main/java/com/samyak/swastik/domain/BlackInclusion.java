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
@Table(name = "MASTER_BLACKINCLUSION")
public class BlackInclusion implements Serializable {

	private static final long serialVersionUID = 1882329445813355726L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "BLACK_INCLUSIONID")
	private UUID blackInclusionId;
	@Column(name = "BLACK_INCLUSION_NAME")
	private String blackInclusionName;
	@Column(name = "BLACK_INCLUSION_DESCRIPTION")
	private String blackInclusionDescription;
	@Column(name = "SRNO")
	private Integer srNo;
	@Column(name = "MODIFIEDON")
	private Timestamp modifiedOn;
	@Column(name = "MODIFIEDBY")
	private String modifiedBy;
	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;
	@Column(name = "ACTIVE")
	private Boolean active;
	@Column(name = "YEAR_END")
	private Double yearEndId;
	@Column(name = "BLACKINCLUSION_NAME_NATIVE")
	private String blackInclusionNameNative;

	public UUID getBlackInclusionId() {
		return blackInclusionId;
	}

	public void setBlackInclusionId(UUID blackInclusionId) {
		this.blackInclusionId = blackInclusionId;
	}

	public String getBlackInclusionName() {
		return blackInclusionName;
	}

	public void setBlackInclusionName(String blackInclusionName) {
		this.blackInclusionName = blackInclusionName;
	}

	public String getBlackInclusionDescription() {
		return blackInclusionDescription;
	}

	public void setBlackInclusionDescription(String blackInclusionDescription) {
		this.blackInclusionDescription = blackInclusionDescription;
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

	public String getBlackInclusionNameNative() {
		return blackInclusionNameNative;
	}

	public void setBlackInclusionNameNative(String blackInclusionNameNative) {
		this.blackInclusionNameNative = blackInclusionNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
