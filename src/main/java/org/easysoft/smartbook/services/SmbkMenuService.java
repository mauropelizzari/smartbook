package org.easysoft.smartbook.services;

import java.util.ArrayList;
import java.util.List;

import org.easysoft.smartbook.beans.MenuFunction;
import org.springframework.stereotype.Service;

@Service
public class SmbkMenuService {
	
	public List<MenuFunction> getMenuItems() {
		List<MenuFunction> items = new ArrayList<MenuFunction>();
		items.add(new MenuFunction("book", "Libri"));
		items.add(new MenuFunction("author", "Autori"));
		items.add(new MenuFunction("illustrator", "Illustratori"));
		items.add(new MenuFunction("argument", "Generi"));
		items.add(new MenuFunction("editor", "Case editrici"));
		return items;
	}
	

}
