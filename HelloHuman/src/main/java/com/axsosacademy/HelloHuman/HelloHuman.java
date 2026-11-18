package com.axsosacademy.HelloHuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloHuman {

    @RequestMapping("/{name}/{lastName}")
    public String index(
    		@PathVariable("name") String name,
    		@PathVariable("lastName") String lastName
    		) {
        if (lastName.isBlank()) {
        	if (name.isBlank()) {
        		return "Hello Human!";
        	}
        	return "Hello " + name;
        }
    	return "Hello " + name + " " + lastName;
    }
	
}
