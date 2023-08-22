package com.abdm.consent.models;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class HITypeEnumAdapter {
    public static class Serializer extends JsonSerializer<HITypeEnum> {
        @Override
        public void serialize(HITypeEnum value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            gen.writeString(value.toString()); // Serialize the enum as a string
        }
    }

    public static class Deserializer extends JsonDeserializer<HITypeEnum> {


        @Override
        public HITypeEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
            String enumValue = p.getValueAsString();
            return HITypeEnum.valueOf(enumValue); // Deserialize the enum from the string representation
        }
    }
}
