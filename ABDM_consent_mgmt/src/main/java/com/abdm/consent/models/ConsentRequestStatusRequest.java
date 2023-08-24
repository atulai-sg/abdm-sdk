package com.abdm.consent.models;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class ConsentRequestStatusRequest {


//    @SerializedName("requestId")
    private UUID requestId = null;

//    @SerializedName("timestamp")
    private OffsetDateTime timestamp = null;

//    @SerializedName("consentRequestId")
    private String consentRequestId = null;

    public ConsentRequestStatusRequest requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * a nonce, unique for each HTTP request
     * @return requestId
     **/
//    @Schema(example = "5f7a535d-a3fd-416b-b069-c97d021fbacd", required = true, description = "a nonce, unique for each HTTP request")
    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public ConsentRequestStatusRequest timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     **/
//    @Schema(required = true, description = "")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public ConsentRequestStatusRequest consentRequestId(String consentRequestId) {
        this.consentRequestId = consentRequestId;
        return this;
    }

    /**
     * Get consentRequestId
     * @return consentRequestId
     **/
//    @Schema(required = true, description = "")
    public String getConsentRequestId() {
        return consentRequestId;
    }

    public void setConsentRequestId(String consentRequestId) {
        this.consentRequestId = consentRequestId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsentRequestStatusRequest consentRequestStatusRequest = (ConsentRequestStatusRequest) o;
        return Objects.equals(this.requestId, consentRequestStatusRequest.requestId) &&
                Objects.equals(this.timestamp, consentRequestStatusRequest.timestamp) &&
                Objects.equals(this.consentRequestId, consentRequestStatusRequest.consentRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, consentRequestId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentRequestStatusRequest {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    consentRequestId: ").append(toIndentedString(consentRequestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
