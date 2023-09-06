package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
///v0.5/health-information/hip/request
//API called by CM to request Health information from HIP against a validated consent artefact.
// The transactionId is the correlation id that HIP should use use when pushing data to the dataPushUrl.
public class HipRequest {
    @JsonProperty("requestId")
    private UUID requestId = null;

    @JsonProperty("timestamp")
    private String timestamp = null;

    @JsonProperty("transactionId")
    private String transactionId = null;

    @JsonProperty("hiRequest")
    private HIRequestHiRequest hiRequest = null;

    public HipRequest requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     * @return requestId
     **/

    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }





    /**
     * Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ
     * @return timestamp
     **/


    public HipRequest timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }



    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    public HipRequest transactionId (String transactionId) {
        this.transactionId = transactionId;
        return this;
    }



    public void settransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public HipRequest hiRequest(HIRequestHiRequest hiRequest) {
        this.hiRequest = hiRequest;
        return this;
    }

    /**
     * Get hiRequest
     * @return hiRequest
     **/

    public HIRequestHiRequest getHiRequest() {
        return hiRequest;
    }

    public void setHiRequest(HIRequestHiRequest hiRequest) {
        this.hiRequest = hiRequest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HipRequest hipRequest = (HipRequest) o;
        return Objects.equals(this.requestId, hipRequest.requestId) &&
                Objects.equals(this.timestamp, hipRequest.timestamp) &&
                Objects.equals(this.transactionId, hipRequest.transactionId) &&
                Objects.equals(this.hiRequest, hipRequest.hiRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp,transactionId, hiRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIRequest {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    hiRequest: ").append(toIndentedString(hiRequest)).append("\n");
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
