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
@Table(name = "MASTER_CUT_HS")
public class CutHS implements Serializable {

	private static final long serialVersionUID = -6466127885387101357L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "CUTHS_ID")
	private UUID cutHSId;
	@Column(name = "CUTHS_NAME")
	private String cutHSName;
	@Column(name = "CUTHS_DESCRIPTION")
	private String cutHSDescription;
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
	@Column(name = "CUTHS_NAME_NATIVE")
	private String cutHSNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getCutHSId() {
		return cutHSId;
	}

	public void setCutHSId(UUID cutHSId) {
		this.cutHSId = cutHSId;
	}

	public String getCutHSName() {
		return cutHSName;
	}

	public void setCutHSName(String cutHSName) {
		this.cutHSName = cutHSName;
	}

	public String getCutHSDescription() {
		return cutHSDescription;
	}

	public void setCutHSDescription(String cutHSDescription) {
		this.cutHSDescription = cutHSDescription;
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

	public String getCutHSNameNative() {
		return cutHSNameNative;
	}

	public void setCutHSNameNative(String cutHSNameNative) {
		this.cutHSNameNative = cutHSNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
