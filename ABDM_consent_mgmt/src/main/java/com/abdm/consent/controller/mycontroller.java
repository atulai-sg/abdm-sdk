package com.abdm.consent.controller;

import com.abdm.consent.models.consent;
import com.abdm.consent.repo.ConsentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/consent")
public class mycontroller {
	
//	@GetMapping
//	public String Hello() {
//		return "consent management";
//	}


	@Autowired
	private ConsentRepo consentrepo;



	@PostMapping("/")
	public ResponseEntity<?> addConsent(@RequestBody consent cons){
		consent save=this.consentrepo.save(cons);
		return ResponseEntity.ok(save);
	}

	@GetMapping("/")
	public ResponseEntity<?> getStudent(){
		return ResponseEntity.ok(this.consentrepo.findAll());
	}

}
