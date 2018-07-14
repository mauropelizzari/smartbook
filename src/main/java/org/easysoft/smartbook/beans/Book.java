package org.easysoft.smartbook.beans;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 3517839858692145478L;
	
	private Long id;
	private String code;
	private String title;
	private Long copies;
	private Long idEditor;
	private Long idArgument;
	private String note;
	private Long dateInsert;
	private String editor;
	private String argument;
	
	public String getArgument() {
		return argument;
	}
	public void setArgument(String argument) {
		this.argument = argument;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getCopies() {
		return copies;
	}
	public void setCopies(Long copies) {
		this.copies = copies;
	}
	public Long getIdEditor() {
		return idEditor;
	}
	public void setIdEditor(Long idEditor) {
		this.idEditor = idEditor;
	}
	public Long getIdArgument() {
		return idArgument;
	}
	public void setIdArgument(Long idArgument) {
		this.idArgument = idArgument;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Long getDateInsert() {
		return dateInsert;
	}
	public void setDateInsert(Long dateInsert) {
		this.dateInsert = dateInsert;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getDateInsertFormatted() {
		String result = "";
		if (dateInsert==null)
			return "";

		String strDate = dateInsert.toString();
		result = strDate.substring(6, 8) + "/" + strDate.substring(4,6) + "/" + strDate.substring(0, 4);
		return result;
	}
	
}
