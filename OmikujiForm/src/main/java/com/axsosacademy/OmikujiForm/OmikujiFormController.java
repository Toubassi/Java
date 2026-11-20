package com.axsosacademy.OmikujiForm;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiFormController {
	@GetMapping("/omikuji")
	public String home() {
		return "form.jsp";
	}

	@PostMapping("/send")
	public String send(HttpSession session,
			@RequestParam(value="number") int number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="livingThing") String livingThing,
			@RequestParam(value="comment") String comment
			
			) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("comment", comment);
		
		return "redirect:/fortune";
	}
	
	@GetMapping("/fortune")
	public String fortune(HttpSession session) {
	
		return "fortune.jsp";
	}
	
}
