package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
//https://dev.abdm.gov.in/gateway/v0.5/health-information/notify
//v0.5/health-information/notify
//Notifications corresponding to events during data flow
//API called by HIU and HIP during data-transfer.
public class HiuNotification {
    @lombok.Getter
    @JsonProperty("requestId")
    private UUID requestId = null;

    @lombok.Getter
    @JsonProperty("timestamp")
    private String timestamp = null;

    @lombok.Getter
    @JsonProperty("notification")
    private HiuNotificationNotification notification = null;

    public HiuNotification requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public HiuNotification timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public HiuNotification notification(HiuNotificationNotification notification) {
        this.notification = notification;
        return this;
    }

    public void setNotification(HiuNotificationNotification notification) {
        this.notification = notification;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HiuNotification healthInformationNotification = (HiuNotification) o;
        return Objects.equals(this.requestId, healthInformationNotification.requestId) &&
                Objects.equals(this.timestamp, healthInformationNotification.timestamp) &&
                Objects.equals(this.notification, healthInformationNotification.notification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, notification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthInformationNotification {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
