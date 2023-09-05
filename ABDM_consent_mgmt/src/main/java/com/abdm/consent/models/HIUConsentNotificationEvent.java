package com.abdm.consent.models;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class HIUConsentNotificationEvent {
//    @SerializedName("requestId")
    private UUID requestId = null;

//    @SerializedName("timestamp")
    private OffsetDateTime timestamp = null;

//    @SerializedName("notification")
    private HIUConsentNotificationEventNotification notification = null;

    public HIUConsentNotificationEvent requestId(UUID requestId) {
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

    public HIUConsentNotificationEvent timestamp(OffsetDateTime timestamp) {
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

    public HIUConsentNotificationEvent notification(HIUConsentNotificationEventNotification notification) {
        this.notification = notification;
        return this;
    }

    /**
     * Get notification
     * @return notification
     **/
//    @Schema(required = true, description = "")
    public HIUConsentNotificationEventNotification getNotification() {
        return notification;
    }

    public void setNotification(HIUConsentNotificationEventNotification notification) {
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
        HIUConsentNotificationEvent hiUConsentNotificationEvent = (HIUConsentNotificationEvent) o;
        return Objects.equals(this.requestId, hiUConsentNotificationEvent.requestId) &&
                Objects.equals(this.timestamp, hiUConsentNotificationEvent.timestamp) &&
                Objects.equals(this.notification, hiUConsentNotificationEvent.notification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, timestamp, notification);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIUConsentNotificationEvent {\n");

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
