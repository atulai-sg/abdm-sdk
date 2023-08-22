package com.abdm.consent.models;

import java.io.IOException;
import java.util.Objects;


public class Error {
    @JsonAdapter(CodeEnum.Adapter.class)
    public enum CodeEnum {
//        @SerializedName("1000")
        NUMBER_1000(1000),
//        @SerializedName("10001")
        NUMBER_10001(10001);

        private Integer value;

        CodeEnum(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static CodeEnum fromValue(Integer input) {
            for (CodeEnum b : CodeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
        public static class Adapter extends TypeAdapter<CodeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public CodeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextInt();
                return CodeEnum.fromValue((Integer)(value));
            }
        }
//    }  @SerializedName("code")
    private CodeEnum code = null;

//    @SerializedName("message")
    private String message = null;

    public Error code(CodeEnum code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     **/
//    @Schema(required = true, description = "")
    public CodeEnum getCode() {
        return code;
    }

    public void setCode(CodeEnum code) {
        this.code = code;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     **/
//    @Schema(required = true, description = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code) &&
                Objects.equals(this.message, error.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
