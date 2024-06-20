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
@Table(name = "MASTER_SIZE")
public class Size implements Serializable {

	private static final long serialVersionUID = 8762735680131616960L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "SIZE_ID")
	private UUID sizeId;
	@Column(name = "SIZE_NAME")
	private String sizeName;
	@Column(name = "SIZE_DESCRIPTION")
	private String sizeDescription;
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
	@Column(name = "SIZE_NAME_NATIVE")
	private String sizeNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getSizeId() {
		return sizeId;
	}

	public void setSizeId(UUID sizeId) {
		this.sizeId = sizeId;
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

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	public String getSizeDescription() {
		return sizeDescription;
	}

	public void setSizeDescription(String sizeDescription) {
		this.sizeDescription = sizeDescription;
	}

	public String getSizeNameNative() {
		return sizeNameNative;
	}

	public void setSizeNameNative(String sizeNameNative) {
		this.sizeNameNative = sizeNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
