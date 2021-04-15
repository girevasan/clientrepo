package com.client.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id	
	private String id;
	private String name;
	private String emailid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}
