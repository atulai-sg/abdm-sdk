package com.abdm.consent.service;

import com.abdm.consent.models.HIPConsentNotification;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Hip_Notify_Listening_Serviceimpl implements Hip_Notify_Listening_Service{
    @Override
    public List<HIPConsentNotification> getallhipnotifications() {
        return null;
    }

    @Override
    public HIPConsentNotification gethipnotification(String reqid) {
        return null;
    }

    @Override
    public HIPConsentNotification addhipnotification(HIPConsentNotification c) {
        return null;
    }

    @Override
    public HIPConsentNotification updatehipnotification(HIPConsentNotification c) {
        return null;
    }

    @Override
    public void deleteHipnotification(HIPConsentNotification c) {

    }
}
