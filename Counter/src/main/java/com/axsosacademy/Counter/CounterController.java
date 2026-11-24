package com.axsosacademy.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@GetMapping("/welcome")
	public String welcome(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer current = (Integer) session.getAttribute("count");
			session.setAttribute("count", current+1);
		}
		return "H.jsp";
	}
	
	
	@GetMapping("/counter")
	public String Counter(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		return "Counter.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();	
		return "redirect:/welcome";
	}
	
	@GetMapping("/by2")
	public String by2(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer current = (Integer) session.getAttribute("count");
			session.setAttribute("count", current+2);
		}
		return "by2.jsp";
	}
	

}
