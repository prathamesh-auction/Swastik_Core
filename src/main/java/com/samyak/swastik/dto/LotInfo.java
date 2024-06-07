package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class LotInfo {

	private UUID lotId;
	private UUID companyId;
	private String lotDescription;
	private String lotRefrence;
	private UUID lotCategoryId;
	private UUID lotSubCategoryId;
	private UUID unitId;
	private Double carats;
	private Double availableCarats;
	private Double reorderQuantity;
	private Boolean purchase;
	private String drwgFileName;
	private Timestamp createdOn;
	private Double createdBy;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Double yearENdId;
	private Double rapaportLocalRate;
	private Double rapaportLocalDollar;
	private String giaFileName;
	private UUID refDesignGroupId;
	private UUID mfgId;
	private Double x1BaseRate;
	private Double x2mf;
	private Double x3mf;
	private Double x4mf;
	private Double x5mf;
	private UUID supplierId;

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
