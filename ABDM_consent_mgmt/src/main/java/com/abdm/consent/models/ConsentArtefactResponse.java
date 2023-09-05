package com.abdm.consent.models;


import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;



@Document(collection = "consentartefactfetched")
public class ConsentArtefactResponse {
    //    @SerializedName("requestId")
    private UUID requestId = null;

    //    @SerializedName("timestamp")
    private String timestamp = null;

    //    @SerializedName("consent")
    private ConsentArtefactResponseConsent consent = null;

    //    @SerializedName("error")
    private Error error = null;

    //    @SerializedName("resp")
    private RequestReference resp = null;

    public ConsentArtefactResponse requestId(UUID requestId) {
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

    public ConsentArtefactResponse timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     **/
//    @Schema(required = true, description = "")
    public String  getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String  timestamp) {
        this.timestamp = timestamp;
    }

    public ConsentArtefactResponse consent(ConsentArtefactResponseConsent consent) {
        this.consent = consent;
        return this;
    }

    /**
     * Get consent
     * @return consent
     **/
//    @Schema(description = "")
    public ConsentArtefactResponseConsent getConsent() {
        return consent;
    }

    public void setConsent(ConsentArtefactResponseConsent consent) {
        this.consent = consent;
    }

    public ConsentArtefactResponse error(Error error) {
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

    public ConsentArtefactResponse resp(RequestReference resp) {
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
        ConsentArtefactResponse consentArtefactResponse = (ConsentArtefactResponse) o;
        return Objects.equals(this.requestId, consentArtefactResponse.requestId) &&
                Objects.equals(this.timestamp, consentArtefactResponse.timestamp) &&
                Objects.equals(this.consent, consentArtefactResponse.consent) &&
                Objects.equals(this.error, consentArtefactResponse.error) &&
                Objects.equals(this.resp, consentArtefactResponse.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, consent, error, resp);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentArtefactResponse {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
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

