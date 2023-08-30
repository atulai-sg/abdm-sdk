package com.abdm.consent.models;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class ConsentFetchRequest {
//    @SerializedName("requestId")
    private UUID requestId = null;

//    @SerializedName("timestamp")
    private String timestamp = null;

//    @SerializedName("consentId")
    private String consentId = null;

    public ConsentFetchRequest requestId(UUID requestId) {
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

    public ConsentFetchRequest timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     **/
//    @Schema(required = true, description = "")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ConsentFetchRequest consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Get consentId
     * @return consentId
     **/
//    @Schema(required = true, description = "")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsentFetchRequest consentFetchRequest = (ConsentFetchRequest) o;
        return Objects.equals(this.requestId, consentFetchRequest.requestId) &&
                Objects.equals(this.timestamp, consentFetchRequest.timestamp) &&
                Objects.equals(this.consentId, consentFetchRequest.consentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, consentId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentFetchRequest {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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
