package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Book;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.BookService;

import com.vaadin.ui.Grid;

public class BookPageConfig extends BasePageConfig<Book> {
	
	@Override
	public Grid<Book> getGrid() {
		Grid<Book> grid = new Grid<>();
		grid.addColumn(Book::getCode).setCaption("CODICE");
		grid.addColumn(Book::getTitle).setCaption("TITOLO");
		grid.addColumn(Book::getEditor).setCaption("CASA EDITRICE");
		grid.addColumn(Book::getArgument).setCaption("GENERE");
		grid.addColumn(Book::getDateInsertFormatted).setCaption("DATA INSERIMENTO");
		return grid;
	}

	@Override
	public BaseService<Book> getService() {
		return new BookService();
	}
	
	@Override
	public String getTitle() {
		return "Libri";
	}


}
