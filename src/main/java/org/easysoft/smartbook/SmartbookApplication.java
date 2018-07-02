package org.easysoft.smartbook;



import org.easysoft.smartbook.ui.MainMenuBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringBootApplication
public class SmartbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartbookApplication.class, args);
	}

	

	@Theme("valo")
	@SpringUI(path = "")
	public static class VaadinUI extends UI {

		private static final long serialVersionUID = 1L;
		
		@Autowired
		private MainMenuBuilder mainMenuBuilder;
		
		@Override
		protected void init(VaadinRequest request) {
			
			final VerticalLayout header = new VerticalLayout();
//			final VerticalLayout content = new VerticalLayout();
			
			header.addComponent(mainMenuBuilder.buildMenu(selectedItem -> {
				
				Label label = new Label("Apertura menu "  + selectedItem.getText());
				
				header.addComponent(label);
				
			}));
			
			setContent(header);
		}

	}
}
