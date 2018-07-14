package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Author;
import org.easysoft.smartbook.services.AuthorService;
import org.easysoft.smartbook.services.BaseService;

import com.vaadin.ui.Grid;

public class AuthorPageConfig extends BasePageConfig<Author> {
	
	@Override
	public Grid<Author> getGrid() {
		Grid<Author> grid = new Grid<>();
		grid.addColumn(Author::getCodeAuthor).setCaption("CODICE");
		grid.addColumn(Author::getNameAuthor).setCaption("NOME");
		grid.addColumn(Author::getSurnameAuthor).setCaption("COGNOME");
		grid.addColumn(Author::getCodeBook).setCaption("CODICE LIBRO");
		grid.addColumn(Author::getTitleBook).setCaption("TITOLO LIBRO");
		return grid;
	}

	@Override
	public BaseService<Author> getService() {
		return new AuthorService();
	}

	@Override
	public String getTitle() {
		return "Autori";
	}

}
