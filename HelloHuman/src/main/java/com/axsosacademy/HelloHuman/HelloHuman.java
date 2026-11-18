package com.axsosacademy.HelloHuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloHuman {

    @RequestMapping("/")
    public String index(
    		@RequestParam(value="q", required=false, defaultValue = "Human") String name,
    		@RequestParam(value="u", required=false) String lastName,
    		@RequestParam(value="times", defaultValue="1") int times
    		) {
    	String hello = "";
    	for(int i = 0; i < times; i++) {
    		
    		hello += "Hello " + name + " " + lastName;
    	}
    	return hello;
    }
	
}
