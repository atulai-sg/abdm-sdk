package com.abdm.consent.service;

import com.abdm.consent.models.HIUConsentRequestStatus;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class On_Status_Listening_Service_impl implements On_Status_Listening_Service{
    @Override
    public List<HIUConsentRequestStatus> getallhiuconsentrequeststatus() {
        return null;
    }

    @Override
    public HIUConsentRequestStatus getconsentArtefactResponse(String courseId) {
        return null;
    }

    @Override
    public HIUConsentRequestStatus addConsentArtefactResponse(HIUConsentRequestStatus c) {
        return null;
    }

    @Override
    public HIUConsentRequestStatus updateConsentArtefactResponse(HIUConsentRequestStatus c) {
        return null;
    }

    @Override
    public void deleteConsentArtefactResponse(HIUConsentRequestStatus c) {

    }
}
