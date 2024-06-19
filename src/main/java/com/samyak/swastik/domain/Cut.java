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
@Table(name = "MASTER_CUT")
public class Cut implements Serializable {

	private static final long serialVersionUID = -4856794525215743382L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "CUT_ID")
	private UUID cutId;
	@Column(name = "CUT_NAME")
	private String cutName;
	@Column(name = "CUT_DESCRIPTION")
	private String cutDescription;
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
	@Column(name = "CUT_NAME_NATIVE")
	private String cutNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getCutId() {
		return cutId;
	}

	public void setCutId(UUID cutId) {
		this.cutId = cutId;
	}

	public String getCutName() {
		return cutName;
	}

	public void setCutName(String cutName) {
		this.cutName = cutName;
	}

	public String getCutDescription() {
		return cutDescription;
	}

	public void setCutDescription(String cutDescription) {
		this.cutDescription = cutDescription;
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

	public String getCutNameNative() {
		return cutNameNative;
	}

	public void setCutNameNative(String cutNameNative) {
		this.cutNameNative = cutNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
