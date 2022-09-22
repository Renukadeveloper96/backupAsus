package com.in28minutes.com.in28mintues.rests.webservice.user;

import java.util.Date;

public class User {

	private Integer id;
	private String name;
	private Date dateBirth;
	
	public User(Integer id, String name, Date dateBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateBirth = dateBirth;
	}
	
	protected User() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	@Override
	public String toString() {
		return String.format("User [id=" + id + ", name=" + name + ", dateBirth=" + dateBirth + "]");
	}
	
	
}
