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
@Table(name = "MASTER_LUSTER")
public class Luster implements Serializable {

	private static final long serialVersionUID = 3714836837263927091L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "LUSTER_ID")
	private UUID lusterId;
	@Column(name = "LUSTER_NAME")
	private String lusterName;
	@Column(name = "LUSTER_DESCRIPTION")
	private String lusterDescription;
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
	@Column(name = "LUSTER_NAME_NATIVE")
	private String lusterNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getLusterId() {
		return lusterId;
	}

	public void setLusterId(UUID lusterId) {
		this.lusterId = lusterId;
	}

	public String getLusterName() {
		return lusterName;
	}

	public void setLusterName(String lusterName) {
		this.lusterName = lusterName;
	}

	public String getLusterDescription() {
		return lusterDescription;
	}

	public void setLusterDescription(String lusterDescription) {
		this.lusterDescription = lusterDescription;
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

	public String getLusterNameNative() {
		return lusterNameNative;
	}

	public void setLusterNameNative(String lusterNameNative) {
		this.lusterNameNative = lusterNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
