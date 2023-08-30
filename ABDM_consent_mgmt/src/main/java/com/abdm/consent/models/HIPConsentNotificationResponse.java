package com.abdm.consent.models;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class HIPConsentNotificationResponse {

//    @SerializedName("requestId")
    private UUID requestId = null;

//    @SerializedName("timestamp")
    private String timestamp = null;

//    @SerializedName("acknowledgement")
    private ConsentAcknowledgement acknowledgement = null;

//    @SerializedName("error")
    private Error error = null;

//    @SerializedName("resp")
    private RequestReference resp = null;

    public HIPConsentNotificationResponse requestId(UUID requestId) {
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

    public HIPConsentNotificationResponse timestamp(String timestamp) {
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

    public HIPConsentNotificationResponse acknowledgement(ConsentAcknowledgement acknowledgement) {
        this.acknowledgement = acknowledgement;
        return this;
    }

    /**
     * Get acknowledgement
     * @return acknowledgement
     **/
//    @Schema(description = "")
    public ConsentAcknowledgement getAcknowledgement() {
        return acknowledgement;
    }

    public void setAcknowledgement(ConsentAcknowledgement acknowledgement) {
        this.acknowledgement = acknowledgement;
    }

    public HIPConsentNotificationResponse error(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     * @return error
     **/
//    @Schema(description = "")
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public HIPConsentNotificationResponse resp(RequestReference resp) {
        this.resp = resp;
        return this;
    }

    /**
     * Get resp
     * @return resp
     **/
//    @Schema(required = true, description = "")
    public RequestReference getResp() {
        return resp;
    }

    public void setResp(RequestReference resp) {
        this.resp = resp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HIPConsentNotificationResponse hiPConsentNotificationResponse = (HIPConsentNotificationResponse) o;
        return Objects.equals(this.requestId, hiPConsentNotificationResponse.requestId) &&
                Objects.equals(this.timestamp, hiPConsentNotificationResponse.timestamp) &&
                Objects.equals(this.acknowledgement, hiPConsentNotificationResponse.acknowledgement) &&
                Objects.equals(this.error, hiPConsentNotificationResponse.error) &&
                Objects.equals(this.resp, hiPConsentNotificationResponse.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, acknowledgement, error, resp);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIPConsentNotificationResponse {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    acknowledgement: ").append(toIndentedString(acknowledgement)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    resp: ").append(toIndentedString(resp)).append("\n");
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
