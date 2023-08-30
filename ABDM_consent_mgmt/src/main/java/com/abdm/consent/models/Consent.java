package com.abdm.consent.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.data.mongodb.core.mapping.Document;

//import java.time.OffsetDateTime;
//import org.threeten.bp.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Document(collection="consents")
public class Consent {



    private UUID requestId;


//    @JsonProperty("timestamp")
    private String  timestamp;

    private ConsentRequestConsent consent;
    public  Consent(){

    }

    public Consent(UUID requestId, String timestamp, ConsentRequestConsent consent) {
        this.requestId = requestId;
        this.timestamp = timestamp;
        this.consent = consent;
    }

    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ConsentRequestConsent getConsent() {
        return consent;
    }

    public void setConsent(ConsentRequestConsent consent) {
        this.consent = consent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consent consent1 = (Consent) o;
        return Objects.equals(requestId, consent1.requestId) && Objects.equals(timestamp, consent1.timestamp) && Objects.equals(consent, consent1.consent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, consent);
    }

    @Override
    public String toString() {
        return "Consent{" +
                "requestId=" + requestId +
                ", timestamp=" + timestamp +
                ", consent=" + consent +
                '}';
    }
}