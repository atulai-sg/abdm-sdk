package com.abdm.consent.controller;

import com.abdm.consent.models.Consent;
import com.abdm.consent.models.ConsentFetchRequest;
import com.abdm.consent.models.HIPConsentNotificationResponse;
import com.abdm.consent.models.HIUConsentNotificationResponse;
import com.abdm.consent.repo.ConsentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController

@RequestMapping("/v1.0")
public class ConsentMgmntHIUController {

	private String accessToken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJBbFJiNVdDbThUbTlFSl9JZk85ejA2ajlvQ3Y1MXBLS0ZrbkdiX1RCdkswIn0.eyJleHAiOjE2OTI5MjI4ODQsImlhdCI6MTY5MjkwMTI4NCwianRpIjoiYWRiYWMyMDgtYTA2ZC00MzJiLTkzY2EtNjJjMTJkZDE1ZTYzIiwiaXNzIjoiaHR0cHM6Ly9kZXYubmRobS5nb3YuaW4vYXV0aC9yZWFsbXMvY2VudHJhbC1yZWdpc3RyeSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI2OWYzYmFmMi1kNTcxLTQxOGMtODIxMC1mZTNiMTg0MWE2YTQiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJTQlhfMDAzNjIyIiwic2Vzc2lvbl9zdGF0ZSI6IjlhMmVhYTI1LTc5M2EtNGE5Ni05MmRiLWYzMGMxNzg2NjdkNSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo5MDA3Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJoaXUiLCJvZmZsaW5lX2FjY2VzcyIsImhlYWx0aElkIiwicGhyIiwiT0lEQyIsImhpcCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IlNCWF8wMDM2MjIiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIGVtYWlsIHByb2ZpbGUiLCJjbGllbnRJZCI6IlNCWF8wMDM2MjIiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudEhvc3QiOiIxMC4yMzMuNjkuMjQ2IiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LXNieF8wMDM2MjIiLCJjbGllbnRBZGRyZXNzIjoiMTAuMjMzLjY5LjI0NiJ9.ixeIFpMOwINZtzu2WgdG-D51kaFBKwbKvZe-CCDJPyQQ0tN15-TemUJ2gC8YN1bdpTGjbJZPJbCw71tG0i5TyAOuQN7qClzl8bK7jUXslSv4lubfmLyMq9uNK0jwQbOyv4qu8-Sfpf-cozN3ZQeW5oGZas44ix8Fq50L24Kl48p8szNXGtrC7xi8-NX280xrTsNULC-Zpuo4mC0vM2arQXaaf6sgJmZJaY-oAJFvo-S76z-ST2tdbIRNJTXyMaVJrsTWMP6ZCJ5maAsF2x4LioWde5twPqH8Pj3Z6ZwpWk8L0vVoI92YM8Hm5SY0mVxuccQjjmd2vAqqg8nvubqe2Q";
	@Autowired
	private ConsentRepo consentrepo;//this will be required in gateway controller

//	this controller for calling abdm apis
	//hiu hip facing controller




	//Creating consent request



	@Autowired
	RestTemplate restTemplate1;

	//creating a consent request
	@RequestMapping(value = "/consent-request/init", method = RequestMethod.POST)
	public String createconsentrequest(@RequestBody Consent sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<Consent> entity = new HttpEntity<Consent>(sample,headers);

		return restTemplate1.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consent-requests/init", HttpMethod.POST, entity, String.class).getBody();
	}


	@Autowired
	RestTemplate restTemplate2;



	//creating a request to get a consent artefact
	@RequestMapping(value = "/consents/fetch", method = RequestMethod.POST)
	public String createconsentartifactconsentrequest(@RequestBody ConsentFetchRequest sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<ConsentFetchRequest> entity = new HttpEntity<ConsentFetchRequest>(sample,headers);

		return restTemplate2.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consents/fetch", HttpMethod.POST, entity, String.class).getBody();
	}
//
//
	//api call by hip to ack for notification fo consents
	@Autowired
	RestTemplate restTemplate3;
	@RequestMapping(value = "/consents/hip/on-notify", method = RequestMethod.POST)
	public String createProducts(@RequestBody HIPConsentNotificationResponse sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<HIPConsentNotificationResponse> entity = new HttpEntity<HIPConsentNotificationResponse>(sample,headers);

		return restTemplate3.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consents/hip/on-notify", HttpMethod.POST, entity, String.class).getBody();
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
		HttpEntity<HIUConsentNotificationResponse> entity = new HttpEntity<HIUConsentNotificationResponse>(sample,headers);

		return restTemplate4.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consents/hiu/on-notify", HttpMethod.POST, entity, String.class).getBody();
	}
//
//
	@Autowired
	RestTemplate restTemplate5;
	//post api call to get consent request status
	@RequestMapping(value = "/consent-requests/status", method = RequestMethod.POST)
	public String getconsentrequeststatus(@RequestBody Consent sample) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<Consent> entity = new HttpEntity<Consent>(sample,headers);

		return restTemplate5.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consent-requests/init", HttpMethod.POST, entity, String.class).getBody();
	}
//
//
//









//	@PostMapping("/consent-requests/onfetch")


}
