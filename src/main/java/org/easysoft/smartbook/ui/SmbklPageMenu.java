package org.easysoft.smartbook.ui;


import org.easysoft.smartbook.services.SmbkMenuService;

import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;

public class SmbklPageMenu extends MenuBar {

	private static final long serialVersionUID = 6668318238947687026L;
	
	private final SmbkPage parentPage;

	public SmbkPage getParentPage() {
		return parentPage;
	}

	public SmbklPageMenu(SmbkMenuService menuService, SmbkPage parentPage) {
		super();
		this.parentPage = parentPage;
		menuService.getMenuItems().forEach( item -> {
			Command command = selectedItem -> {
				Label label = new Label("Apertura menu "  + selectedItem.getText());
				parentPage.clearContent();
				parentPage.getContent().addComponent(label);
			};
			addItem(item.getDescription(), command);
		});
	}

}
