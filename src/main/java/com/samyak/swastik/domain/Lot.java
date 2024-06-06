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
	private Integer carats;

	@Column(name = "AVAILABLE_CARATS")
	private Integer availableCarats;

	@Column(name = "REORDER_QUANTITY")
	private Integer reorderQuantity;

	@Column(name = "PURCHASE")
	private Boolean purchase;

	@Column(name = "DRWG_FILE_NAME")
	private String drwgFileName;

	@Column(name = "CREATED_ON")
	private Timestamp createdOn;

	@Column(name = "CREATED_BY")
	private Integer createdBy;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "YEAR_END_ID")
	private Integer yearENdId;

	@Column(name = "RAPAPORT_LOCAL_RATE")
	private Integer rapaportLocalRate;

	@Column(name = "RAPAPORT_DOLLAR_RATE")
	private Integer rapaportLocalDollar;

	@Column(name = "GIA_FILE_NAME")
	private String giaFileName;

	@Column(name = "REF_DESIGN_GROUP_ID")
	private UUID refDesignGroupId;

	@Column(name = "MFG_ID")
	private UUID mfgId;

	@Column(name = "X1_BASE_RATE")
	private Integer x1BaseRate;

	@Column(name = "X2MF")
	private Integer x2mf;

	@Column(name = "X3MF")
	private Integer x3mf;

	@Column(name = "X4MF")
	private Integer x4mf;

	@Column(name = "X5MF")
	private Integer x5mf;

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

	public Integer getCarats() {
		return carats;
	}

	public void setCarats(Integer carats) {
		this.carats = carats;
	}

	public Integer getAvailableCarats() {
		return availableCarats;
	}

	public void setAvailableCarats(Integer availableCarats) {
		this.availableCarats = availableCarats;
	}

	public Integer getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(Integer reorderQuantity) {
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

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
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

	public Integer getYearENdId() {
		return yearENdId;
	}

	public void setYearENdId(Integer yearENdId) {
		this.yearENdId = yearENdId;
	}

	public Integer getRapaportLocalRate() {
		return rapaportLocalRate;
	}

	public void setRapaportLocalRate(Integer rapaportLocalRate) {
		this.rapaportLocalRate = rapaportLocalRate;
	}

	public Integer getRapaportLocalDollar() {
		return rapaportLocalDollar;
	}

	public void setRapaportLocalDollar(Integer rapaportLocalDollar) {
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

	public Integer getX1BaseRate() {
		return x1BaseRate;
	}

	public void setX1BaseRate(Integer x1BaseRate) {
		this.x1BaseRate = x1BaseRate;
	}

	public Integer getX2mf() {
		return x2mf;
	}

	public void setX2mf(Integer x2mf) {
		this.x2mf = x2mf;
	}

	public Integer getX3mf() {
		return x3mf;
	}

	public void setX3mf(Integer x3mf) {
		this.x3mf = x3mf;
	}

	public Integer getX4mf() {
		return x4mf;
	}

	public void setX4mf(Integer x4mf) {
		this.x4mf = x4mf;
	}

	public Integer getX5mf() {
		return x5mf;
	}

	public void setX5mf(Integer x5mf) {
		this.x5mf = x5mf;
	}

	public UUID getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(UUID supplierId) {
		this.supplierId = supplierId;
	}

}
