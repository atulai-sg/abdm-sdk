package com.abdm.consent.controller;


import com.abdm.consent.models.HIPConsentNotification;
import com.abdm.consent.service.Hip_Notify_Listening_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1.0")
public class HipController {


    //here we will put hip notify
    @Autowired
    private Hip_Notify_Listening_Service hipNotifyListeningService;
    @PostMapping("/consents/hip/notify")
    public ResponseEntity<HttpStatus> hipnotifylisten(@RequestBody HIPConsentNotification hipconsentnotification, String authorization, String X_HIU_ID){

        //here we will be doing exception handling using try catch block
        try{
            this.hipNotifyListeningService.addhipnotification(hipconsentnotification);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
