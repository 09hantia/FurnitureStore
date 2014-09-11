package com.furniture.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.furniture.persistence.model.Actor;
import com.furniture.service.ManageApplicationService;
import com.furniture.service.parameter.RetrieveActorReq;
import com.furniture.service.parameter.RetrieveActorRes;

@Controller
@Scope("request")
public class TestBean implements Serializable {

	private static final long serialVersionUID = 6931166689565694135L;

	@Autowired private ManageApplicationService manageApplicationService;

	private String name;
	private String hello;
	
	public String onload() {
		System.err.println("TestBean onload()...");
		  
		RetrieveActorReq req = new RetrieveActorReq();
		req.setActorId((short) 2);
		RetrieveActorRes res = manageApplicationService.retrieveActor(req);
		Actor actor = res.getActor();
		  
		System.err.println("This is the actor: " + actor.getActorId() + ", " + actor.getFirstName() + ", " + actor.getLastName() + ", " + actor.getLastUpdate());
		return null;
	}
	  
	public String sayHelloAction() {
		return "next";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHello() {
		return hello;
	}
	
	public void setHello(String hello) {
		this.hello = hello;
	}
}