package com.cognizant.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public DefaultResponse rootCall() {
		return new DefaultResponse("From the Home page");
	}
	
	
	@GetMapping("/api/hello")
	public DefaultResponse helloCall() {
		return new DefaultResponse("Hello from Azure Spring boot App!");
	}
}
