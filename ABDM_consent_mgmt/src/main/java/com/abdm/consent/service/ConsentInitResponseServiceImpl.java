package com.abdm.consent.service;

import com.abdm.consent.models.ConsentRequestInitResponse;

import java.util.List;
import java.util.UUID;

public class ConsentInitResponseServiceImpl implements  ConsentInitResponseService{


    List<ConsentRequestInitResponse> all;//this local list can later be replaced by saving the response in mongofb database


    @Override
    public List<ConsentRequestInitResponse> getConsentResponse() {
        return all;
    }

    @Override
    public ConsentRequestInitResponse getConsentResponse(String id) {

        for(ConsentRequestInitResponse c:all){
            if(c.getRequestId()== UUID.fromString(id)){

                return c;

            }

        }
        return new ConsentRequestInitResponse();

    }

    @Override
    public ConsentRequestInitResponse addConsentResponse(ConsentRequestInitResponse c) {
        all.add(c);
        return c;
    }

    @Override
    public ConsentRequestInitResponse updateConsent(ConsentRequestInitResponse c) {
        for(ConsentRequestInitResponse e:all){
            if(e.getRequestId()==c.getRequestId()){
                e=c;
            }
        }
        return c;
    }

    @Override
    public void deleteConsentInitResponse(ConsentRequestInitResponse c) {
        all.remove(c);
    }


}
