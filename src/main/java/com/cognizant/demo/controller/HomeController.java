package com.cognizant.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String rootCall() {
		return "Hello by default from Azure!";
	}
	
	
	@GetMapping("/api/hello")
	public String helloCall() {
		return "Hello from Azure Spring boot App!";
	}
}
