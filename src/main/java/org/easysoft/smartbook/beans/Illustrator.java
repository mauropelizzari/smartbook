package org.easysoft.smartbook.beans;

public class Illustrator extends Person {

	private static final long serialVersionUID = 3517839858692145478L;
	
	private String id_book;
	private String id_person;

	public String getId_person() {
		return id_person;
	}

	public void setId_person(String id_person) {
		this.id_person = id_person;
	}

	public String getId_book() {
		return id_book;
	}

	public void setId_book(String id_book) {
		this.id_book = id_book;
	}

}
