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
@Table(name = "MASTER_SYMMETRY")
public class Symmetry implements Serializable {

	private static final long serialVersionUID = 8309985911058321240L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "SYMMETRY_ID")
	private UUID symmetryId;
	@Column(name = "SYMMETRY_NAME")
	private String symmetryName;
	@Column(name = "SYMMETRY_DESCRIPTION")
	private String symmetryDescription;
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
	@Column(name = "SYMMETRY_NAME_NATIVE")
	private String symmetryNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getSymmetryId() {
		return symmetryId;
	}

	public void setSymmetryId(UUID symmetryId) {
		this.symmetryId = symmetryId;
	}

	public String getSymmetryName() {
		return symmetryName;
	}

	public void setSymmetryName(String symmetryName) {
		this.symmetryName = symmetryName;
	}

	public String getSymmetryDescription() {
		return symmetryDescription;
	}

	public void setSymmetryDescription(String symmetryDescription) {
		this.symmetryDescription = symmetryDescription;
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

	public String getSymmetryNameNative() {
		return symmetryNameNative;
	}

	public void setSymmetryNameNative(String symmetryNameNative) {
		this.symmetryNameNative = symmetryNameNative;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
