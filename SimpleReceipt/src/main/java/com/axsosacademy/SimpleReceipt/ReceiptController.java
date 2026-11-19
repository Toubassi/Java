package com.axsosacademy.SimpleReceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReceiptController {
	@GetMapping("/")
	public String receipt(Model model) {
		String name = "Grace Hopper";
		String item = "Copper Wire";
		double price = 5.25;
		String desc = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("name",name);
		model.addAttribute("item", item);
		model.addAttribute("price", price);
		model.addAttribute("desc", desc);
		model.addAttribute("vendor", vendor);
		
		return "Receipt.jsp";
	}
}
