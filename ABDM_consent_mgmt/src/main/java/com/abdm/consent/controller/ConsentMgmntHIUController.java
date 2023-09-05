package com.abdm.consent.controller;

import com.abdm.consent.models.*;
//import com.abdm.consent.repo.ConsentRepo;
import com.abdm.consent.repo.ConsentGrantStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController

@RequestMapping("/v1.0")
public class ConsentMgmntHIUController {






	private String accessToken="insert your access token here";






	//Creating consent request



	@Autowired
	RestTemplate restTemplate1;

	@Autowired
	private ConsentGrantStatusRepo consentGrantStatusRepo;

	//creating a consent request
	@RequestMapping(value = "/consent-request/init", method = RequestMethod.POST)
	public String createconsentrequest(@RequestBody Consent sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		headers.set("X-CM-ID","sbx");
		HttpEntity<Consent> entity = new HttpEntity<Consent>(sample,headers);
		System.out.println(sample.getRequestId());
		Consentgranted consent=new Consentgranted(sample.getConsent().toString());
		consentGrantStatusRepo.save(consent);
		//wew ill req id vs availability gfranrt
		//default int false

		System.out.println("all consents till now with their grant status");
		System.out.println(".................................................");
//		for( Consentgranted cg:consentGrantStatusRepo.findByreqid()){
//			System.out.println(cg);
//		}




		return restTemplate1.exchange(
				"https://dev.ndhm.gov.in/gateway/v0.5/consent-requests/init", HttpMethod.POST, entity, String.class).getBody();
	}


	@Autowired
	RestTemplate restTemplate2;



	//creating a request to get a consent artefact
	@RequestMapping(value = "/consents/fetch", method = RequestMethod.POST)
	public String createconsentartifactconsentrequest(@RequestBody ConsentFetchRequest sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		headers.set("X-CM-ID","sbx");
		HttpEntity<ConsentFetchRequest> entity = new HttpEntity<ConsentFetchRequest>(sample,headers);

		return restTemplate2.exchange(
				"https://dev.ndhm.gov.in/gateway/v0.5/consents/fetch", HttpMethod.POST, entity, String.class).getBody();
	}


	//api call by hip to ack for notification fo consents
	@Autowired
	RestTemplate restTemplate3;
	@RequestMapping(value = "/consents/hip/on-notify", method = RequestMethod.POST)
	public String createProducts(@RequestBody HIPConsentNotificationResponse sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		headers.set("X-CM-ID","sbx");
		HttpEntity<HIPConsentNotificationResponse> entity = new HttpEntity<HIPConsentNotificationResponse>(sample,headers);

		return restTemplate3.exchange(
				"https://dev.ndhm.gov.in/gateway/v0.5/consents/hip/on-notify", HttpMethod.POST, entity, String.class).getBody();
	}
//
//
	//api call by hiu to ask for notification for consents
	@Autowired
	RestTemplate restTemplate4;

	@RequestMapping(value = "/consents/hiu/on-notify", method = RequestMethod.POST)
	public String createProducts(@RequestBody HIUConsentNotificationResponse sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		headers.set("X-CM-ID","sbx");
		HttpEntity<HIUConsentNotificationResponse> entity = new HttpEntity<HIUConsentNotificationResponse>(sample,headers);

		return restTemplate4.exchange(
				"https://dev.ndhm.gov.in/gateway/v0.5/consents/hiu/on-notify", HttpMethod.POST, entity, String.class).getBody();
	}
//
//
	@Autowired
	RestTemplate restTemplate5;
	//post api call to get consent request status
	@RequestMapping(value = "/consent-requests/status", method = RequestMethod.POST)
	public String getconsentrequeststatus(@RequestBody ConsentRequestStatusRequest sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		headers.set("X-CM-ID","sbx");
		HttpEntity<ConsentRequestStatusRequest> entity = new HttpEntity<ConsentRequestStatusRequest>(sample,headers);

		return restTemplate5.exchange(
				"https://dev.abdm.gov.in/gateway/v0.5/consent-requests/status", HttpMethod.POST, entity, String.class).getBody();
	}
//
//
//












}
