package com.abdm.consent;

import com.abdm.consent.models.Consent;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Null;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsentRequestTest {




    UUID uid=UUID.fromString("");
    UUID uid2=UUID.fromString("");
    @Test
    public void CheckConsent(){
        Consent c= Mockito.mock(Consent.class);
        Mockito.when(c.getRequestId()).thenReturn(uid);

        assertEquals(uid,c.getRequestId());
        assertEquals(uid2,c.getRequestId());


    }
    @Test
    public void CheckConsentNULL(){
        Consent c= Mockito.mock(Consent.class);
        Mockito.when(c.getRequestId()).thenReturn(null);

        assertEquals(null,c.getRequestId());
        assertEquals(null,c.getRequestId());






    }
}
