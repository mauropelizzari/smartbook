package org.easysoft.smartbook;


import org.easysoft.smartbook.services.SmbkMenuService;
import org.easysoft.smartbook.ui.SmbkPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringBootApplication
public class SmbkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmbkApplication.class, args);
	}
	
	@Theme("valo")
	@SpringUI(path = "")
	public static class VaadinUI extends UI {

		private static final long serialVersionUID = 1L;
		
		@Autowired
		private SmbkMenuService menuService;
		
		
		@Override
		protected void init(VaadinRequest request) {
			SmbkPage mainPage = new SmbkPage(menuService);
			setContent(mainPage);
		}

	}
	
	//primo commit da revertare
	
	//secondo commit da revertare
}
