package org.easysoft.smartbook.beans;

import java.io.Serializable;

public class MenuFunction implements Serializable {

	public MenuFunction(String id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public MenuFunction(String id, String description, String icon) {
		super();
		this.id = id;
		this.description = description;
		this.icon = icon;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 5593618564158935671L;
	private String id;
	private String description;
	private String icon;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}
