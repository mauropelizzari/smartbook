package org.easysoft.smartbook.ui;


import java.util.List;

import org.easysoft.smartbook.beans.MenuFunction;

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
	@SuppressWarnings("rawtypes")
	private Grid grid;
	
	//dettaglio laterale
	
	
	
	public SmbkPageContent() {
		super();
		this.setSpacing(false);
	}

	@SuppressWarnings("unchecked")
	public void loadResult(MenuFunction mFunction) {
		if (this.grid!=null)
			this.removeComponent(this.grid);
		
		
		this.grid = new Grid<>();
		List list = mFunction.getService().search();
		this.grid.setItems(list);
		
		this.addComponent(this.grid);
		
		// fetch list of Customers from service and assign it to Grid
//	    List<Person> results = service.list(new Person);
	}
	

}
