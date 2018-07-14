package org.easysoft.smartbook.ui;

import org.easysoft.smartbook.beans.MenuFunction;
import org.easysoft.smartbook.services.SmbkMenuService;

import com.vaadin.ui.VerticalLayout;

/**
 * Page Component
 * @author mauropelizzari
 *
 */
public class SmbkPage extends VerticalLayout {

	private static final long serialVersionUID = -1184192997171577652L;
	

	private SmbklPageMenu menuBar;
	private SmbkPageContent content;
	
	public SmbkPage(SmbkMenuService menuService) {
		super();
		this.setSpacing(false);
		this.setWidth("100%");
		init(menuService);
	}
	
	public SmbkPageContent getContent() {
		return content;
	}

	public SmbklPageMenu getMenuBar() {
		return menuBar;
	}
	
	/**
	 * Load content page
	 * @param mFunction
	 */
	public void loadContent(MenuFunction mFunction) {
		content.drawContent(mFunction);
	}
	
	private void init(SmbkMenuService menuService) {
		this.menuBar = new SmbklPageMenu(menuService,this);
		this.content = new SmbkPageContent();
		
		addComponent(this.menuBar);	
		addComponent(this.content);	
	}
	

}
