package org.easysoft.smartbook.ui;


import java.util.List;

import org.easysoft.smartbook.beans.Argument;
import org.easysoft.smartbook.beans.MenuFunction;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.ui.config.BasePageConfig;

import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

/**
 * Page content menu
 * @author mauropelizzari
 *
 */
public class SmbkPageContent extends VerticalLayout {

	private static final long serialVersionUID = -6381534938681564896L;
	
	@SuppressWarnings("rawtypes")
	private Grid grid;
	
	public SmbkPageContent() {
		super();
		this.setSpacing(false);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void drawContent(MenuFunction mFunction) {
		
		this.removeAllComponents();
		
		BasePageConfig pageConfig = mFunction.getPageConfigurator();
		BaseService service = pageConfig.getService();
		List<Argument> list = service.search();

		this.grid = pageConfig.getGrid();
		this.grid.setItems(list);
		
		this.addComponent(this.grid);
	}
	

}
