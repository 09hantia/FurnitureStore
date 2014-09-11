package com.furniture.service.parameter;

import java.io.Serializable;

public class RetrievePictureReq implements Serializable {

	private static final long serialVersionUID = -8207494519068335166L;

	private Integer pictureId;

	public Integer getPictureId() {
		return pictureId;
	}

	public void setPictureId(Integer pictureId) {
		this.pictureId = pictureId;
	}
	
}
