package org.easysoft.smartbook.beans;

import java.io.Serializable;

public class Author implements Serializable {

	private static final long serialVersionUID = 3517839858692145478L;
	
	private Long id_book;
	private Long id_person;
	
	public Long getId_book() {
		return id_book;
	}
	public void setId_book(Long id_book) {
		this.id_book = id_book;
	}
	public Long getId_person() {
		return id_person;
	}
	public void setId_person(Long id_person) {
		this.id_person = id_person;
	}


}
