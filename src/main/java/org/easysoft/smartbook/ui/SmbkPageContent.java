package org.easysoft.smartbook.ui;


import java.util.List;

import org.easysoft.smartbook.beans.Person;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.PersonService;

import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

/**
 * Page content menu
 * @author mauropelizzari
 *
 */
public class SmbkPageContent extends VerticalLayout {

	private static final long serialVersionUID = -6381534938681564896L;
	
	//pannello filtri ricerca
	
	//griglia
//	private Grid<T> grid;
	
	//dettaglio laterale
	
	public SmbkPageContent() {
		super();
		this.setSpacing(false);
		
		
		
	}

	public void loadResult() {
		// fetch list of Customers from service and assign it to Grid
//	    List<Person> results = service.list(new Person);
//	    grid.setItems(results);
	}
	

}
