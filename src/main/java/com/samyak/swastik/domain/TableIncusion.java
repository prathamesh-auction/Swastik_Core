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
@Table(name = "MASTER_TABLEINCUSION")
public class TableIncusion implements Serializable {

	private static final long serialVersionUID = -5324429357141169596L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "TABLEINCUSION_ID")
	private UUID tableIncusionId;
	@Column(name = "TABLEINCUSION_NAME")
	private String tableIncusionName;
	@Column(name = "TABLEINCUSION_DESCRIPTION")
	private String tableIncusionDescription;
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
	@Column(name = "TABLEINCUSION_NAME_NATIVE")
	private String tableIncusionNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getTableIncusionId() {
		return tableIncusionId;
	}

	public void setTableIncusionId(UUID tableIncusionId) {
		this.tableIncusionId = tableIncusionId;
	}

	public String getTableIncusionName() {
		return tableIncusionName;
	}

	public void setTableIncusionName(String tableIncusionName) {
		this.tableIncusionName = tableIncusionName;
	}

	public String getTableIncusionDescription() {
		return tableIncusionDescription;
	}

	public void setTableIncusionDescription(String tableIncusionDescription) {
		this.tableIncusionDescription = tableIncusionDescription;
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

	public String getTableIncusionNameNative() {
		return tableIncusionNameNative;
	}

	public void setTableIncusionNameNative(String tableIncusionNameNative) {
		this.tableIncusionNameNative = tableIncusionNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
