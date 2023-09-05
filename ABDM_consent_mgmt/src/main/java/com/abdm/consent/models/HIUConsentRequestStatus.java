package com.abdm.consent.models;


import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class HIUConsentRequestStatus {
    //    @SerializedName("requestId")
    private UUID requestId = null;

    //    @SerializedName("timestamp")
    private OffsetDateTime timestamp = null;

    //    @SerializedName("consentRequest")
    private HIUConsentRequestStatusConsentRequest consentRequest = null;

    //    @SerializedName("error")
    private Error error = null;

    //    @SerializedName("resp")
    private RequestReference resp = null;

    public HIUConsentRequestStatus requestId(UUID requestId) {
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

    public HIUConsentRequestStatus timestamp(OffsetDateTime timestamp) {
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

    public HIUConsentRequestStatus consentRequest(HIUConsentRequestStatusConsentRequest consentRequest) {
        this.consentRequest = consentRequest;
        return this;
    }

    /**
     * Get consentRequest
     * @return consentRequest
     **/
//    @Schema(description = "")
    public HIUConsentRequestStatusConsentRequest getConsentRequest() {
        return consentRequest;
    }

    public void setConsentRequest(HIUConsentRequestStatusConsentRequest consentRequest) {
        this.consentRequest = consentRequest;
    }

    public HIUConsentRequestStatus error(Error error) {
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

    public HIUConsentRequestStatus resp(RequestReference resp) {
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
        HIUConsentRequestStatus hiUConsentRequestStatus = (HIUConsentRequestStatus) o;
        return Objects.equals(this.requestId, hiUConsentRequestStatus.requestId) &&
                Objects.equals(this.timestamp, hiUConsentRequestStatus.timestamp) &&
                Objects.equals(this.consentRequest, hiUConsentRequestStatus.consentRequest) &&
                Objects.equals(this.error, hiUConsentRequestStatus.error) &&
                Objects.equals(this.resp, hiUConsentRequestStatus.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, consentRequest, error, resp);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIUConsentRequestStatus {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    consentRequest: ").append(toIndentedString(consentRequest)).append("\n");
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


