package com.abdm.consent.models;

import java.io.IOException;

public enum ConsentStatus {
    //    @SerializedName("GRANTED")
    GRANTED("GRANTED"),
    //    @SerializedName("EXPIRED")
    EXPIRED("EXPIRED"),
    //    @SerializedName("DENIED")
    DENIED("DENIED"),
    //    @SerializedName("REQUESTED")
    REQUESTED("REQUESTED"),
    //    @SerializedName("REVOKED")
    REVOKED("REVOKED");

    private String value;

    ConsentStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConsentStatus fromValue(String input) {
        for (ConsentStatus b : ConsentStatus.values()) {
            if (b.value.equals(input)) {
                return b;
            }
        }
        return null;
    }

//    public static class Adapter extends TypeAdapter<ConsentStatus> {
//        @Override
//        public void write(final JsonWriter jsonWriter, final ConsentStatus enumeration) throws IOException {
//            jsonWriter.value(String.valueOf(enumeration.getValue()));
//        }
//
//        @Override
//        public ConsentStatus read(final JsonReader jsonReader) throws IOException {
//            Object value = jsonReader.nextString();
//            return ConsentStatus.fromValue((String)(value));
//        }
//    }
}
