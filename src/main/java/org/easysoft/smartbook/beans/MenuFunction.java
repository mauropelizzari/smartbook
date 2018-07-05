package org.easysoft.smartbook.beans;

import java.io.Serializable;

import org.easysoft.smartbook.services.BaseService;

@SuppressWarnings("rawtypes")
public class MenuFunction implements Serializable {
	
	private static final long serialVersionUID = 5593618564158935671L;
	private String id;
	private String description;
	private String icon;
	private BaseService service;

	public MenuFunction(String id, String description, BaseService service) {
		super();
		this.id = id;
		this.description = description;
		this.service = service;
	}
	public MenuFunction(String id, String description, String icon, BaseService service) {
		this(id,description,service);
		this.icon = icon;
	}

	public BaseService getService() {
		return service;
	}
	public void setService(BaseService service) {
		this.service = service;
	}
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
