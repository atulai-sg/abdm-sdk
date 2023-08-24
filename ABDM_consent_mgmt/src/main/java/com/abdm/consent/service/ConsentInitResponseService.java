package com.abdm.consent.service;

import com.abdm.consent.models.Consent;
import com.abdm.consent.models.ConsentRequestInitResponse;

import java.util.List;

public interface ConsentInitResponseService {
    public List<ConsentRequestInitResponse> getConsentResponse();
    public ConsentRequestInitResponse getConsentResponse(String courseId);

    public ConsentRequestInitResponse addConsentResponse(ConsentRequestInitResponse c);
    public 	ConsentRequestInitResponse updateConsent(ConsentRequestInitResponse c);
    public void deleteConsentInitResponse(ConsentRequestInitResponse c);



}
