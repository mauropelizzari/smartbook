package org.easysoft.smartbook.ui;

import org.easysoft.smartbook.services.SmbkMenuService;

import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class SmbkPage extends VerticalLayout {

	private static final long serialVersionUID = -1184192997171577652L;
	

	private SmbklPageMenu menuBar;
	private SmbkPageContent content;
	
	public SmbkPage(SmbkMenuService menuService) {
		super();
		this.setSpacing(false);
		init(menuService);
	}
	
	public SmbkPageContent getContent() {
		return content;
	}

	public SmbklPageMenu getMenuBar() {
		return menuBar;
	}
	
	/**
	 * Clear all content page
	 */
	public void clearContent() {
		if (content==null)
			return;
		
		content.removeAllComponents();
	}
	
	public void loadContent(MenuItem mItem) {
		Label label = new Label("Apertura menu "  + mItem.getText());
		content.addComponent(label);
	}
	
	private void init(SmbkMenuService menuService) {
		this.menuBar = new SmbklPageMenu(menuService,this);
		this.content = new SmbkPageContent();
		
		addComponent(this.menuBar);	
		addComponent(this.content);	
	}
	

}
