package com.abdm.consent.controller;

import com.abdm.consent.models.*;
//import com.abdm.consent.repo.ConsentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController

@RequestMapping("/v1.0")
public class ConsentMgmntHIUController {

	private String accessToken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJBbFJiNVdDbThUbTlFSl9JZk85ejA2ajlvQ3Y1MXBLS0ZrbkdiX1RCdkswIn0.eyJleHAiOjE2OTM0MzkwMDQsImlhdCI6MTY5MzQxNzQwNCwianRpIjoiZWUzYmNhMzQtMWE4My00OGZkLWFjNjUtZmFiMDNlMzY0N2Y2IiwiaXNzIjoiaHR0cHM6Ly9kZXYubmRobS5nb3YuaW4vYXV0aC9yZWFsbXMvY2VudHJhbC1yZWdpc3RyeSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI2OWYzYmFmMi1kNTcxLTQxOGMtODIxMC1mZTNiMTg0MWE2YTQiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJTQlhfMDAzNjIyIiwic2Vzc2lvbl9zdGF0ZSI6IjQzYWRmNmYyLThkYTAtNDA4ZS1hNjk4LTNkZmZhZGY4YWZiNyIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo5MDA3Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJoaXUiLCJvZmZsaW5lX2FjY2VzcyIsImhlYWx0aElkIiwicGhyIiwiT0lEQyIsImhpcCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IlNCWF8wMDM2MjIiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIGVtYWlsIHByb2ZpbGUiLCJjbGllbnRJZCI6IlNCWF8wMDM2MjIiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudEhvc3QiOiIxMC4yMzMuNjkuMzIiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc2J4XzAwMzYyMiIsImNsaWVudEFkZHJlc3MiOiIxMC4yMzMuNjkuMzIifQ.KAj4O3kWLPIqmR1xeB3F4dtvDtPlBWlOquNJagF38LVz4TkE48pWEuDBi4Z7T9HSc8qeNmTM0itoUL8UBxt2lDsVxM3GT3dsl0YBQvneMvhV69IYnUKB3YCWd2F5cbBXU5hCeDOejPb8VY8t1MYxRl7QANRLv-1YxFTRfgycwMgXNkysSxk1PKzqtUkzbSk_lK0REQ1XZQcAV4VcocqttobHxTfTqOJO-raKVjS3CrGAJeRplRLHt02Ga-E12LhXeT5c9L4KWFZdhDLtfxZhzVTVk6VXNuN82ZwnEl7squCNMj4RsozON4jVRk-nyI-2MBgOSUgQpqcfzINF03TrjQ";



//	private String accessToken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJBbFJiNVdDbThUbTlFSl9JZk85ejA2ajlvQ3Y1MXBLS0ZrbkdiX1RCdkswIn0.eyJleHAiOjE2OTM0MDE1NjAsImlhdCI6MTY5MzM3OTk2MCwianRpIjoiZWYyNjMxMDEtNzI2Zi00YzJiLTk5NTUtY2FhNGNmZmNjNjc0IiwiaXNzIjoiaHR0cHM6Ly9kZXYubmRobS5nb3YuaW4vYXV0aC9yZWFsbXMvY2VudHJhbC1yZWdpc3RyeSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI2OWYzYmFmMi1kNTcxLTQxOGMtODIxMC1mZTNiMTg0MWE2YTQiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJTQlhfMDAzNjIyIiwic2Vzc2lvbl9zdGF0ZSI6IjQ5Yzg0YjM2LTk3NTktNGZjNS05ZDhkLWVjNzQ0ZjNhZWE1ZCIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo5MDA3Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJoaXUiLCJvZmZsaW5lX2FjY2VzcyIsImhlYWx0aElkIiwicGhyIiwiT0lEQyIsImhpcCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IlNCWF8wMDM2MjIiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIGVtYWlsIHByb2ZpbGUiLCJjbGllbnRJZCI6IlNCWF8wMDM2MjIiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudEhvc3QiOiIxMC4yMzMuNjkuMzIiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc2J4XzAwMzYyMiIsImNsaWVudEFkZHJlc3MiOiIxMC4yMzMuNjkuMzIifQ.N5LPLW97ZvlAh0IW4-omz-hAJ6Zbio4oJ1-u69IvxVdnLqppsQ6WBp3u-5HapAVA-1knvPKen4BtBNzXAA0VVj8nqtqu75rNVlMYuRk3gp919qM5o7-cd9akUnBOhppeWFuBjRpcQ2JkGmiuVpQHbB5vyv3mi7fSZJaL1mIe7Coq13YMNP1K5XVWlJ6uyHDf4oC9Fb2dijHbwS5qGqSUR47ZEq8hlXV41ecMCrlcMj89zhE4GaSfDSH2mQslKcVbEVO_Q5VWJpsK5yvS333tXl8ZBC_qL_mA-q4yjcvFCIlhFJ2Tttlp7ikNZUAwsdfdM4B__V5dWxaAkqsLlKftnQ";




//yNiwianRpIjoiYWI1MjllYTAtOTVmOC00MjQ2LTg4NTItOGQ2MWQ4NGQ0ZTA2IiwiaXNzIjoiaHR0cHM6Ly9kZXYubmRobS5nb3YuaW4vYXV0aC9yZWFsbXMvY2VudHJhbC1yZWdpc3RyeSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI2OWYzYmFmMi1kNTcxLTQxOGMtODIxMC1mZTNiMTg0MWE2YTQiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJTQlhfMDAzNjIyIiwic2Vzc2lvbl9zdGF0ZSI6ImY5OGJkZWI5LWU0MjQtNDIyOS05NDgzLWZhYzk4NTUxMzlmZiIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo5MDA3Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJoaXUiLCJvZmZsaW5lX2FjY2VzcyIsImhlYWx0aElkIiwicGhyIiwiT0lEQyIsImhpcCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IlNCWF8wMDM2MjIiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIGVtYWlsIHByb2ZpbGUiLCJjbGllbnRJZCI6IlNCWF8wMDM2MjIiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudEhvc3QiOiIxMC4yMzMuNjkuMTciLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc2J4XzAwMzYyMiIsImNsaWVudEFkZHJlc3MiOiIxMC4yMzMuNjkuMTcifQ.iDNPIx_D-IFq69y17AOvXGX4DmIT_lSacsjyLeudH1v-y4banQjRZTsUksLenN-9JGHS5ofB8eks6pM3ZpllxPRntHM-yBKang0GkwpPSTzB1x6dTcKI_2S9HUrnRXjyDwon339dc41fmGDdHDkjn-5Xn33NPv3ZT0mbxY5c2sfAAaJrrV5xjL4ro7hTOgdRyZCXmX2Uu2U4Rbx9QvCo4nI5YfXRYzwpCx73AILaE4VfCjdXOOXWgpS05OU5hYD1ANzJw1I4ZIQ37u9i6TBg-icC719-gRYMwdJyEdWoNzP8qK18jsvFl2F9SEY47lDUQMWByYC6QLMVCIc0JCmVKg";
//	@Autowired
//	private ConsentRepo consentrepo;//this will be required in gateway controller

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
		headers.set("X-CM-ID","sbx");
		HttpEntity<Consent> entity = new HttpEntity<Consent>(sample,headers);
		System.out.println(sample.getRequestId());

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
