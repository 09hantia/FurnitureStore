package com.furniture.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.furniture.CommonConstants;
import com.furniture.persistence.model.Picture;
import com.furniture.service.ManageApplicationService;
import com.furniture.service.parameter.RetrievePictureReq;
import com.furniture.service.parameter.RetrievePictureRes;
import com.furniture.service.parameter.RetrievePictureByTypeCodeReq;
import com.furniture.service.parameter.RetrievePictureByTypeCodeRes;

@Controller
@Scope("request")
public class ServicesBean implements Serializable {

	private static final long serialVersionUID = -8040593488520265675L;
	
	@Autowired private ManageApplicationService manageApplicationService;

	private Picture picture;
	private List<Picture> pictures;
	
	public String onload() throws IOException {
		System.err.println("ServicesBean onload()...");
		  
		/*RetrieveActorReq req = new RetrieveActorReq();
		req.setActorId((short) 2);
		RetrieveActorRes res = manageApplicationService.retrieveActor(req);
		Actor actor = res.getActor();*/
////////////////////////////////////		
/*		RetrievePictureReq req = new RetrievePictureReq();
		req.setPictureId(1);
		RetrievePictureRes res = manageApplicationService.retrievePicture(req);
		this.picture = res.getPicture();*/
		
		RetrievePictureByTypeCodeReq req =  new RetrievePictureByTypeCodeReq();
		req.setPictureTypeCode(CommonConstants.PICTURE_TYPE_SERVICES);
		RetrievePictureByTypeCodeRes res = manageApplicationService.retrievePictureByTypeCode(req);
		setPictures(res.getPictures());
		
/////////////////////////////////////
		
		
		/*BufferedImage image = ImageIO.read(new File("E:\\UserData\\workspace\\FurnitureStoreWeb\\WebContent\\images\\page2_img2.jpg")); 
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
		ImageIO.write(image, "png", baos); 
		byte[] res=baos.toByteArray();

		System.out.println(res);
		setImage(new DefaultStreamedContent(new ByteArrayInputStream(res)));*/
		
		//System.err.println(picture.getImg());
		
		return null;
	}
	
	public StreamedContent getImage() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			// So, we're rendering the view. Return a stub StreamedContent so that it will generate right URL.
			return new DefaultStreamedContent();
		} else {
			// So, browser is requesting the image. Get ID value from actual request param.
			String id = context.getExternalContext().getRequestParameterMap().get("id");
			RetrievePictureReq req = new RetrievePictureReq();
			req.setPictureId(Integer.valueOf(id));
			RetrievePictureRes res = manageApplicationService.retrievePicture(req);
			this.picture = res.getPicture();
			return new DefaultStreamedContent(new ByteArrayInputStream(picture.getImg()));
		}
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	  
}