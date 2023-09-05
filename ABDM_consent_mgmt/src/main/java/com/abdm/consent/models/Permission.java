package com.abdm.consent.models;


import java.time.OffsetDateTime;
import java.util.Objects;

public class Permission {
    /**
     * Gets or Sets accessMode
     */
//    @JsonAdapter(AccessModeEnum.Adapter.class)
    public enum AccessModeEnum {
//        @SerializedName("VIEW")
        VIEW("VIEW"),
//        @SerializedName("STORE")
        STORE("STORE"),
//        @SerializedName("QUERY")
        QUERY("QUERY"),
//        @SerializedName("STREAM")
        STREAM("STREAM");

        private String value;

        AccessModeEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static AccessModeEnum fromValue(String input) {
            for (AccessModeEnum b : AccessModeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
//        public static class Adapter extends TypeAdapter<AccessModeEnum> {
//            @Override
//            public void write(final JsonWriter jsonWriter, final AccessModeEnum enumeration) throws IOException {
//                jsonWriter.value(String.valueOf(enumeration.getValue()));
//            }
//
//            @Override
//            public AccessModeEnum read(final JsonReader jsonReader) throws IOException {
//                Object value = jsonReader.nextString();
//                return AccessModeEnum.fromValue((String)(value));
//            }
//        }
    }
//    @SerializedName("accessMode")
    private AccessModeEnum accessMode = null;

//    @SerializedName("dateRange")
    private PermissionDateRange dateRange = null;

//    @SerializedName("dataEraseAt")
    private String dataEraseAt = null;

//    @SerializedName("frequency")
    private PermissionFrequency frequency = null;

    public Permission accessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * Get accessMode
     * @return accessMode
     **/
//    @Schema(required = true, description = "")
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    public Permission dateRange(PermissionDateRange dateRange) {
        this.dateRange = dateRange;
        return this;
    }

    /**
     * Get dateRange
     * @return dateRange
     **/
//    @Schema(required = true, description = "")
    public PermissionDateRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(PermissionDateRange dateRange) {
        this.dateRange = dateRange;
    }

    public Permission dataEraseAt(String dataEraseAt) {
        this.dataEraseAt = dataEraseAt;
        return this;
    }

    /**
     * Get dataEraseAt
     * @return dataEraseAt
     **/
//    @Schema(required = true, description = "")
    public String getDataEraseAt() {
        return dataEraseAt;
    }

    public void setDataEraseAt(String dataEraseAt) {
        this.dataEraseAt = dataEraseAt;
    }

    public Permission frequency(PermissionFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     * @return frequency
     **/
//    @Schema(required = true, description = "")
    public PermissionFrequency getFrequency() {
        return frequency;
    }

    public void setFrequency(PermissionFrequency frequency) {
        this.frequency = frequency;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Permission permission = (Permission) o;
        return Objects.equals(this.accessMode, permission.accessMode) &&
                Objects.equals(this.dateRange, permission.dateRange) &&
                Objects.equals(this.dataEraseAt, permission.dataEraseAt) &&
                Objects.equals(this.frequency, permission.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMode, dateRange, dataEraseAt, frequency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Permission {\n");

        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
        sb.append("    dataEraseAt: ").append(toIndentedString(dataEraseAt)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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



