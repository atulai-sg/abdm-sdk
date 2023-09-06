package com.abdm.data_transfer_workflow.controller;




import com.abdm.data_transfer_workflow.models.HIRequest;

import com.abdm.data_transfer_workflow.models.HipRequest;
import com.abdm.data_transfer_workflow.models.HiuNotification;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
@RequestMapping("/v1.0")
public class HrpRequestController {

    @Autowired
    RestTemplate restTemplate;
    private String accessToken = "";

    public HrpRequestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

 //hrp request to request the health data
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/health-information/request", method = RequestMethod.POST)
    public String createHirequest(@RequestBody HIRequest samplerequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        headers.set("X-CM-ID","sbx");
        HttpEntity<HIRequest> entity = new HttpEntity<HIRequest>(samplerequest, headers);

        return restTemplate.exchange(
                "https://dev.abdm.gov.in/gateway/v0.5/health-information/cm/request", HttpMethod.POST, entity, String.class).getBody();
    }

    @Autowired
    RestTemplate restTemplate2;
    // for hip request
    //API called by CM to request Health information from HIP against a validated consent artefact.
    // The transactionId is the correlation id that HIP should use use when pushing data to the dataPushUrl.
    @ResponseStatus(HttpStatus.ACCEPTED)

    @RequestMapping(value = "hip/request", method = RequestMethod.POST)
    public String createcNotifyrequest(@RequestBody HipRequest sample) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        headers.set("X-HIM-ID","sbx");
        HttpEntity<HipRequest> entity = new HttpEntity<HipRequest>(sample,headers);

        return restTemplate2.exchange(
                "https://dev.abdm.gov.in/gateway/v0.5/health-information/hip/request", HttpMethod.POST, entity, String.class).getBody();
    }






    @Autowired
    RestTemplate restTemplate3;

    //Notification about data trasnfer
    @ResponseStatus(HttpStatus.ACCEPTED)

    @RequestMapping(value = "/health-information/notify", method = RequestMethod.POST)
    public String createcNotifyrequest(@RequestBody HiuNotification sample1) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        headers.set("X-CM-ID","sbx");
        HttpEntity<HiuNotification> entity = new HttpEntity<HiuNotification>(sample1,headers);

        return restTemplate3.exchange(
                "https://dev.abdm.gov.in/gateway/v0.5/health-information/notify", HttpMethod.POST, entity, String.class).getBody();
    }



}