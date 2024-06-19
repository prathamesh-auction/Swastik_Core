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
@Table(name = "DIAMOND")
public class Diamond implements Serializable {

	private static final long serialVersionUID = 3454348258614058020L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "LOT_ID")
	private UUID lotId;
	@Column(name = "CUT_ID")
	private UUID cutId;
	@Column(name = "COLOR_ID")
	private UUID colorId;
	@Column(name = "PURITY_ID")
	private UUID purityId;
	@Column(name = "FLUORESCENCE_ID")
	private UUID fluorescenceId;
	@Column(name = "SHAPE_ID")
	private UUID shapeId;
	@Column(name = "LAB_ID")
	private UUID labId;
	@Column(name = "POLISH_ID")
	private UUID polishId;
	@Column(name = "TABLEINCUSION_ID")
	private UUID tableIncusionId;
	@Column(name = "SYMMETRY_ID")
	private UUID symmetryId;
	@Column(name = "LUSTER_ID")
	private UUID lusterId;
	@Column(name = "COUNTRY_ID")
	private UUID countryId;
	@Column(name = "SELLING_PRICE")
	private Double sellingPrice;
	@Column(name = "PURCHASE_PRICE")
	private Double purchasePrice;
	@Column(name = "RARNET_PRICE")
	private Double rapnetPrice;
	@Column(name = "RAPNET_DATE")
	private Timestamp rapnetDate;
	@Column(name = "TOTAL_DEPTH")
	private Double totalDepth;
	@Column(name = "TABLE_PERCENTAGE")
	private Double tablePercentage;
	@Column(name = "CROWN_ANGLE")
	private Double crownAngle;
	@Column(name = "D_SIZE")
	private Integer dSize;
	@Column(name = "SHADE_ID")
	private UUID shadeId;
	@Column(name = "OPENINCLUSION_ID")
	private UUID openInclusionId;
	@Column(name = "BLACKINCLUSION_ID")
	private UUID blackInclusionId;
	@Column(name = "WEIGHT")
	private Double weight;
	@Column(name = "YEAREND_ID")
	private Double yearEndId;
	@Column(name = "DIAMETER")
	private Double diameter;
	@Column(name = "GROUP_ID")
	private UUID groupId;
	@Column(name = "DESCRIPTION_ID")
	private UUID descriptionId;
	@Column(name = "SUPPLIER_ID")
	private UUID supplierId;
	@Column(name = "CUTHS_ID")
	private UUID cutHSId;
	@Column(name = "MINGIRDLE")
	private Double minGirdle;
	@Column(name = "MAXGIRDLE")
	private Double maxGirdle;
	@Column(name = "COMMENT")
	private String comment;
	@Column(name = "ORIGINCOLOR_ID")
	private UUID originColorId;
	@Column(name = "CUTEX_ID")
	private UUID cutEXId;
	@Column(name = "CURRENT_STATUS")
	private Integer currentStatus;

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public UUID getCutId() {
		return cutId;
	}

	public void setCutId(UUID cutId) {
		this.cutId = cutId;
	}

	public UUID getColorId() {
		return colorId;
	}

	public void setColorId(UUID colorId) {
		this.colorId = colorId;
	}

	public UUID getPurityId() {
		return purityId;
	}

	public void setPurityId(UUID purityId) {
		this.purityId = purityId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getFluorescenceId() {
		return fluorescenceId;
	}

	public void setFluorescenceId(UUID fluorescenceId) {
		this.fluorescenceId = fluorescenceId;
	}

	public UUID getShapeId() {
		return shapeId;
	}

	public void setShapeId(UUID shapeId) {
		this.shapeId = shapeId;
	}

	public UUID getLabId() {
		return labId;
	}

	public void setLabId(UUID labId) {
		this.labId = labId;
	}

	public UUID getPolishId() {
		return polishId;
	}

	public void setPolishId(UUID polishId) {
		this.polishId = polishId;
	}

	public UUID getTableIncusionId() {
		return tableIncusionId;
	}

	public void setTableIncusionId(UUID tableIncusionId) {
		this.tableIncusionId = tableIncusionId;
	}

	public UUID getSymmetryId() {
		return symmetryId;
	}

	public void setSymmetryId(UUID symmetryId) {
		this.symmetryId = symmetryId;
	}

	public UUID getLusterId() {
		return lusterId;
	}

	public void setLusterId(UUID lusterId) {
		this.lusterId = lusterId;
	}

	public UUID getCountryId() {
		return countryId;
	}

	public void setCountryId(UUID countryId) {
		this.countryId = countryId;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Double getRapnetPrice() {
		return rapnetPrice;
	}

	public void setRapnetPrice(Double rapnetPrice) {
		this.rapnetPrice = rapnetPrice;
	}

	public Timestamp getRapnetDate() {
		return rapnetDate;
	}

	public void setRapnetDate(Timestamp rapnetDate) {
		this.rapnetDate = rapnetDate;
	}

	public Double getTotalDepth() {
		return totalDepth;
	}

	public void setTotalDepth(Double totalDepth) {
		this.totalDepth = totalDepth;
	}

	public Double getTablePercentage() {
		return tablePercentage;
	}

	public void setTablePercentage(Double tablePercentage) {
		this.tablePercentage = tablePercentage;
	}

	public Double getCrownAngle() {
		return crownAngle;
	}

	public void setCrownAngle(Double crownAngle) {
		this.crownAngle = crownAngle;
	}

	public Integer getdSize() {
		return dSize;
	}

	public void setdSize(Integer dSize) {
		this.dSize = dSize;
	}

	public UUID getShadeId() {
		return shadeId;
	}

	public void setShadeId(UUID shadeId) {
		this.shadeId = shadeId;
	}

	public UUID getOpenInclusionId() {
		return openInclusionId;
	}

	public void setOpenInclusionId(UUID openInclusionId) {
		this.openInclusionId = openInclusionId;
	}

	public UUID getBlackInclusionId() {
		return blackInclusionId;
	}

	public void setBlackInclusionId(UUID blackInclusionId) {
		this.blackInclusionId = blackInclusionId;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

	public Double getDiameter() {
		return diameter;
	}

	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}

	public UUID getGroupId() {
		return groupId;
	}

	public void setGroupId(UUID groupId) {
		this.groupId = groupId;
	}

	public UUID getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(UUID descriptionId) {
		this.descriptionId = descriptionId;
	}

	public UUID getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(UUID supplierId) {
		this.supplierId = supplierId;
	}

	public UUID getCutHSId() {
		return cutHSId;
	}

	public void setCutHSId(UUID cutHSId) {
		this.cutHSId = cutHSId;
	}

	public Double getMinGirdle() {
		return minGirdle;
	}

	public void setMinGirdle(Double minGirdle) {
		this.minGirdle = minGirdle;
	}

	public Double getMaxGirdle() {
		return maxGirdle;
	}

	public void setMaxGirdle(Double maxGirdle) {
		this.maxGirdle = maxGirdle;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public UUID getOriginColorId() {
		return originColorId;
	}

	public void setOriginColorId(UUID originColorId) {
		this.originColorId = originColorId;
	}

	public UUID getCutEXId() {
		return cutEXId;
	}

	public void setCutEXId(UUID cutEXId) {
		this.cutEXId = cutEXId;
	}

	public Integer getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(Integer currentStatus) {
		this.currentStatus = currentStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
