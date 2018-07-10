package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Illustrator;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.IllustratorService;

import com.vaadin.ui.Grid;

public class IllustratorPageConfig extends BasePageConfig<Illustrator> {
	
	@Override
	public Grid<Illustrator> getGrid() {
		Grid<Illustrator> grid = new Grid<Illustrator>(Illustrator.class);
//		grid.setColumns("id","code","description");
		return grid;
	}

	@Override
	public BaseService<Illustrator> getService() {
		return new IllustratorService();
	}
	
	@Override
	public String getTitle() {
		return "Illustratori";
	}


}
