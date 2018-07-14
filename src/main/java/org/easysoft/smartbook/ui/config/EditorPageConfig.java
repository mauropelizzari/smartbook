package org.easysoft.smartbook.ui.config;

import org.easysoft.smartbook.beans.Editor;
import org.easysoft.smartbook.services.BaseService;
import org.easysoft.smartbook.services.EditorService;

import com.vaadin.ui.Grid;

public class EditorPageConfig extends BasePageConfig<Editor> {
	
	@Override
	public Grid<Editor> getGrid() {
		Grid<Editor> grid = new Grid<>();
		grid.addColumn(Editor::getId).setCaption("CODICE");
		grid.addColumn(Editor::getDescription).setCaption("DESCRIZIONE");
		return grid;
	}

	@Override
	public BaseService<Editor> getService() {
		return new EditorService();
	}

	@Override
	public String getTitle() {
		return "Case Editrici";
	}

}
