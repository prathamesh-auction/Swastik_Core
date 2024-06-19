package com.samyak.swastik.dto;

import java.io.Serializable;

public class ShapeInfo implements Serializable {

	private static final long serialVersionUID = 294186970140830436L;

	private String shapeName;
	private String shapeDescription;
	private Integer srNo;

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public String getShapeDescription() {
		return shapeDescription;
	}

	public void setShapeDescription(String shapeDescription) {
		this.shapeDescription = shapeDescription;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
