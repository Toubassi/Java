package com.axsosacademy.DaiTravel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikitchi")
public class DaiTravel {
	@GetMapping("/travel/{city}")
	public String index(@PathVariable("city") String city) {
		return "Congratualtions! You will soon travel to " + city;
	}
	
	@GetMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}

}
