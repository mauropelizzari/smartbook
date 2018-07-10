package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.services.BaseService;

import com.vaadin.ui.Grid;

public abstract class BasePageConfig<T> {
	
	public abstract Grid<T> getGrid();
	
	public abstract BaseService<T> getService();
	
	public abstract String getTitle();

}
