package com.axsosacademy.HomeController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/daikichi")

public class Fortune {
	@RequestMapping("")
	public String home() {
		return "Welcome!";
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavours!";
	}
	
	@RequestMapping(value="/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
