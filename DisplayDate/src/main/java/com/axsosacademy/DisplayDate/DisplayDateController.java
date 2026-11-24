package com.axsosacademy.DisplayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayDateController {
	@GetMapping("/")
	public String page1() {
		return "DisplayDate.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		
		model.addAttribute("date", date);
		return "Date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
		
		String formattedTime = formatter.format(time);
		
		model.addAttribute("time", formattedTime);
		
		return "Time.jsp";
		
	}
	
	
}
