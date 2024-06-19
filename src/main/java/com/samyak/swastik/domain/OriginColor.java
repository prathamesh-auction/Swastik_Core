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
@Table(name = "MASTER_ORIGIN_COLOR")
public class OriginColor implements Serializable {

	private static final long serialVersionUID = 5041275141859714209L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "ORIGINCOLOR_ID")
	private UUID originColorId;
	@Column(name = "ORIGINCOLOR_NAME")
	private String originColorName;
	@Column(name = "ORIGINCOLOR_DESCRIPTION")
	private String originColorDescription;
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
	@Column(name = "ORIGINCOLOR_NAME_NATIVE")
	private String originColorNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getOriginColorId() {
		return originColorId;
	}

	public void setOriginColorId(UUID originColorId) {
		this.originColorId = originColorId;
	}

	public String getOriginColorName() {
		return originColorName;
	}

	public void setOriginColorName(String originColorName) {
		this.originColorName = originColorName;
	}

	public String getOriginColorDescription() {
		return originColorDescription;
	}

	public void setOriginColorDescription(String originColorDescription) {
		this.originColorDescription = originColorDescription;
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

	public String getOriginColorNameNative() {
		return originColorNameNative;
	}

	public void setOriginColorNameNative(String originColorNameNative) {
		this.originColorNameNative = originColorNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
