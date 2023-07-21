package com.abdm.consent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
	
	@GetMapping
	public String Hello() {
		return "consent management";
	}

}
