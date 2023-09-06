package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
//https://dev.abdm.gov.in/gateway/v0.5/health-information/hip/on-request
public class HipOnRequest {
    @lombok.Getter
    @JsonProperty("requestId")
private UUID requestId = null;

    @lombok.Getter
    @JsonProperty("timestamp")
    private String timestamp = null;

    @lombok.Getter
    @JsonProperty("hiRequest")
    private HipOnReequestHiRequest hiRequest = null;



    @lombok.Getter
    @JsonProperty("resp")
    private RequestReference resp = null;

    public HipOnRequest requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public HipOnRequest timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public HipOnRequest hiRequest(HipOnReequestHiRequest hiRequest) {
        this.hiRequest = hiRequest;
        return this;
    }

    public void setHiRequest(HipOnReequestHiRequest hiRequest) {
        this.hiRequest = hiRequest;
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
        HipOnRequest hiPHealthInformationRequestAcknowledgement = (HipOnRequest) o;
        return Objects.equals(this.requestId, hiPHealthInformationRequestAcknowledgement.requestId) &&
                Objects.equals(this.timestamp, hiPHealthInformationRequestAcknowledgement.timestamp) &&
                Objects.equals(this.hiRequest, hiPHealthInformationRequestAcknowledgement.hiRequest) &&

                Objects.equals(this.resp, hiPHealthInformationRequestAcknowledgement.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, hiRequest,  resp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIPHealthInformationRequestAcknowledgement {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    hiRequest: ").append(toIndentedString(hiRequest)).append("\n");

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
