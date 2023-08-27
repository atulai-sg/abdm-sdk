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
import swagger.model.HIUSubscriptionNotificationAcknowledgmentAcknowledgement;
import swagger.model.HIUSubscriptionRequestNotificationAcknowledgement;
import swagger.model.HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement;
import swagger.model.SubscriptionRequest;

import java.util.Arrays;

@RestController
public class SubscriptionManagementGatewayController {
    private String accessToken;

    RestTemplate restTemplate1;
    @RequestMapping(value = "/subscription-requests/cm/init", method = RequestMethod.POST)
    public String createSubscriptionRequest(@RequestBody SubscriptionRequest sample){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        HttpEntity<SubscriptionRequest> entity = new HttpEntity<SubscriptionRequest>(sample,headers);
        return restTemplate1.exchange("https://dev.abdm.gov.in/cm/v0.5/subscription-requests/cm/init", HttpMethod.POST, entity, String.class).getBody();

    }

    @Autowired
    RestTemplate restTemplate2;
    @RequestMapping(value = "/subscription-requests/hiu/on-notify", method = RequestMethod.POST)
    public String createSubscriptionRequestNotif(@RequestBody HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement sample){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        HttpEntity<HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement> entity = new HttpEntity<HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement>(sample,headers);
        return restTemplate2.exchange("https://dev.abdm.gov.in/cm/v0.5/subscription-requests/hiu/on-notify", HttpMethod.POST, entity, String.class).getBody();

    }

    @Autowired
    RestTemplate restTemplate3;
    @RequestMapping(value = "/subscriptions/hiu/on-notify", method = RequestMethod.POST)
    public String createSubscriptionNotif(@RequestBody HIUSubscriptionNotificationAcknowledgmentAcknowledgement sample){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        HttpEntity<HIUSubscriptionNotificationAcknowledgmentAcknowledgement> entity = new HttpEntity<HIUSubscriptionNotificationAcknowledgmentAcknowledgement>(sample,headers);
        return restTemplate3.exchange("https://dev.abdm.gov.in/cm/v0.5/subscriptions/hiu/on-notify", HttpMethod.POST, entity, String.class).getBody();

    }




}
