package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class ReceiveTransactionInfo {

	private UUID receiveTransactionId;
	private UUID receiveId;
	private Integer lotSrNo;
	private UUID lotId;
	private Integer quantity;
	private Integer availableQuantity;
	private Integer receivePrice;
	private Integer localPrice;
	private Integer dollarPrice;
	private Integer pieces;
	private String remrak;
	private Integer status;
	private Integer returnQuantity;
	private Timestamp returnOn;
	private String returnBy;
	private Boolean modifiedBy;
	private Timestamp modifiedOn;
	private String modifiedMachineName;
	private Boolean proActive;
	private UUID locationId;
	private Boolean active;
	private UUID consignementReceiveId;
	private Boolean movWtdAvg;
	private Integer yearEndId;
	private UUID RefWhrtId;
	private Integer refStatus;
	private UUID orderTransactionId;
	private UUID mfgId;
	private UUID mfgPurchaseRtId;
	private UUID rateId;
	private Integer mfIdvalue;

	public UUID getReceiveTransactionId() {
		return receiveTransactionId;
	}

	public void setReceiveTransactionId(UUID receiveTransactionId) {
		this.receiveTransactionId = receiveTransactionId;
	}

	public UUID getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(UUID receiveId) {
		this.receiveId = receiveId;
	}

	public Integer getLotSrNo() {
		return lotSrNo;
	}

	public void setLotSrNo(Integer lotSrNo) {
		this.lotSrNo = lotSrNo;
	}

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Integer getReceivePrice() {
		return receivePrice;
	}

	public void setReceivePrice(Integer receivePrice) {
		this.receivePrice = receivePrice;
	}

	public Integer getLocalPrice() {
		return localPrice;
	}

	public void setLocalPrice(Integer localPrice) {
		this.localPrice = localPrice;
	}

	public Integer getDollarPrice() {
		return dollarPrice;
	}

	public void setDollarPrice(Integer dollarPrice) {
		this.dollarPrice = dollarPrice;
	}

	public Integer getPieces() {
		return pieces;
	}

	public void setPieces(Integer pieces) {
		this.pieces = pieces;
	}

	public String getRemrak() {
		return remrak;
	}

	public void setRemrak(String remrak) {
		this.remrak = remrak;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getReturnQuantity() {
		return returnQuantity;
	}

	public void setReturnQuantity(Integer returnQuantity) {
		this.returnQuantity = returnQuantity;
	}

	public Timestamp getReturnOn() {
		return returnOn;
	}

	public void setReturnOn(Timestamp returnOn) {
		this.returnOn = returnOn;
	}

	public String getReturnBy() {
		return returnBy;
	}

	public void setReturnBy(String returnBy) {
		this.returnBy = returnBy;
	}

	public Boolean getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Boolean modifiedBy) {
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

	public Boolean getProActive() {
		return proActive;
	}

	public void setProActive(Boolean proActive) {
		this.proActive = proActive;
	}

	public UUID getLocationId() {
		return locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public UUID getConsignementReceiveId() {
		return consignementReceiveId;
	}

	public void setConsignementReceiveId(UUID consignementReceiveId) {
		this.consignementReceiveId = consignementReceiveId;
	}

	public Boolean getMovWtdAvg() {
		return movWtdAvg;
	}

	public void setMovWtdAvg(Boolean movWtdAvg) {
		this.movWtdAvg = movWtdAvg;
	}

	public Integer getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Integer yearEndId) {
		this.yearEndId = yearEndId;
	}

	public UUID getRefWhrtId() {
		return RefWhrtId;
	}

	public void setRefWhrtId(UUID refWhrtId) {
		RefWhrtId = refWhrtId;
	}

	public Integer getRefStatus() {
		return refStatus;
	}

	public void setRefStatus(Integer refStatus) {
		this.refStatus = refStatus;
	}

	public UUID getOrderTransactionId() {
		return orderTransactionId;
	}

	public void setOrderTransactionId(UUID orderTransactionId) {
		this.orderTransactionId = orderTransactionId;
	}

	public UUID getMfgId() {
		return mfgId;
	}

	public void setMfgId(UUID mfgId) {
		this.mfgId = mfgId;
	}

	public UUID getMfgPurchaseRtId() {
		return mfgPurchaseRtId;
	}

	public void setMfgPurchaseRtId(UUID mfgPurchaseRtId) {
		this.mfgPurchaseRtId = mfgPurchaseRtId;
	}

	public UUID getRateId() {
		return rateId;
	}

	public void setRateId(UUID rateId) {
		this.rateId = rateId;
	}

	public Integer getMfIdvalue() {
		return mfIdvalue;
	}

	public void setMfIdvalue(Integer mfIdvalue) {
		this.mfIdvalue = mfIdvalue;
	}

}
