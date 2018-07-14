package org.easysoft.smartbook.beans;

public class Illustrator extends Person {

	private static final long serialVersionUID = 3517839858692145478L;
	
	private Long id_book;
	private Long id_person;
	private String codeIllustrator;
	private String nameIllustrator;
	private String surnameIllustrator;
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
	public String getCodeIllustrator() {
		return codeIllustrator;
	}
	public void setCodeIllustrator(String codeIllustrator) {
		this.codeIllustrator = codeIllustrator;
	}
	public String getNameIllustrator() {
		return nameIllustrator;
	}
	public void setNameIllustrator(String nameIllustrator) {
		this.nameIllustrator = nameIllustrator;
	}
	public String getSurnameIllustrator() {
		return surnameIllustrator;
	}
	public void setSurnameIllustrator(String surnameIllustrator) {
		this.surnameIllustrator = surnameIllustrator;
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
