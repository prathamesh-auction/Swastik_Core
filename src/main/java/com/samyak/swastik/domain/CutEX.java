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
@Table(name = "MASTER_CUT_EX")
public class CutEX implements Serializable {

	private static final long serialVersionUID = 666884495950839310L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "CUTEX_ID")
	private UUID cutEXId;
	@Column(name = "CUTEX_NAME")
	private String cutEXName;
	@Column(name = "CUTEX_DESCRIPTION")
	private String cutEXDescription;
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
	@Column(name = "CUTEX_NAME_NATIVE")
	private String cutEXNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getCutEXId() {
		return cutEXId;
	}

	public void setCutEXId(UUID cutEXId) {
		this.cutEXId = cutEXId;
	}

	public String getCutEXName() {
		return cutEXName;
	}

	public void setCutEXName(String cutEXName) {
		this.cutEXName = cutEXName;
	}

	public String getCutEXDescription() {
		return cutEXDescription;
	}

	public void setCutEXDescription(String cutEXDescription) {
		this.cutEXDescription = cutEXDescription;
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

	public String getCutEXNameNative() {
		return cutEXNameNative;
	}

	public void setCutEXNameNative(String cutEXNameNative) {
		this.cutEXNameNative = cutEXNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
