package com.samyak.swastik.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class ReceiveTransactionInfo {

	private UUID receiveTransactionId;
	private UUID receiveId;
	private Double lotSrNo;
	private UUID lotId;
	private Double quantity;
	private Double availableQuantity;
	private Double receivePrice;
	private Double localPrice;
	private Double dollarPrice;
	private Double pieces;
	private String remrak;
	private Double status;
	private Double returnQuantity;
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
	private Double yearEndId;
	private UUID RefWhrtId;
	private Double refStatus;
	private UUID orderTransactionId;
	private UUID mfgId;
	private UUID mfgPurchaseRtId;
	private UUID rateId;
	private Double mfIdvalue;

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

	public Double getLotSrNo() {
		return lotSrNo;
	}

	public void setLotSrNo(Double lotSrNo) {
		this.lotSrNo = lotSrNo;
	}

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Double availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Double getReceivePrice() {
		return receivePrice;
	}

	public void setReceivePrice(Double receivePrice) {
		this.receivePrice = receivePrice;
	}

	public Double getLocalPrice() {
		return localPrice;
	}

	public void setLocalPrice(Double localPrice) {
		this.localPrice = localPrice;
	}

	public Double getDollarPrice() {
		return dollarPrice;
	}

	public void setDollarPrice(Double dollarPrice) {
		this.dollarPrice = dollarPrice;
	}

	public Double getPieces() {
		return pieces;
	}

	public void setPieces(Double pieces) {
		this.pieces = pieces;
	}

	public String getRemrak() {
		return remrak;
	}

	public void setRemrak(String remrak) {
		this.remrak = remrak;
	}

	public Double getStatus() {
		return status;
	}

	public void setStatus(Double status) {
		this.status = status;
	}

	public Double getReturnQuantity() {
		return returnQuantity;
	}

	public void setReturnQuantity(Double returnQuantity) {
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

	public Double getYearEndId() {
		return yearEndId;
	}

	public void setYearEndId(Double yearEndId) {
		this.yearEndId = yearEndId;
	}

	public UUID getRefWhrtId() {
		return RefWhrtId;
	}

	public void setRefWhrtId(UUID refWhrtId) {
		RefWhrtId = refWhrtId;
	}

	public Double getRefStatus() {
		return refStatus;
	}

	public void setRefStatus(Double refStatus) {
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

	public Double getMfIdvalue() {
		return mfIdvalue;
	}

	public void setMfIdvalue(Double mfIdvalue) {
		this.mfIdvalue = mfIdvalue;
	}

}
