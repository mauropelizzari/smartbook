package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Illustrator;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.IllustratorService;

import com.vaadin.ui.Grid;

public class IllustratorPageConfig extends BasePageConfig<Illustrator> {
	
	@Override
	public Grid<Illustrator> getGrid() {
		Grid<Illustrator> grid = new Grid<>();
		grid.addColumn(Illustrator::getCodeIllustrator).setCaption("CODICE");
		grid.addColumn(Illustrator::getNameIllustrator).setCaption("NOME");
		grid.addColumn(Illustrator::getSurnameIllustrator).setCaption("COGNOME");
		grid.addColumn(Illustrator::getCodeBook).setCaption("CODICE LIBRO");
		grid.addColumn(Illustrator::getTitleBook).setCaption("TITOLO LIBRO");
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
