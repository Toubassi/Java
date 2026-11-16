package com.axsos.abstractart;

public abstract class Art {
	private String title;
	private String author;
	private String desc;
	
	Art(String title, String author, String desc){
		this.title = title;
		this.author = author;
		this.desc = desc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public abstract void viewArt();
}
