package com.furniture.web;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="pBean")
public class PersonBean {
	
	private String firstName = "Jian";
	private String lastName = "Wang";
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
