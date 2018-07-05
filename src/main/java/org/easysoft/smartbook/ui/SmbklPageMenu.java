package org.easysoft.smartbook.ui;


import org.easysoft.smartbook.services.SmbkMenuService;

import com.vaadin.ui.MenuBar;

/**
 * MenuBar component
 * @author mauropelizzari
 *
 */
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
				parentPage.loadContent(item);
			};
			addItem(item.getDescription(), command);
		});
	}

}
