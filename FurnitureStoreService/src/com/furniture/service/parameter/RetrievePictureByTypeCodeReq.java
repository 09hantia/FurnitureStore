package com.furniture.service.parameter;

import java.io.Serializable;


public class RetrievePictureByTypeCodeReq implements Serializable {

	private static final long serialVersionUID = 8280671758211835763L;
	
	private String pictureTypeCode;

	public String getPictureTypeCode() {
		return pictureTypeCode;
	}

	public void setPictureTypeCode(String pictureTypeCode) {
		this.pictureTypeCode = pictureTypeCode;
	}
	
}
