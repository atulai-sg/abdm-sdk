package com.abdm.consent.controller;

import com.abdm.consent.models.Consent;
import com.abdm.consent.models.ConsentRequestInitResponse;
import com.abdm.consent.models.ConsentRequestInitResponseConsentRequest;
import com.abdm.consent.service.ConsentInitResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GatewayController {

    //this controller will be listening to abdm callback api
    //on localhost using nrok tunnel
    //like we will be listening to on-init api\
    //here in the gateway controller we will be listening backt o abdm callbacks
    //like we connected the database to
    //we will store the response body of the incoming post request
    //in our mongodb database
    //here i need to listen the response of the callbacks
    //ngrok is recommended because it creates sort of ssh tunnel for a service hosted on localhost to global network



    @Autowired
    private ConsentInitResponseService consentInitResponseService;



    //listening to callback of init ie onit
    //here we are listening to init callback which is nothin but onit
    //receive its repsonse and  then return the gateway a status code

    @PostMapping("on-init")
    public ResponseEntity<HttpStatus> getinitresponse(@RequestBody ConsentRequestInitResponse crip){

        //here we will be doing exception handling using try catch block
        try{
            this.consentInitResponseService.addConsentResponse(crip);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    //understand the struture
    //you just need to return the status code for these callbacks
    //on fetch
    //hiu notify
    //hip notify




//
//
//

//








}
