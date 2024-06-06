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
	private Integer carats;
	private Integer availableCarats;
	private Integer reorderQuantity;
	private Boolean purchase;
	private String drwgFileName;
	private Timestamp createdOn;
	private Integer createdBy;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String modifiedMachineName;
	private Boolean active;
	private Integer yearENdId;
	private Integer rapaportLocalRate;
	private Integer rapaportLocalDollar;
	private String giaFileName;
	private UUID refDesignGroupId;
	private UUID mfgId;
	private Integer x1BaseRate;
	private Integer x2mf;
	private Integer x3mf;
	private Integer x4mf;
	private Integer x5mf;
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
