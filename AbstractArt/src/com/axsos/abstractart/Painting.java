package com.axsos.abstractart;

public class Painting extends Art {
	private String paintType;
	
	Painting(String title, String author, String desc, String paintType) {
		super(title, author, desc);
		// TODO Auto-generated constructor stub
		this.setPaintType(paintType);
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.printf("This painting is called: %s, by: %s, About the painting: %s, made using: %s", this.getTitle(), this.getAuthor(), this.getDesc(), this.paintType );
		
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	

}
