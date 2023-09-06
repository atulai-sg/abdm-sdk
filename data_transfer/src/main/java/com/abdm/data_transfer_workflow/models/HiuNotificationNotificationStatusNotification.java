package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HiuNotificationNotificationStatusNotification {
    /**
     * Gets or Sets sessionStatus
     */
    public enum SessionStatusEnum {
        TRANSFERRED("TRANSFERRED"),

        FAILED("FAILED");

        private String value;

        SessionStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SessionStatusEnum fromValue(String text) {
            for (SessionStatusEnum b : SessionStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @lombok.Getter
    @JsonProperty("sessionStatus")
    private SessionStatusEnum sessionStatus = null;

    @lombok.Getter
    @JsonProperty("hipId")
    private String hipId = null;

    @lombok.Getter
    @JsonProperty("statusResponses")
    @Valid
    private List<HiuNotificationNotificationStatusNotificationStatusResponses> statusResponses = null;

    public HiuNotificationNotificationStatusNotification sessionStatus(SessionStatusEnum sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    public void setSessionStatus(SessionStatusEnum sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public HiuNotificationNotificationStatusNotification hipId(String hipId) {
        this.hipId = hipId;
        return this;
    }

    public void setHipId(String hipId) {
        this.hipId = hipId;
    }

    public HiuNotificationNotificationStatusNotification statusResponses(List<HiuNotificationNotificationStatusNotificationStatusResponses> statusResponses) {
        this.statusResponses = statusResponses;
        return this;
    }

    public HiuNotificationNotificationStatusNotification addStatusResponsesItem(HiuNotificationNotificationStatusNotificationStatusResponses statusResponsesItem) {
        if (this.statusResponses == null) {
            this.statusResponses = new ArrayList<HiuNotificationNotificationStatusNotificationStatusResponses>();
        }
        this.statusResponses.add(statusResponsesItem);
        return this;
    }

    public void setStatusResponses(List<HiuNotificationNotificationStatusNotificationStatusResponses> statusResponses) {
        this.statusResponses = statusResponses;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HiuNotificationNotificationStatusNotification healthInformationNotificationNotificationStatusNotification = (HiuNotificationNotificationStatusNotification) o;
        return Objects.equals(this.sessionStatus, healthInformationNotificationNotificationStatusNotification.sessionStatus) &&
                Objects.equals(this.hipId, healthInformationNotificationNotificationStatusNotification.hipId) &&
                Objects.equals(this.statusResponses, healthInformationNotificationNotificationStatusNotification.statusResponses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionStatus, hipId, statusResponses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthInformationNotificationNotificationStatusNotification {\n");

        sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
        sb.append("    hipId: ").append(toIndentedString(hipId)).append("\n");
        sb.append("    statusResponses: ").append(toIndentedString(statusResponses)).append("\n");
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
