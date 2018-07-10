package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Argument;
import org.easysoft.smartbook.services.ArgumentService;
import org.easysoft.smartbook.services.BaseService;

import com.vaadin.ui.Grid;

public class ArgumentPageConfig extends BasePageConfig<Argument> {
	
	@Override
	public Grid<Argument> getGrid() {
		Grid<Argument> grid = new Grid<Argument>(Argument.class);
		grid.setColumns("id","code","description");
		return grid;
	}

	@Override
	public BaseService<Argument> getService() {
		return new ArgumentService();
	}

	@Override
	public String getTitle() {
		return "Generi";
	}


}
