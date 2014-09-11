package com.furniture.service.parameter;

import java.io.Serializable;


public class RetrieveActorReq implements Serializable {

	private static final long serialVersionUID = 125768171464573519L;

	private Short actorId;

	public Short getActorId() {
		return actorId;
	}

	public void setActorId(Short actorId) {
		this.actorId = actorId;
	}
	
}
