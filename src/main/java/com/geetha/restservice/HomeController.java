package com.geetha.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String getHome() {
		return "Welcome to my Rest Service Homepage";
	}
}
