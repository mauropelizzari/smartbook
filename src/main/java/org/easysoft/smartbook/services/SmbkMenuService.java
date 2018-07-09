package org.easysoft.smartbook.services;

import java.util.ArrayList;
import java.util.List;

import org.easysoft.smartbook.beans.MenuFunction;
import org.springframework.stereotype.Service;

@Service
public class SmbkMenuService {
	
	private List<MenuFunction> menuItemFunctions = new ArrayList<MenuFunction>();
	
	
	
	public SmbkMenuService() {
		menuItemFunctions.add(new MenuFunction("book", "Libri", new BookService()));
		menuItemFunctions.add(new MenuFunction("author", "Autori", new AuthorService()));
		menuItemFunctions.add(new MenuFunction("illustrator", "Illustratori", new IllustratorService()));
		menuItemFunctions.add(new MenuFunction("argument", "Generi", new ArgumentService()));
		menuItemFunctions.add(new MenuFunction("editor", "Case editrici", new EditorService()));
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
