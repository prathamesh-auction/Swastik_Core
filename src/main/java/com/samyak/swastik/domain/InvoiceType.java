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
@Table(name = "MASTER_INVOICE_TYPE")
public class InvoiceType implements Serializable {

	private static final long serialVersionUID = -6924500697390681549L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "TYPE_ID")
	private UUID typeId;

	@Column(name = "TYPE_NAME")
	private String typeName;

	@Column(name = "TYPE_CODE")
	private String typeCode;

	@Column(name = "SR_NO")
	private Integer srNo;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "TYPE_NAME_NATIVE")
	private String typeNameNative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
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
