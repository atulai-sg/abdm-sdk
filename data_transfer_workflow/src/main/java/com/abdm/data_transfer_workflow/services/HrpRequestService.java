package com.abdm.data_transfer_workflow.services;




import com.abdm.data_transfer_workflow.models.HIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class HrpRequestService {

    @Autowired
    private RestTemplate template=new RestTemplate();



    //init
    public HIRequest[] createrquestservice(){
        return template.getForObject("https://dev.abdm.gov.in/gateway/v0.5/health-information/cm/request", HIRequest[].class);
    }
}