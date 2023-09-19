package Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import swagger.model.HIUSubscriptionNotificationAcknowledgment;
import swagger.model.HIUSubscriptionRequestNotificationAcknowledgement;
import swagger.model.HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement;
import swagger.model.SubscriptionRequest;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
@RestController

@RequestMapping("/v1.0")
public class SubscriptionManagementHIUFacadeController {
    private String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJBbFJiNVdDbThUbTlFSl9JZk85ejA2ajlvQ3Y1MXBLS0ZrbkdiX1RCdkswIn0.eyJleHAiOjE2OTQwODYzODUsImlhdCI6MTY5NDA2NDc4NSwianRpIjoiODdjOWI3ZjMtYjUzZS00MzM4LTg1ZDYtYzg2MmFlZTQzMGY4IiwiaXNzIjoiaHR0cHM6Ly9kZXYubmRobS5nb3YuaW4vYXV0aC9yZWFsbXMvY2VudHJhbC1yZWdpc3RyeSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiIwODI2ODkyNy1kMDUxLTQ3ZGUtYTE3Mi0yYWRjYmJlOWVlYTYiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJTQlhfMDAyOTI4Iiwic2Vzc2lvbl9zdGF0ZSI6ImE3OTQ0NDZiLWU2NWEtNGFmZS1iYWM3LTJmNzQ3NmFkMTRkNCIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo5MDA3Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJoZnIiLCJoaXUiLCJvZmZsaW5lX2FjY2VzcyIsImhlYWx0aElkIiwicGhyIiwiT0lEQyIsImhlYWx0aF9sb2NrZXIiLCJoaXAiLCJocF9pZCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IlNCWF8wMDI5MjgiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIGVtYWlsIHByb2ZpbGUiLCJjbGllbnRIb3N0IjoiMTAuMjMzLjY3LjE1IiwiY2xpZW50SWQiOiJTQlhfMDAyOTI4IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc2J4XzAwMjkyOCIsImNsaWVudEFkZHJlc3MiOiIxMC4yMzMuNjcuMTUifQ.K4apaykMazOK4L4RBxJ-X73E8I5MVwREF3ut_2KZRwBXS2B0WCiaQ15dhjFUC3okkn44pY6aGsg0XFdqALKHqYNWNLmpixFsclXyYquBOXp89U6naVap_tjno2sn16pnWlJ0O60BirsHngw-bBNyd1OoBKTaXgtfucdhYURB4yOCY4mF-anStvYgOJjhWwAYtTxSUQ3eGESjnfHSHUefhvEFZLdALk7Ak-VkIhQoYxEHVPBrLDcHLLagkLOf7rlCVMdoGd94LeTCPb0jyqolk3h7l_xSHlXCDUU3IdZ4ZhvBWHooFSUzNFtwS4_R9hJLBA6j7GBGUYtnTAO_SBeUzA";
    @Autowired
    RestTemplate restTemplate1;
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/subscription-requests/cm/init", method = RequestMethod.POST)
    public String createSubscriptionRequest(@RequestBody SubscriptionRequest sample, @RequestHeader HttpHeaders headers) throws JsonProcessingException {
       headers.setBearerAuth(accessToken);
        headers.set("Content-Type","application/json");
        headers.set("User-Agent", "PostmanRuntime/7.32.2");
        headers.set("X-CM-ID","sbx");
        headers.set("Accept", "*/*");

        HttpEntity<SubscriptionRequest> entity = new HttpEntity<SubscriptionRequest>(sample,headers);
        System.out.println(sample.getRequestId());
        return restTemplate1.exchange("https://dev.abdm.gov.in/gateway/v0.5/subscription-requests/cm/init", HttpMethod.POST, entity, String.class).getBody();

    }

    @Autowired
    RestTemplate restTemplate2;
    @RequestMapping(value = "/subscription-requests/hiu/on-notify", method = RequestMethod.POST)
    public String createNotif(@RequestBody HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement sample, @RequestHeader HttpHeaders headers){
       // HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        headers.set("Content-Type","application/json");
        headers.set("User-Agent", "PostmanRuntime/7.32.2");
        headers.set("X-CM-ID","sbx");
        headers.set("Accept", "*/*");
        HttpEntity<HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement> entity = new HttpEntity<HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement>(sample,headers);
        return restTemplate2.exchange("https://dev.abdm.gov.in/gateway/v0.5/subscriptions/hiu/on-notify", HttpMethod.POST, entity, String.class).getBody();

    }
    @Autowired
    RestTemplate restTemplate3;
    @RequestMapping(value = "/bridges", method = RequestMethod.PATCH)
    public ResponseEntity<String> invokeApi(@RequestBody String requestBody) {
        String apiUrl = "https://dev.abdm.gov.in/devservice/v1/bridges";

        // Define the request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", accessToken);
        headers.set("X-CM-ID","sbx");

        // Create a RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Create the request entity with headers and body
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Send the PATCH request and get the response
        ResponseEntity<String> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.PATCH, requestEntity, String.class);

        return responseEntity;

    }



}
