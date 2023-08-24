package com.abdm.consent.models;

import java.io.IOException;
import java.util.Objects;

public class ConsentAcknowledgement {

//    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
//        @SerializedName("OK")
        OK("OK"),
//        @SerializedName("UNKNOWN")
        UNKNOWN("UNKNOWN");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static StatusEnum fromValue(String input) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
//        public static class Adapter extends TypeAdapter<StatusEnum> {
//            @Override
//            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
//                jsonWriter.value(String.valueOf(enumeration.getValue()));
//            }
//
//            @Override
//            public StatusEnum read(final JsonReader jsonReader) throws IOException {
//                Object value = jsonReader.nextString();
//                return StatusEnum.fromValue((String)(value));
//            }
//        }
    }
//    @SerializedName("status")
    private StatusEnum status = null;

//    @SerializedName("consentId")
    private String consentId = null;

    public ConsentAcknowledgement status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
//    @Schema(required = true, description = "")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ConsentAcknowledgement consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Get consentId
     * @return consentId
     **/
//    @Schema(example = "<consent-artefact-id>", required = true, description = "")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsentAcknowledgement consentAcknowledgement = (ConsentAcknowledgement) o;
        return Objects.equals(this.status, consentAcknowledgement.status) &&
                Objects.equals(this.consentId, consentAcknowledgement.consentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, consentId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentAcknowledgement {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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
