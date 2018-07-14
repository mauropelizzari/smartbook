package org.easysoft.smartbook.beans;

import java.io.Serializable;

public class Editor implements Serializable {

	private static final long serialVersionUID = 3517839858692145478L;
	
	private Long id;
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
