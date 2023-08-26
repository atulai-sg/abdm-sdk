package com.abdm.data_transfer_workflow.controller;




import com.abdm.data_transfer_workflow.models.HIRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController

@RequestMapping("/v0.5")
public class HrpRequestController {
    private final RestTemplate restTemplate;


    /*@Autowired
   // public HrpRequestController (RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }
*/
    private String accessToken = "";

    @Autowired

    public HrpRequestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/health-information/request", method = RequestMethod.POST)
    public String createHirequest(@RequestBody HIRequest samplerequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        HttpEntity<HIRequest> entity = new HttpEntity<HIRequest>(samplerequest, headers);
        //return "Product Deleted Successfully against id ";
        return restTemplate.exchange(
                "https://dev.abdm.gov.in/gateway/v0.5/health-information/cm/request", HttpMethod.POST, entity, String.class).getBody();
    }

    @Controller
    public class IndexController implements ErrorController, com.abdm.data_transfer_workflow.controller.IndexController {
        public static final String PATH = "/health-information/request" ;


         @Override
        @RequestMapping(PATH)
        @ResponseBody
         public String getErrorPath() {
            // TODO Auto-generated method stub
            return "";
        }
    }
}