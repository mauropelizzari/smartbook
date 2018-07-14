package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Argument;
import org.easysoft.smartbook.services.ArgumentService;
import org.easysoft.smartbook.services.BaseService;

import com.vaadin.ui.Grid;

public class ArgumentPageConfig extends BasePageConfig<Argument> {
	
	@Override
	public Grid<Argument> getGrid() {
		Grid<Argument> grid = new Grid<>();
		grid.addColumn(Argument::getCode).setCaption("CODICE");
		grid.addColumn(Argument::getDescription).setCaption("DESCRIZIONE");
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
