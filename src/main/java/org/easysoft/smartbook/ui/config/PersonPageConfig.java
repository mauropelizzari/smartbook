package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Person;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.PersonService;

import com.vaadin.ui.Grid;

public class PersonPageConfig extends BasePageConfig<Person> {
	
	@Override
	public Grid<Person> getGrid() {
		Grid<Person> grid = new Grid<Person>(Person.class);
//		grid.setColumns("id","code","description");
		return grid;
	}

	@Override
	public BaseService<Person> getService() {
		return new PersonService();
	}

	@Override
	public String getTitle() {
		return "Persone";
	}


}
