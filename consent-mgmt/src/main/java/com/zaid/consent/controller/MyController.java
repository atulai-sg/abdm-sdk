package com.zaid.consent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping
	public String hello() {
		return "ABDM CONSENT MANAGEMENT";
	}

}
