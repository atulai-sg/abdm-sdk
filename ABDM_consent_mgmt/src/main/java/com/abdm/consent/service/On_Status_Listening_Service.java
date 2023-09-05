package com.abdm.consent.service;

import com.abdm.consent.models.HIUConsentRequestStatus;

import java.util.List;

public interface On_Status_Listening_Service {
    public List<HIUConsentRequestStatus> getallhiuconsentrequeststatus();
    public HIUConsentRequestStatus getconsentArtefactResponse(String courseId);

    public HIUConsentRequestStatus addConsentArtefactResponse(HIUConsentRequestStatus c);
    public 	HIUConsentRequestStatus updateConsentArtefactResponse(HIUConsentRequestStatus c);
    public void deleteConsentArtefactResponse(HIUConsentRequestStatus c);
}
