package com.abdm.consent.service;

import com.abdm.consent.models.HIPConsentNotification;

import java.util.List;

public interface Hip_Notify_Listening_Service {
    public List<HIPConsentNotification> getallhipnotifications();
    public HIPConsentNotification gethipnotification(String reqid);

    public HIPConsentNotification addhipnotification(HIPConsentNotification c);
    public 	HIPConsentNotification updatehipnotification(HIPConsentNotification c);
    public void deleteHipnotification(HIPConsentNotification c);
}
