package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
///v0.5/health-information/cm/on-request
//Callback API for acknowledgement of Health information request of HIU.
// CM calls this API when it has validated the Health Information request given the consent id.
public class  HrpRequestAcknowledgement {

    @lombok.Getter
    @JsonProperty("requestId")
    private UUID requestId = null;

    @lombok.Getter
    @JsonProperty("timestamp")
    private String timestamp = null;

    @lombok.Getter
    @JsonProperty("hiRequest")
    private HrpRequestAcknowledgementHiRequest hiRequest = null;

    @lombok.Getter
    @JsonProperty("error")
    private Error error = null;

    @lombok.Getter
    @JsonProperty("resp")
    private RequestReference resp = null;

    public HrpRequestAcknowledgement requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public HrpRequestAcknowledgement timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public void setTimestamp(String  timestamp) {
        this.timestamp = timestamp;
    }

    public HrpRequestAcknowledgement hiRequest(HrpRequestAcknowledgementHiRequest hiRequest) {
        this.hiRequest = hiRequest;
        return this;
    }

    public void setHiRequest(HrpRequestAcknowledgementHiRequest hiRequest) {
        this.hiRequest = hiRequest;
    }

    public HrpRequestAcknowledgement error(Error error) {
        this.error = error;
        return this;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public HrpRequestAcknowledgement resp(RequestReference resp) {
        this.resp = resp;
        return this;
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
        HrpRequestAcknowledgement hiPHealthInformationRequestAcknowledgement = (HrpRequestAcknowledgement) o;
        return Objects.equals(this.requestId, hiPHealthInformationRequestAcknowledgement.requestId) &&
                Objects.equals(this.timestamp, hiPHealthInformationRequestAcknowledgement.timestamp) &&
                Objects.equals(this.hiRequest, hiPHealthInformationRequestAcknowledgement.hiRequest) &&
                Objects.equals(this.error, hiPHealthInformationRequestAcknowledgement.error) &&
                Objects.equals(this.resp, hiPHealthInformationRequestAcknowledgement.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, hiRequest, error, resp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIPHealthInformationRequestAcknowledgement {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    hiRequest: ").append(toIndentedString(hiRequest)).append("\n");
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
