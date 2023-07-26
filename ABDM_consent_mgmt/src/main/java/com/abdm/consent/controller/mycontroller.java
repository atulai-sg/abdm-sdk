package com.abdm.consent.controller;

import com.abdm.consent.models.Consent;
import com.abdm.consent.repo.ConsentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/consent")
public class mycontroller {
	


	@Autowired
	private ConsentRepo consentrepo;



	@PostMapping("/")
	public ResponseEntity<?> addConsent(@RequestBody Consent cons){
		Consent save=this.consentrepo.save(cons);
		return ResponseEntity.ok(save);
	}

	@GetMapping("/")
	public ResponseEntity<?> getConsent(){
		return ResponseEntity.ok(this.consentrepo.findAll());
	}

}
