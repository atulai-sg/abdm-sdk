package com.abdm.consent.models;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="consents")
public class consent {



    private String requestId;
    private String timestamp;
    private String consent;

    public consent(String requestId, String timestamp, String consent) {
        this.requestId = requestId;
        this.timestamp = timestamp;
        this.consent = consent;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getConsent() {
        return consent;
    }

    public void setConsent(String consent) {
        this.consent = consent;
    }

    @Override
    public String toString() {
        return "consent{" +
                "requestId='" + requestId + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", consent='" + consent + '\'' +
                '}';
    }
}
