package com.abdm.data_transfer_workflow.models;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

///v0.5/health-information/cm/request
//Request for Health information against a consent id. CM would generate a transactionId against each consent and pass it as trnasaction context /
// correlation id to the HIP and also return the same to HIU via /on-request.

public class HIRequest   {
    @JsonProperty("requestId")
    private UUID requestId = null;

    @JsonProperty("timestamp")
    private String timestamp = null;

    @JsonProperty("hiRequest")
    private HIRequestHiRequest hiRequest = null;

    public HIRequest requestId(UUID requestId) {
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

    public HIRequest timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }



    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }



    /**
     * Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ
     * @return timestamp
     **/





    public HIRequest hiRequest(HIRequestHiRequest hiRequest) {
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
        HIRequest hiRequest = (HIRequest) o;
        return Objects.equals(this.requestId, hiRequest.requestId) &&
                Objects.equals(this.timestamp, hiRequest.timestamp) &&
                Objects.equals(this.hiRequest, hiRequest.hiRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, hiRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIRequest {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

