package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import swagger.model.HIUSubscriptionNotificationAcknowledgment;
import swagger.model.HIUSubscriptionRequestNotificationAcknowledgement;
import swagger.model.SubscriptionRequest;

import java.util.Arrays;
@RestController

@RequestMapping("/v1.0")
public class SubscriptionManagementHIUController {
    private String accessToken;

    //@Autowired;
    RestTemplate restTemplate1;
    @RequestMapping(value = "/subscription-requests/hiu/on-init", method = RequestMethod.POST)
    public String createHIUSubscriptionRequest(@RequestBody HIUSubscriptionRequestNotificationAcknowledgement sample){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        HttpEntity<HIUSubscriptionRequestNotificationAcknowledgement> entity = new HttpEntity<HIUSubscriptionRequestNotificationAcknowledgement>(sample,headers);
        return restTemplate1.exchange("https://dev.abdm.gov.in/cm/v0.5/subscription-requests/hiu/on-init", HttpMethod.POST, entity, String.class).getBody();

    }
    @Autowired
    RestTemplate restTemplate2;
    @RequestMapping(value = "subscription-requests/hiu/notify", method = RequestMethod.POST)
    public String createNotif(@RequestBody HIUSubscriptionRequestNotificationAcknowledgement sample){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        HttpEntity<HIUSubscriptionRequestNotificationAcknowledgement> entity = new HttpEntity<HIUSubscriptionRequestNotificationAcknowledgement>(sample,headers);
        return restTemplate2.exchange("https://dev.abdm.gov.in/cm/v0.5/subscription-requests/hiu/notify", HttpMethod.POST, entity, String.class).getBody();

    }
    @Autowired
    RestTemplate restTemplate3;
    @RequestMapping(value = "subscriptions/hiu/notify", method = RequestMethod.POST)
    public String getSubscriptionStatus(@RequestBody HIUSubscriptionNotificationAcknowledgment sample){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        HttpEntity<HIUSubscriptionNotificationAcknowledgment> entity = new HttpEntity<HIUSubscriptionNotificationAcknowledgment>(sample,headers);
        return restTemplate3.exchange("https://dev.abdm.gov.in/cm/v0.5/subscriptions/hiu/notify", HttpMethod.POST, entity, String.class).getBody();

    }

}
