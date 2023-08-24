package com.abdm.consent.models;


import java.util.Objects;

public class PermissionFrequency {
    /**
     * Gets or Sets unit
     */
//    @JsonAdapter(UnitEnum.Adapter.class)
    public enum UnitEnum {
//        @SerializedName("HOUR")
        HOUR("HOUR"),
//        @SerializedName("WEEK")
        WEEK("WEEK"),
//        @SerializedName("DAY")
        DAY("DAY"),
//        @SerializedName("MONTH")
        MONTH("MONTH"),
//        @SerializedName("YEAR")
        YEAR("YEAR");

        private String value;

        UnitEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static UnitEnum fromValue(String input) {
            for (UnitEnum b : UnitEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
//        public static class Adapter extends TypeAdapter<UnitEnum> {
//            @Override
//            public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
//                jsonWriter.value(String.valueOf(enumeration.getValue()));
//            }
//
//            @Override
//            public UnitEnum read(final JsonReader jsonReader) throws IOException {
//                Object value = jsonReader.nextString();
//                return UnitEnum.fromValue((String)(value));
//            }
//        }
    }
//    @SerializedName("unit")
    private UnitEnum unit = null;

//    @SerializedName("value")
    private Integer value = null;

//    @SerializedName("repeats")
    private Integer repeats = null;

    public PermissionFrequency unit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     * @return unit
     **/
//    @Schema(description = "")
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    public PermissionFrequency value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     **/
//    @Schema(description = "")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public PermissionFrequency repeats(Integer repeats) {
        this.repeats = repeats;
        return this;
    }

    /**
     * Get repeats
     * @return repeats
     **/
//    @Schema(description = "")
    public Integer getRepeats() {
        return repeats;
    }

    public void setRepeats(Integer repeats) {
        this.repeats = repeats;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionFrequency permissionFrequency = (PermissionFrequency) o;
        return Objects.equals(this.unit, permissionFrequency.unit) &&
                Objects.equals(this.value, permissionFrequency.value) &&
                Objects.equals(this.repeats, permissionFrequency.repeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value, repeats);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionFrequency {\n");

        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    repeats: ").append(toIndentedString(repeats)).append("\n");
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

