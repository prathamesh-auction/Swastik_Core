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
@Table(name = "LOT")
public class Lot implements Serializable {

	private static final long serialVersionUID = -757895560485496640L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LOT_ID")
	private UUID lotId;

	@Column(name = "COMPANY_ID")
	private UUID companyId;

	@Column(name = "LOT_NO")
	private String lotNo;

	@Column(name = "LOT_NAME")
	private String lotName;

	@Column(name = "LOT_DESCRIPTION")
	private String lotDescription;

	@Column(name = "LOT_REFERENCE")
	private String lotRefrence;

	@Column(name = "LOT_CATEGORY_ID")
	private UUID lotCategoryId;

	@Column(name = "LOTSUB_CATEGORY_ID")
	private UUID lotSubCategoryId;

	@Column(name = "UNIT_ID")
	private UUID unitId;

	@Column(name = "CARATS")
	private Double carats;

	@Column(name = "AVAILABLE_CARATS")
	private Double availableCarats;

	@Column(name = "REORDER_QUANTITY")
	private Double reorderQuantity;

	@Column(name = "PURCHASE")
	private Boolean purchase;

	@Column(name = "DRWG_FILE_NAME")
	private String drwgFileName;

	@Column(name = "CREATED_ON")
	private Timestamp createdOn;

	@Column(name = "CREATED_BY")
	private Double createdBy;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "YEAR_END_ID")
	private Double yearENdId;

	@Column(name = "RAPAPORT_LOCAL_RATE")
	private Double rapaportLocalRate;

	@Column(name = "RAPAPORT_DOLLAR_RATE")
	private Double rapaportLocalDollar;

	@Column(name = "GIA_FILE_NAME")
	private String giaFileName;

	@Column(name = "REF_DESIGN_GROUP_ID")
	private UUID refDesignGroupId;

	@Column(name = "MFG_ID")
	private UUID mfgId;

	@Column(name = "X1_BASE_RATE")
	private Double x1BaseRate;

	@Column(name = "X2MF")
	private Double x2mf;

	@Column(name = "X3MF")
	private Double x3mf;

	@Column(name = "X4MF")
	private Double x4mf;

	@Column(name = "X5MF")
	private Double x5mf;

	@Column(name = "SUPPLIER_ID")
	private UUID supplierId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public String getLotNo() {
		return lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public String getLotName() {
		return lotName;
	}

	public void setLotName(String lotName) {
		this.lotName = lotName;
	}

	public String getLotDescription() {
		return lotDescription;
	}

	public void setLotDescription(String lotDescription) {
		this.lotDescription = lotDescription;
	}

	public String getLotRefrence() {
		return lotRefrence;
	}

	public void setLotRefrence(String lotRefrence) {
		this.lotRefrence = lotRefrence;
	}

	public UUID getLotCategoryId() {
		return lotCategoryId;
	}

	public void setLotCategoryId(UUID lotCategoryId) {
		this.lotCategoryId = lotCategoryId;
	}

	public UUID getLotSubCategoryId() {
		return lotSubCategoryId;
	}

	public void setLotSubCategoryId(UUID lotSubCategoryId) {
		this.lotSubCategoryId = lotSubCategoryId;
	}

	public UUID getUnitId() {
		return unitId;
	}

	public void setUnitId(UUID unitId) {
		this.unitId = unitId;
	}

	public Double getCarats() {
		return carats;
	}

	public void setCarats(Double carats) {
		this.carats = carats;
	}

	public Double getAvailableCarats() {
		return availableCarats;
	}

	public void setAvailableCarats(Double availableCarats) {
		this.availableCarats = availableCarats;
	}

	public Double getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(Double reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

	public Boolean getPurchase() {
		return purchase;
	}

	public void setPurchase(Boolean purchase) {
		this.purchase = purchase;
	}

	public String getDrwgFileName() {
		return drwgFileName;
	}

	public void setDrwgFileName(String drwgFileName) {
		this.drwgFileName = drwgFileName;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Double getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Double createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
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

	public Double getYearENdId() {
		return yearENdId;
	}

	public void setYearENdId(Double yearENdId) {
		this.yearENdId = yearENdId;
	}

	public Double getRapaportLocalRate() {
		return rapaportLocalRate;
	}

	public void setRapaportLocalRate(Double rapaportLocalRate) {
		this.rapaportLocalRate = rapaportLocalRate;
	}

	public Double getRapaportLocalDollar() {
		return rapaportLocalDollar;
	}

	public void setRapaportLocalDollar(Double rapaportLocalDollar) {
		this.rapaportLocalDollar = rapaportLocalDollar;
	}

	public String getGiaFileName() {
		return giaFileName;
	}

	public void setGiaFileName(String giaFileName) {
		this.giaFileName = giaFileName;
	}

	public UUID getRefDesignGroupId() {
		return refDesignGroupId;
	}

	public void setRefDesignGroupId(UUID refDesignGroupId) {
		this.refDesignGroupId = refDesignGroupId;
	}

	public UUID getMfgId() {
		return mfgId;
	}

	public void setMfgId(UUID mfgId) {
		this.mfgId = mfgId;
	}

	public Double getX1BaseRate() {
		return x1BaseRate;
	}

	public void setX1BaseRate(Double x1BaseRate) {
		this.x1BaseRate = x1BaseRate;
	}

	public Double getX2mf() {
		return x2mf;
	}

	public void setX2mf(Double x2mf) {
		this.x2mf = x2mf;
	}

	public Double getX3mf() {
		return x3mf;
	}

	public void setX3mf(Double x3mf) {
		this.x3mf = x3mf;
	}

	public Double getX4mf() {
		return x4mf;
	}

	public void setX4mf(Double x4mf) {
		this.x4mf = x4mf;
	}

	public Double getX5mf() {
		return x5mf;
	}

	public void setX5mf(Double x5mf) {
		this.x5mf = x5mf;
	}

	public UUID getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(UUID supplierId) {
		this.supplierId = supplierId;
	}

}
