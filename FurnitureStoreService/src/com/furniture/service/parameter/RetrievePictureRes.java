package com.furniture.service.parameter;

import java.io.Serializable;

import com.furniture.persistence.model.Picture;

public class RetrievePictureRes implements Serializable {

	private static final long serialVersionUID = 2979288557755603762L;
	
	private Picture picture;

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	
}