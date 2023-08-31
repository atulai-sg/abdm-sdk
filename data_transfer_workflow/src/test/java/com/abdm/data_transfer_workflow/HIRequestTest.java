package com.abdm.data_transfer_workflow;



import com.abdm.data_transfer_workflow.controller.HrpRequestController;
import com.abdm.data_transfer_workflow.models.HIRequest;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;





@WebMvcTest(HrpRequestController.class)
public class HIRequestTest {


    @Autowired
    private MockMvc mockMvc;


    @InjectMocks
    private HrpRequestController HrpRequestController;


    @Test
    public void testHandleHiRequest() throws Exception {
        // Perform a POST request to the endpoint with the JSON payload
        mockMvc.perform((RequestBuilder) post("health-information/request")
                        .contentType(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.valueOf("{\"requestId\":\"test-guid\",\"timestamp\":\"2023-08-25T12:00:00Z\",\"hiRequest\":{\"consent\":{\"id\":\"1810102b-0bd2-4901-a718-46705721fcf1\"},\"dateRange\":{\"from\":\"2020-11-25T12:30:29.592\",\"to\":\"2025-05-09T11:10:10.592\"},\"dataPushUrl\":\"https://webhook.site/ae79e55d-8107-4598-873c-1f6c4ba05915\",\"keyMaterial\":{\"cryptoAlg\":\"ECDH\",\"curve\":\"Curve25519\",\"dhPublicKey\":{\"expiry\":\"2029-12-20T12:30:29.592\",\"parameters\":\"BHQcPbls+7XzTwE2Wl5IBvXhtncqRqWfK1JcVTr3t+rISUupj2S+et29NRHxm1ExE0NaaS4UdRJwcYrMWPzAbcI=\",\"keyValue\":\"MIIBMTCB6gYHKoZIzj0CATCB3gIBATArBgcqhkjOPQEBAiB/////////////////////////////////////////7TBEBCAqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqYSRShRAQge0Je0Je0Je0Je0Je0Je0Je0Je0Je0Je0JgtenHcQyGQEQQQqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq0kWiCuGaG4oIa04B7dLHdI0UySPU1+bXxhsinpxaJ+ztPZAiAQAAAAAAAAAAAAAAAAAAAAFN753qL3nNZYEmMaXPXT7QIBCANCAAQqCCIzBXvtTZBvovCenuoWTsfk+FHn83GeeKWOsn9JcG3C/SHIk43re1lFo+LF0xP+9bqa/CP/jn4KNVp0cwCb\"},\"nonce\":\"MEhO+VuIXZs+2LdbcqHabGYMZe7x3H3isZQOtE4ala0=\"}}}}")))
                .andExpect(status().isOk());


        verify(HrpRequestController).createHirequest(any(HIRequest.class));
    }
}



