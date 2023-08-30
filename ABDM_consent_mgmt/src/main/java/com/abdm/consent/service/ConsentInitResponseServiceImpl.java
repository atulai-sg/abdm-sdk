package com.abdm.consent.service;

import com.abdm.consent.models.ConsentRequestInitResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service

public class ConsentInitResponseServiceImpl implements  ConsentInitResponseService{


    List<ConsentRequestInitResponse> all;//this local list can later be replaced by saving the response in mongofb database


    @Override
    public List<ConsentRequestInitResponse> getConsentResponse() {
        return all;
    }

    @Override
    public ConsentRequestInitResponse getConsentResponse(String id) {

        for(ConsentRequestInitResponse c:all){
            if(c.getRequestId()== (id)){

                return c;

            }

        }
        return new ConsentRequestInitResponse();

    }

    @Override
    public ConsentRequestInitResponse addConsentResponse(ConsentRequestInitResponse c) {


        all.add(c);
        System.out.println(c.getRequestId());
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
