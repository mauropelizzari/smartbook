package org.easysoft.smartbook.services;

import java.util.ArrayList;
import java.util.List;

import org.easysoft.smartbook.beans.MenuFunction;
import org.easysoft.smartbook.ui.config.ArgumentPageConfig;
import org.easysoft.smartbook.ui.config.AuthorPageConfig;
import org.easysoft.smartbook.ui.config.BookPageConfig;
import org.easysoft.smartbook.ui.config.EditorPageConfig;
import org.easysoft.smartbook.ui.config.IllustratorPageConfig;
import org.easysoft.smartbook.ui.config.PersonPageConfig;
import org.springframework.stereotype.Service;

@Service
public class SmbkMenuService {
	
	private List<MenuFunction> menuItemFunctions = new ArrayList<MenuFunction>();
	
	public SmbkMenuService() {
		menuItemFunctions.add(new MenuFunction("book", "Libri", new BookPageConfig()));
		menuItemFunctions.add(new MenuFunction("person", "Persone", new PersonPageConfig()));
		menuItemFunctions.add(new MenuFunction("author", "Autori", new AuthorPageConfig()));
		menuItemFunctions.add(new MenuFunction("illustrator", "Illustratori", new IllustratorPageConfig()));
		menuItemFunctions.add(new MenuFunction("argument", "Generi", new ArgumentPageConfig()));
		menuItemFunctions.add(new MenuFunction("editor", "Case editrici", new EditorPageConfig()));
	}

	public List<MenuFunction> getMenuItems() {
		return menuItemFunctions;
	}
	
	public MenuFunction getMenuFunction(String key) {
		if (menuItemFunctions==null)
			return null;
		
		return menuItemFunctions
				.stream()
				.filter(item -> key.equals(item.getId()))
				.findFirst().get();
	}
	
	

}
