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

	private String accessToken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJBbFJiNVdDbThUbTlFSl9JZk85ejA2ajlvQ3Y1MXBLS0ZrbkdiX1RCdkswIn0.eyJleHAiOjE2OTA1NDg5NTMsImlhdCI6MTY5MDUyNzM1MywianRpIjoiYmE0MTQ4Y2QtZjVlOC00YWQzLTkxOGYtN2Y3MjBlNjhlYWUzIiwiaXNzIjoiaHR0cHM6Ly9kZXYubmRobS5nb3YuaW4vYXV0aC9yZWFsbXMvY2VudHJhbC1yZWdpc3RyeSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI2OWYzYmFmMi1kNTcxLTQxOGMtODIxMC1mZTNiMTg0MWE2YTQiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJTQlhfMDAzNjIyIiwic2Vzc2lvbl9zdGF0ZSI6Ijg2ZGExMGFjLTU4MzUtNDgwZi04NGU5LTZlZTZjMjVkYTE5NSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo5MDA3Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJoaXUiLCJvZmZsaW5lX2FjY2VzcyIsImhlYWx0aElkIiwicGhyIiwiT0lEQyIsImhpcCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IlNCWF8wMDM2MjIiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIGVtYWlsIHByb2ZpbGUiLCJjbGllbnRJZCI6IlNCWF8wMDM2MjIiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudEhvc3QiOiIxMC4yMzMuNjguMjExIiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LXNieF8wMDM2MjIiLCJjbGllbnRBZGRyZXNzIjoiMTAuMjMzLjY4LjIxMSJ9.epKCOzgFR9BA4NY-nIc7y9pWIwt148FSsmt4Jx9dN0XTCxpvkG4jlvVrxCRItdnLkaBgp5qw0bwicKeGzU9BgJ-hS81c8h-MtYR2umIQJyWbcqM0-v5elfGZ05KVNac8unZsRAjEQQ5opetTVc_-3tzSx4AkJBm9K__yCGFw_7-DrlN3ILCd09xqv-S9THoVFUypmHNOrMk4dP2CZ--dN904JOJTx4av59zRFpJFb6BTdEK-nxenXM6fPGuJ3kyf6r4ExhT47I5gme_DvpASpv2XR1acClwrtWz9vEdvVyynDJzsXMUg5lLC5tlDAmyoP10gsoJbEGmf2LR6np9Exg";
	


	@Autowired
	private ConsentRepo consentrepo;//this will be required in gateway controller

//	this controller for calling abdm apis
	//hiu hip facing controller




	//Creating consent request



	@Autowired
	RestTemplate restTemplate;

	//creating a consent request
	@RequestMapping(value = "/consent-request/init", method = RequestMethod.POST)
	public String createconsentrequest(@RequestBody Consent sampleconsent) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<Consent> entity = new HttpEntity<Consent>(sampleconsent,headers);

		return restTemplate.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consent-requests/init", HttpMethod.POST, entity, String.class).getBody();
	}



	//creating a request to get a consent artefact
	@RequestMapping(value = "/consents/fetch", method = RequestMethod.POST)
	public String createconsentartifactconsentrequest(@RequestBody ConsentFetchRequest sampleconsent) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<ConsentFetchRequest> entity = new HttpEntity<ConsentFetchRequest>(sampleconsent,headers);

		return restTemplate.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consents/fetch", HttpMethod.POST, entity, String.class).getBody();
	}


	//api call by hip to ack for notification fo consents
	@RequestMapping(value = "/consents/hip/on-notify", method = RequestMethod.POST)
	public String createProducts(@RequestBody HIPConsentNotificationResponse sampleconsent) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<HIPConsentNotificationResponse> entity = new HttpEntity<HIPConsentNotificationResponse>(sampleconsent,headers);

		return restTemplate.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consents/hip/on-notify", HttpMethod.POST, entity, String.class).getBody();
	}


	//api call by hiu to ask for notification for consents

	@RequestMapping(value = "/consents/hiu/on-notify", method = RequestMethod.POST)
	public String createProducts(@RequestBody HIUConsentNotificationResponse sampleconsent) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<HIUConsentNotificationResponse> entity = new HttpEntity<HIUConsentNotificationResponse>(sampleconsent,headers);

		return restTemplate.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consents/hiu/on-notify", HttpMethod.POST, entity, String.class).getBody();
	}



	//post api call to get consent request status
	@RequestMapping(value = "//consent-requests/status", method = RequestMethod.POST)
	public String getconsentrequeststatus(@RequestBody Consent sampleconsent) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(accessToken);
		HttpEntity<Consent> entity = new HttpEntity<Consent>(sampleconsent,headers);

		return restTemplate.exchange(
				"https://dev.abdm.gov.in/cm/v0.5/consent-requests/init", HttpMethod.POST, entity, String.class).getBody();
	}












//	@PostMapping("/consent-requests/onfetch")


}
