package org.easysoft.smartbook.beans;

import java.io.Serializable;

public class People implements Serializable{

	private static final long serialVersionUID = 3430403731165679788L;
	private String id;
	private String code;
	private String name;      
	private String surname;   
	                          
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
