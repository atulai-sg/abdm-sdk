package com.abdm.consent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.abdm,consent.controller","com.abdm.consent.service"})
public class AbdmConsentMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbdmConsentMgmtApplication.class, args);
	}

}
