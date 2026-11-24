package com.axsosacademy.FruitsLoops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FruitsLoopsController {
	@GetMapping("/")
	public String Fruits(Model model) {
		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Item("Kiwi", 1.5));
		items.add(new Item("Mango", 2.0));
		items.add(new Item("Goji Berries", 4.0));
		items.add(new Item("Guava", 0.75));
		
		model.addAttribute("fruits", items);
		
		
		return "FruitsLoops.jsp";
	}

}
