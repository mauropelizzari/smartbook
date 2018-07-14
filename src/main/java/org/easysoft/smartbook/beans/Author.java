package org.easysoft.smartbook.beans;

import java.io.Serializable;

public class Author implements Serializable {

	private static final long serialVersionUID = 3517839858692145478L;
	
	private Long id_book;
	private Long id_person;
	private String codeAuthor;
	private String nameAuthor;
	private String surnameAuthor;
	private String codeBook;
	private String titleBook;
	
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
	public String getCodeAuthor() {
		return codeAuthor;
	}
	public void setCodeAuthor(String codeAuthor) {
		this.codeAuthor = codeAuthor;
	}
	public String getNameAuthor() {
		return nameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	public String getSurnameAuthor() {
		return surnameAuthor;
	}
	public void setSurnameAuthor(String surnameAuthor) {
		this.surnameAuthor = surnameAuthor;
	}
	public String getCodeBook() {
		return codeBook;
	}
	public void setCodeBook(String codeBook) {
		this.codeBook = codeBook;
	}
	public String getTitleBook() {
		return titleBook;
	}
	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}


}
