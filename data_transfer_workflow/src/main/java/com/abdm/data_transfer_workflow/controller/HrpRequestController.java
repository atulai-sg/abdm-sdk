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

@RequestMapping("/v1.0")
public class HrpRequestController {
    private final RestTemplate restTemplate;


    /*@Autowired
   // public HrpRequestController (RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }
*/
    private String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJBbFJiNVdDbThUbTlFSl9JZk85ejA2ajlvQ3Y1MXBLS0ZrbkdiX1RCdkswIn0.eyJleHAiOjE2OTM0OTAzOTcsImlhdCI6MTY5MzQ2ODc5NywianRpIjoiY2Q3ZjhjYmItYWMyMi00MDUzLTgwZDctZTk2ZjZkNjdkNDUxIiwiaXNzIjoiaHR0cHM6Ly9kZXYubmRobS5nb3YuaW4vYXV0aC9yZWFsbXMvY2VudHJhbC1yZWdpc3RyeSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI2M2E0NWM1Mi02ZTFlLTQ4OWUtYmFiYS0yMTFjYzBhMjFiYjUiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJTQlhfMDAzNjIwIiwic2Vzc2lvbl9zdGF0ZSI6ImFmNDRmOTAwLTg3YWUtNGViMS05MDgwLTMxYjQwODdiYzRlZiIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo5MDA3Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJoaXUiLCJvZmZsaW5lX2FjY2VzcyIsImhlYWx0aElkIiwicGhyIiwiT0lEQyIsImhpcCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IlNCWF8wMDM2MjAiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIGVtYWlsIHByb2ZpbGUiLCJjbGllbnRJZCI6IlNCWF8wMDM2MjAiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudEhvc3QiOiIxMC4yMzMuNjcuMjMwIiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LXNieF8wMDM2MjAiLCJjbGllbnRBZGRyZXNzIjoiMTAuMjMzLjY3LjIzMCJ9.OpQ1NiClU2Nox9MLJEdVF-d02mc5W81RyKL0FuEzogaIQcgVIznVaotR2Q9L_tVrGKaK-tZWudW_FeLMK7nJUfB-hGVJrerPKK1G-sCX90aX8pAXfK7d4Tc1addqz78pC_rzOsWATnS_M3QNgAnrQ7kUe-fX67TshUASAOrxjGbkW3KKK8j5KJBAQ-zBLv7LQREQ-ne3xQ6X0RBzSxEZSpzcm3b6CtJ1wh46k40oWim83VAWm4AnmQvG8xbAXZZB7wOah8IlN6FU52CIJwjS-qgJ_PstoL4iG36GM5LvQfhH-5U1-IIxGn7NUEmUQ29hQrB1YiII6YhXeZyy1TnbUw";
    @Autowired

    public HrpRequestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

 //hrp request to request the health data
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/health-information/request", method = RequestMethod.POST)
    public String createHirequest(@RequestBody HIRequest samplerequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(accessToken);
        headers.set("X-CM-ID","sbx");
        HttpEntity<HIRequest> entity = new HttpEntity<HIRequest>(samplerequest, headers);
        //return "Product Deleted Successfully against id ";
        return restTemplate.exchange(
                "https://dev.abdm.gov.in/gateway/v0.5/health-information/cm/request", HttpMethod.POST, entity, String.class).getBody();
    }
  

/*
    @Controller
    public class IndexController implements ErrorController, com.abdm.data_transfer_workflow.controller.IndexController {
        public static final String PATH = "/health-information/request" ;


         @Override
        @RequestMapping(PATH)
        @ResponseBody
         public String getErrorPath() {
            // TODO Auto-generated method stub
            return "no";
        }


    }

 */



}