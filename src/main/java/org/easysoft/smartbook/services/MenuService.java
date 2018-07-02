package org.easysoft.smartbook.services;

import java.util.ArrayList;
import java.util.List;

import org.easysoft.smartbook.beans.MenuFunction;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
	
	public List<MenuFunction> getMenuItems() {
		List<MenuFunction> items = new ArrayList<MenuFunction>();
		items.add(new MenuFunction("Libri", "Libri"));
		items.add(new MenuFunction("Autori", "Autori"));
		items.add(new MenuFunction("Illustratori", "Illustratori"));
		items.add(new MenuFunction("Generi", "Generi"));
		items.add(new MenuFunction("Case editrici", "Case editrici"));
		return items;
	}
	

}
