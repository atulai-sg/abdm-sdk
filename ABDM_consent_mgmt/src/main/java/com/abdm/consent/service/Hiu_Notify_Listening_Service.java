package com.abdm.consent.service;

import java.util.List;
//import com.abdm.consent.models.HIPConsentNotification;
import com.abdm.consent.models.HIUConsentNotificationResponse;
import com.abdm.consent.models.HIUConsentRequestStatus;


public interface Hiu_Notify_Listening_Service {
    public List<HIUConsentNotificationResponse> getallhiuconsentnotificationresponse();
    public HIUConsentNotificationResponse getallhiuconsentnotificationresponse(String reqid);

    public HIUConsentNotificationResponse addhiuconsentnotificationresponse(HIUConsentNotificationResponse c);
    public HIUConsentNotificationResponse updatehiuconsentnotificationsresponse(HIUConsentNotificationResponse c);
    public void deleterhiuconsentnotificationresponse(HIUConsentNotificationResponse c);
}
