package org.easysoft.smartbook.ui;

import org.easysoft.smartbook.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.ui.MenuBar;

@Component
public class MainMenuBuilder {
	
	@Autowired
	private MenuService menuService;

	public MenuBar buildMenu(MenuBar.Command menuCommand) {
		
		MenuBar menu = new MenuBar();
		
		menuService.getMenuItems().forEach( item -> {
			menu.addItem(item.getDescription(), menuCommand);
		});
		
		return menu;
	}

}
