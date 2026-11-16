package com.axsos.abstractart;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sculpture s = new Sculpture("Saj", "Sajeda", "Creative", "Marbel");
		Painting p = new Painting("Em", "Emil", "Colorful", "WaterMark");
		
		s.viewArt();
		System.out.println("");
		p.viewArt();
		
		ArrayList<Art> museum = new ArrayList<>();
		museum.add(p);
		museum.add(s);
		
		System.out.println("");
		
		for(Art art : museum) {
			System.out.println(art.getAuthor());
			System.out.println(art.getTitle());
				};
		
	}
	
}
