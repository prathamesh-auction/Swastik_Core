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
@Table(name = "RECEIVE")
public class ReceiveTransaction implements Serializable {

	private static final long serialVersionUID = -3251222424196314076L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "RECEIVE_TRANSACTION_ID")
	private UUID receiveTransactionId;

	@Column(name = "RECEIVE_ID")
	private UUID receiveId;

	@Column(name = "LOT_SR_NO")
	private Double lotSrNo;

	@Column(name = "LOT_ID")
	private UUID lotId;

	@Column(name = "QUANTITY")
	private Double quantity;

	@Column(name = "AVAILABLE_QUANTITY")
	private Double availableQuantity;

	@Column(name = "RECEIVE_PRICE")
	private Double receivePrice;

	@Column(name = "LOCAL_PRICE")
	private Double localPrice;

	@Column(name = "DOLLAR_PRICE")
	private Double dollarPrice;

	@Column(name = "PIECES")
	private Double pieces;

	@Column(name = "REMARK")
	private String remrak;

	@Column(name = "STATUS")
	private Double status;

	@Column(name = "RETURN_QUANTITY")
	private Double returnQuantity;

	@Column(name = "RETURN_ON")
	private Timestamp returnOn;

	@Column(name = "RETURN_BY")
	private String returnBy;

	@Column(name = "MODIFIED_BY")
	private Boolean modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;

	@Column(name = "MODIFIED_MACHINE_NAME")
	private String modifiedMachineName;

	@Column(name = "PRO_ACTIVE")
	private Boolean proActive;

	@Column(name = "LOCATION_ID")
	private UUID locationId;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "CONSIGNEMENT_RECEIVED_ID")
	private UUID consignementReceiveId;

	@Column(name = "MOV_WTD_AVG")
	private Boolean movWtdAvg;

	@Column(name = "YEAR_END_ID")
	private Double yearEndId;

	@Column(name = "REF_WHRT_ID")
	private UUID RefWhrtId;

	@Column(name = "REF_STATUS")
	private Double refStatus;

	@Column(name = "ORDER_TRANSACTION_ID")
	private UUID orderTransactionId;

	@Column(name = "MFG_ID")
	private UUID mfgId;

	@Column(name = "MFG_PURCHASE_RT_ID")
	private UUID mfgPurchaseRtId;

	@Column(name = "RATE_ID")
	private UUID rateId;

	@Column(name = "MF_VALUE")
	private Double mfIdvalue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Timestamp getReturnon() {
		return returnOn;
	}

	public void setReturnon(Timestamp returnOn) {
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
