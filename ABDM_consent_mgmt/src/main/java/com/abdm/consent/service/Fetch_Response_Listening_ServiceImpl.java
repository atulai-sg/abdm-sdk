package com.abdm.consent.service;

import com.abdm.consent.models.ConsentArtefactResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class Fetch_Response_Listening_ServiceImpl implements Fetch_Response_Listening_Service{
    List<ConsentArtefactResponse> all;


    @Override
    public List<ConsentArtefactResponse> getallconsentartefacts() {
        return all;
    }

    @Override
    public ConsentArtefactResponse getconsentArtefactResponse(String courseId) {
        for(ConsentArtefactResponse c:all){
            if(c.getRequestId()== UUID.fromString(courseId)){

                return c;

            }

        }
        return new ConsentArtefactResponse();
    }

    @Override
    public ConsentArtefactResponse addConsentArtefactResponse(ConsentArtefactResponse c) {
        all.add(c);
        return c;
    }

    @Override
    public ConsentArtefactResponse updateConsentArtefactResponse(ConsentArtefactResponse c) {
        for(ConsentArtefactResponse e:all){
            if(e.getRequestId()==c.getRequestId()){
                e=c;
            }
        }
        return c;
    }

    @Override
    public void deleteConsentArtefactResponse(ConsentArtefactResponse c) {
        all.remove(c);

    }


}
