package com.furniture.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.furniture.persistence.dao.ActorMapper;
import com.furniture.persistence.dao.PictureMapper;
import com.furniture.persistence.model.Actor;
import com.furniture.persistence.model.Picture;
import com.furniture.service.ManageApplicationService;
import com.furniture.service.parameter.RetrieveActorReq;
import com.furniture.service.parameter.RetrieveActorRes;
import com.furniture.service.parameter.RetrievePictureReq;
import com.furniture.service.parameter.RetrievePictureRes;
import com.furniture.service.parameter.RetrievePictureByTypeCodeReq;
import com.furniture.service.parameter.RetrievePictureByTypeCodeRes;

@Service("manageApplicationService")
@Transactional
public class ManageApplicationServiceImpl implements ManageApplicationService {
	
	private static Log log = LogFactory.getLog(ManageApplicationServiceImpl.class);

	//@Autowired protected WebStatusService webStatusService;
		
	//@Autowired private ApplicationHeaderDAO applicationHeaderDAO;
	
	@Autowired ActorMapper actorMapper;
	@Autowired PictureMapper pictureMapper;

	@Override
	public RetrieveActorRes retrieveActor(RetrieveActorReq req) {
		System.err.println("ManageApplicationServiceImpl retrieveActor...");
		Actor actor = actorMapper.selectByPrimaryKey(req.getActorId());
		RetrieveActorRes res = new RetrieveActorRes();
		res.setActor(actor);
		return res;
	}
	
	@Override
	public RetrievePictureRes retrievePicture(RetrievePictureReq req) {
		System.err.println("ManageApplicationServiceImpl retrievePicture...");
		Picture picture = pictureMapper.selectByPrimaryKey(req.getPictureId());
		RetrievePictureRes res = new RetrievePictureRes();
		res.setPicture(picture);
		return res;
	}
	
	@Override
	public RetrievePictureByTypeCodeRes retrievePictureByTypeCode(RetrievePictureByTypeCodeReq req) {
		System.err.println("ManageApplicationServiceImpl retrieveServices...");
		List<Picture> pictures = pictureMapper.selectPictureByTypeCode(req.getPictureTypeCode());
		RetrievePictureByTypeCodeRes res = new RetrievePictureByTypeCodeRes();
		res.setPictures(pictures);
		return res;
	}
	
	public ActorMapper getActorMapper() {
		return actorMapper;
	}

	public void setActorMapper(ActorMapper actorMapper) {
		this.actorMapper = actorMapper;
	}

	public PictureMapper getPictureMapper() {
		return pictureMapper;
	}

	public void setPictureMapper(PictureMapper pictureMapper) {
		this.pictureMapper = pictureMapper;
	}

}
