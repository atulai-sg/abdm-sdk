package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

public class HiuNotificationNotificationStatusNotificationStatusResponses {

    @lombok.Getter
    @JsonProperty("careContextReference")
    private String careContextReference = null;

    /**
     * Gets or Sets hiStatus
     */
    public enum HiStatusEnum {
        DELIVERED("DELIVERED"),

        OK("OK"),

        ERRORED("ERRORED");

        private String value;

        HiStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HiStatusEnum fromValue(String text) {
            for (HiStatusEnum b : HiStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @lombok.Getter
    @JsonProperty("hiStatus")
    private HiStatusEnum hiStatus = null;

    @lombok.Getter
    @JsonProperty("description")
    private String description = null;

    public HiuNotificationNotificationStatusNotificationStatusResponses careContextReference(String careContextReference) {
        this.careContextReference = careContextReference;
        return this;
    }

    public void setCareContextReference(String careContextReference) {
        this.careContextReference = careContextReference;
    }

    public HiuNotificationNotificationStatusNotificationStatusResponses hiStatus(HiStatusEnum hiStatus) {
        this.hiStatus = hiStatus;
        return this;
    }

    public void setHiStatus(HiStatusEnum hiStatus) {
        this.hiStatus = hiStatus;
    }

    public HiuNotificationNotificationStatusNotificationStatusResponses description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HiuNotificationNotificationStatusNotificationStatusResponses healthInformationNotificationNotificationStatusNotificationStatusResponses = (HiuNotificationNotificationStatusNotificationStatusResponses) o;
        return Objects.equals(this.careContextReference, healthInformationNotificationNotificationStatusNotificationStatusResponses.careContextReference) &&
                Objects.equals(this.hiStatus, healthInformationNotificationNotificationStatusNotificationStatusResponses.hiStatus) &&
                Objects.equals(this.description, healthInformationNotificationNotificationStatusNotificationStatusResponses.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(careContextReference, hiStatus, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthInformationNotificationNotificationStatusNotificationStatusResponses {\n");

        sb.append("    careContextReference: ").append(toIndentedString(careContextReference)).append("\n");
        sb.append("    hiStatus: ").append(toIndentedString(hiStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
