package com.abdm.consent.service;

import com.abdm.consent.models.Consent;
import com.abdm.consent.models.ConsentFetchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ConsentService {

    ///first the controller will look into everythin
    //then request is sent to service layer


    @Autowired
    private RestTemplate template=new RestTemplate();



    //init
    public Consent[] createconsentservice(){
        return template.getForObject("https://dev.abdm.gov.in/cm/v0.5/consent-requests/init", Consent[].class);
    }




    //fetch
    public ConsentFetchRequest[] creatconsentfetchrequest(){
        return template.getForObject("https://dev.abdm.gov.in/cm/v0.5/consents/fetch",ConsentFetchRequest[].class);
    }
    //just making the struture

    //
    //consent notification //api called by hip to acknowledge to notification of consent
    //here we will be doing a post request to the external api
    //that we will be callning using springboot





}
