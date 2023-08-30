package com.abdm.consent.controller;

import com.abdm.consent.models.*;
import com.abdm.consent.models.Error;
import com.abdm.consent.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class GatewayController {

    //this controller will be listening to abdm callback api
    //on localhost using nrok tunnel
    //like we will be listening to on-init api\
    //here in the gateway controller we will be listening backt o abdm callbacks
    //like we connected the database to
    //we will store the response body of the incoming post request
    //in our mongodb database
//    here i need to listen the response of the callbacks
    //ngrok is recommended because it creates sort of ssh tunnel for a service hosted on localhost to global network



    @Autowired
    private ConsentInitResponseService consentInitResponseService;



    //listening to callback of init ie onit
    //here we are listening to init callback which is nothin but onit
    //receive its repsonse and  then return the gateway a status code

    @PostMapping("/v0.5/consent-requests/on-init")
    public ResponseEntity<HttpStatus> getinitresponse(@RequestBody ConsentRequestInitResponse consentRequestInitResponse, String authorization, String X_HIU_ID){

        //here we will be doing exception handling using try catch block
        try{

            System.out.println("this is onit callback");

            System.out.println(consentRequestInitResponse.getRequestId());
            System.out.println(consentRequestInitResponse.getTimestamp());
            this.consentInitResponseService.addConsentResponse(consentRequestInitResponse);

            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }catch (Exception e){
            Error ee=new Error();
            ee.setCode(1000);
            ee.setMessage("String");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
//
    //onfetch listening
//
//    @Autowired
//
//    private Fetch_Response_Listening_Service fetchResponseListeningService;
//    @PostMapping("on-fetch")
//    public ResponseEntity<HttpStatus> getonfetch(@RequestBody ConsentArtefactResponse consentArtefactResponse, String authorization, String X_HIU_ID){
//
//        //here we will be doing exception handling using try catch block
//        try{
//            this.fetchResponseListeningService.addConsentArtefactResponse(consentArtefactResponse);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//    //on-status resulting callback from gateway of the consent request status
//
//    @Autowired
//    private On_Status_Listening_Service onStatusListeningService;
//
//    @PostMapping("on-status")
//    public ResponseEntity<HttpStatus> getonstatus(@RequestBody HIUConsentRequestStatus consentstatusresponse, String authorization, String X_HIU_ID){
//
//        //here we will be doing exception handling using try catch block
//        try{
//            this.onStatusListeningService.addConsentArtefactResponse(consentstatusresponse);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//
//
//    //hiu notify
//
//    @Autowired
//
//    private Hiu_Notify_Listening_Service hiuNotifyListeningService;
//    @PostMapping("hiu-notify")
//
//    public ResponseEntity<HttpStatus> hiunotfiylisten(@RequestBody HIUConsentNotificationResponse hiuConsentNotificationResponse, String authorization, String X_HIU_ID){
//
//        //here we will be doing exception handling using try catch block
//        try{
//            this.hiuNotifyListeningService.addConsentArtefactResponse(hiuConsentNotificationResponse);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//    @Autowired
//    private Hip_Notify_Listening_Service hipNotifyListeningService;
//    @PostMapping("hip-notify")
//    public ResponseEntity<HttpStatus> hipnotifylisten(@RequestBody HIUConsentRequestStatus consentstatusresponse, String authorization, String X_HIU_ID){
//
//        //here we will be doing exception handling using try catch block
//        try{
//            this.onStatusListeningService.addConsentArtefactResponse(consentstatusresponse);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//
//
//    //focus
//
//
//
//
//    //understand the struture
//    //you just need to return the status code for these callbacks
//    //on fetch
//    //hiu notify
//    //hip notify
//
//
//
//
//
//
//
////
////
////
//
////
//
//
//
//
//
//


}
