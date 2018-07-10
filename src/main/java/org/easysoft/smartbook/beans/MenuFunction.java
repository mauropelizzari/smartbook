package org.easysoft.smartbook.beans;

import java.io.Serializable;

import org.easysoft.smartbook.ui.config.BasePageConfig;

@SuppressWarnings("rawtypes")
public class MenuFunction implements Serializable {
	
	private static final long serialVersionUID = 5593618564158935671L;
	private String id;
	private String description;
	private String icon;
	private BasePageConfig pageConfigurator;

	public MenuFunction(String id, String description, BasePageConfig pageConfigurator) {
		super();
		this.id = id;
		this.description = description;
		this.pageConfigurator = pageConfigurator;
	}
	public MenuFunction(String id, String description, String icon, BasePageConfig pageConfigurator) {
		this(id,description,pageConfigurator);
		this.icon = icon;
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
	public BasePageConfig getPageConfigurator() {
		return pageConfigurator;
	}
	public void setPageConfigurator(BasePageConfig pageConfigurator) {
		this.pageConfigurator = pageConfigurator;
	}
}
