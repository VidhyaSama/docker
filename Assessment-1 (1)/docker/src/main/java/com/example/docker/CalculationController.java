package com.example.docker;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculation")
public class CalculationController {

	@PostMapping
	public String addTwoNumbers(@RequestParam("a") int a, @RequestParam("b") int b) {
		int sum = a+b;
		return "addition of "+a+","+b+"="+sum;
	}
}
