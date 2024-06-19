package com.samyak.swastik.domain;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JEWELRY")
public class Jewelry implements Serializable {

	private static final long serialVersionUID = -2296244339184800666L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	private UUID lotId;
	private String clientNo;
	private Double totalWeight;
	private Double grossWeight;
	private Double metalWeight;
	private UUID itemTypeId;
	private UUID countryId;
	private UUID treatmentId;
	private UUID colorStoneId;
	private UUID goldId;
	private UUID platinumId;
	private Double goldQty;
	private Double platinumQty;
	private Double sellingPrice;
	private Double tagPrice;
	private UUID shapeId;
	private Integer noOfStones;
	private Integer bookNo;
	private UUID groupCodeId;
	private UUID supplierId;
	private Double diamondWeight;
	private Double colorStoneWeight;
	private UUID goldMetalTypeId;
	private String priceCode;
	private Double yearEndId;
	private String styleNo;
	private UUID subCategoryId;
	private UUID descriptionId;
	private UUID groupId;
	private String description1;
	private String description2;
	private String designNo;
	private String ringSize;
	private Double goldRate;
	private String diamondQuality;

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public String getClientNo() {
		return clientNo;
	}

	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	public Double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Double getMetalWeight() {
		return metalWeight;
	}

	public void setMetalWeight(Double metalWeight) {
		this.metalWeight = metalWeight;
	}

	public UUID getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(UUID itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public UUID getCountryId() {
		return countryId;
	}

	public void setCountryId(UUID countryId) {
		this.countryId = countryId;
	}

	public UUID getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(UUID treatmentId) {
		this.treatmentId = treatmentId;
	}

	public UUID getColorStoneId() {
		return colorStoneId;
	}

	public void setColorStoneId(UUID colorStoneId) {
		this.colorStoneId = colorStoneId;
	}

	public UUID getGoldId() {
		return goldId;
	}

	public void setGoldId(UUID goldId) {
		this.goldId = goldId;
	}

	public UUID getPlatinumId() {
		return platinumId;
	}

	public void setPlatinumId(UUID platinumId) {
		this.platinumId = platinumId;
	}

	public Double getGoldQty() {
		return goldQty;
	}

	public void setGoldQty(Double goldQty) {
		this.goldQty = goldQty;
	}

	public Double getPlatinumQty() {
		return platinumQty;
	}

	public void setPlatinumQty(Double platinumQty) {
		this.platinumQty = platinumQty;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getTagPrice() {
		return tagPrice;
	}

	public void setTagPrice(Double tagPrice) {
		this.tagPrice = tagPrice;
	}

	public UUID getShapeId() {
		return shapeId;
	}

	public void setShapeId(UUID shapeId) {
		this.shapeId = shapeId;
	}

	public Integer getNoOfStones() {
		return noOfStones;
	}

	public void setNoOfStones(Integer noOfStones) {
		this.noOfStones = noOfStones;
	}

	public Integer getBookNo() {
		return bookNo;
	}

	public void setBookNo(Integer bookNo) {
		this.bookNo = bookNo;
	}

	public UUID getGroupCodeId() {
		return groupCodeId;
	}

	public void setGroupCodeId(UUID groupCodeId) {
		this.groupCodeId = groupCodeId;
	}

	public UUID getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(UUID supplierId) {
		this.supplierId = supplierId;
	}

	public Double getDiamondWeight() {
		return diamondWeight;
	}

	public void setDiamondWeight(Double diamondWeight) {
		this.diamondWeight = diamondWeight;
	}

	public Double getColorStoneWeight() {
		return colorStoneWeight;
	}

	public void setColorStoneWeight(Double colorStoneWeight) {
		this.colorStoneWeight = colorStoneWeight;
	}

	public UUID getGoldMetalTypeId() {
		return goldMetalTypeId;
	}

	public void setGoldMetalTypeId(UUID goldMetalTypeId) {
		this.goldMetalTypeId = goldMetalTypeId;
	}

	public String getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(String priceCode) {
		this.priceCode = priceCode;
	}

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

	public String getStyleNo() {
		return styleNo;
	}

	public void setStyleNo(String styleNo) {
		this.styleNo = styleNo;
	}

	public UUID getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(UUID subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public UUID getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(UUID descriptionId) {
		this.descriptionId = descriptionId;
	}

	public UUID getGroupId() {
		return groupId;
	}

	public void setGroupId(UUID groupId) {
		this.groupId = groupId;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getDesignNo() {
		return designNo;
	}

	public void setDesignNo(String designNo) {
		this.designNo = designNo;
	}

	public String getRingSize() {
		return ringSize;
	}

	public void setRingSize(String ringSize) {
		this.ringSize = ringSize;
	}

	public Double getGoldRate() {
		return goldRate;
	}

	public void setGoldRate(Double goldRate) {
		this.goldRate = goldRate;
	}

	public String getDiamondQuality() {
		return diamondQuality;
	}

	public void setDiamondQuality(String diamondQuality) {
		this.diamondQuality = diamondQuality;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
