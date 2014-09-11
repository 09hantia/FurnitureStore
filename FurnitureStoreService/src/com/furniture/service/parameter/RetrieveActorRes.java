package com.furniture.service.parameter;

import java.io.Serializable;

import com.furniture.persistence.model.Actor;

public class RetrieveActorRes implements Serializable {

	private static final long serialVersionUID = 2979288557755603762L;
	
	private Actor actor;

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
}