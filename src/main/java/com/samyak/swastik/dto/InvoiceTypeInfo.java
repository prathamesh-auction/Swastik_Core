package com.samyak.swastik.dto;

import java.util.UUID;

public class InvoiceTypeInfo {

	private UUID typeId;
	private String typeName;
	private String typeCode;
	private Double srNo;
	private Boolean active;
	private String typeNameNative;

	public UUID getTypeId() {
		return typeId;
	}

	public void setTypeId(UUID typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Double getSrNo() {
		return srNo;
	}

	public void setSrNo(Double srNo) {
		this.srNo = srNo;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getTypeNameNative() {
		return typeNameNative;
	}

	public void setTypeNameNative(String typeNameNative) {
		this.typeNameNative = typeNameNative;
	}

}
