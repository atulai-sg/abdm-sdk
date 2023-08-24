package com.abdm.consent.models;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class ConsentRequestInitResponse {
//    @SerializedName("requestId")
    private UUID requestId = null;

//    @SerializedName("timestamp")
    private OffsetDateTime timestamp = null;

//    @SerializedName("consentRequest")
    private ConsentRequestInitResponseConsentRequest consentRequest = null;

//    @SerializedName("error")
    private Error error = null;

//    @SerializedName("resp")
    private RequestReference resp = null;

    public ConsentRequestInitResponse requestId(UUID requestId) {
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

    public ConsentRequestInitResponse timestamp(OffsetDateTime timestamp) {
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

    public ConsentRequestInitResponse consentRequest(ConsentRequestInitResponseConsentRequest consentRequest) {
        this.consentRequest = consentRequest;
        return this;
    }

    /**
     * Get consentRequest
     * @return consentRequest
     **/
//    @Schema(description = "")
    public ConsentRequestInitResponseConsentRequest getConsentRequest() {
        return consentRequest;
    }

    public void setConsentRequest(ConsentRequestInitResponseConsentRequest consentRequest) {
        this.consentRequest = consentRequest;
    }

    public ConsentRequestInitResponse error(Error error) {
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

    public ConsentRequestInitResponse resp(RequestReference resp) {
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
        ConsentRequestInitResponse consentRequestInitResponse = (ConsentRequestInitResponse) o;
        return Objects.equals(this.requestId, consentRequestInitResponse.requestId) &&
                Objects.equals(this.timestamp, consentRequestInitResponse.timestamp) &&
                Objects.equals(this.consentRequest, consentRequestInitResponse.consentRequest) &&
                Objects.equals(this.error, consentRequestInitResponse.error) &&
                Objects.equals(this.resp, consentRequestInitResponse.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, consentRequest, error, resp);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentRequestInitResponse {\n");

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
