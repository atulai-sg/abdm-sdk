package com.abdm.consent.models;


import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Document(collection="consents")
public class Consent {



    private UUID requestId;
    private OffsetDateTime timestamp;
    private ConsentRequestConsent consent;

    public Consent(UUID requestId, OffsetDateTime timestamp, ConsentRequestConsent consent) {
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

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
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