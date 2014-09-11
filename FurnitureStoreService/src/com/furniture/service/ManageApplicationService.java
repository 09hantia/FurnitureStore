package com.furniture.service;

import javax.xml.bind.ValidationException;

import com.furniture.service.parameter.RetrieveActorReq;
import com.furniture.service.parameter.RetrieveActorRes;
import com.furniture.service.parameter.RetrievePictureReq;
import com.furniture.service.parameter.RetrievePictureRes;
import com.furniture.service.parameter.RetrievePictureByTypeCodeReq;
import com.furniture.service.parameter.RetrievePictureByTypeCodeRes;

public interface ManageApplicationService {

	/**
	 * Create new application record.
	 *
	 * @param individualID
	 * @param academicYear
	 * @param userId
	 * @return
	 * @throws ValidationException
	 */	
	//CreateApplicationRes createApplication(CreateApplicationReq req) throws ValidationException;
	
	RetrieveActorRes retrieveActor(RetrieveActorReq req);
	
	RetrievePictureRes retrievePicture(RetrievePictureReq req);
	
	RetrievePictureByTypeCodeRes retrievePictureByTypeCode(RetrievePictureByTypeCodeReq req);

}
