package com.furniture.service.parameter;

import java.io.Serializable;
import java.util.List;

import com.furniture.persistence.model.Picture;

public class RetrievePictureByTypeCodeRes implements Serializable {

	private static final long serialVersionUID = -1897520639842204077L;

	private List<Picture> pictures;

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
}