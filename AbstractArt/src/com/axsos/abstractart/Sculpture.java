package com.axsos.abstractart;

public class Sculpture extends Art {
	
	private String material;

	Sculpture(String title, String author, String desc, String material) {
		super(title, author, desc);
		// TODO Auto-generated constructor stub
		this.setMaterial(material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.printf("The Sculpture was created by %s, it's called: %s, the desc: %s, it was made out of: %s", this.getAuthor(), this.getTitle(), this.getDesc(), this.material);
	}

}
