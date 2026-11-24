package com.axsosacademy.Counter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldController {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<String>());
			
		}
		return "ninja.jsp";
	}
	
	@PostMapping("/process_money")
	public String processMoney(@RequestParam("building") String building, HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
		
		Random random = new Random();
		int earned = 0;
		
		if (building.equals("farm")) {
			earned = random.nextInt(1, 6);
		} else if(building.equals("cave")) {
			earned = random.nextInt(6, 11);
		} else if(building.equals("house")) {
			earned = random.nextInt(11, 21);
		} else {
			earned = random.nextInt(-50, 51);
		}
		
		String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a"));
		String action = (earned < 0 ) ? "lost" : "earned";
		
		activities.add("You entered a " + building + " and you have " + action + " " + Math.abs(earned) + " gold. (" + stamp + ")");
		
		session.setAttribute("gold", gold + earned);
		
		return "redirect:/";
	}
	
	@GetMapping("/clear")
	public String clear(HttpSession session) {
		return "redirect:/";
		
	}

}
