package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

public class HiuNotificationNotificationNotifier {
    public enum TypeEnum {
        HIU("HIU"),

        HIP("HIP");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @lombok.Getter
    @JsonProperty("type")
    private TypeEnum type = null;

    @lombok.Getter
    @JsonProperty("id")
    private String id = null;

    public HiuNotificationNotificationNotifier type(TypeEnum type) {
        this.type = type;
        return this;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public HiuNotificationNotificationNotifier id(String id) {
        this.id = id;
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HiuNotificationNotificationNotifier healthInformationNotificationNotificationNotifier = (HiuNotificationNotificationNotifier) o;
        return Objects.equals(this.type, healthInformationNotificationNotificationNotifier.type) &&
                Objects.equals(this.id, healthInformationNotificationNotificationNotifier.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthInformationNotificationNotificationNotifier {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
