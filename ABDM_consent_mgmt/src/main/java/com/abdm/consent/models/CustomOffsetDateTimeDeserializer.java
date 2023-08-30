//package com.abdm.consent.models;
//
//
//import java.io.IOException;
//import java.time.OffsetDateTime;
//import java.time.format.DateTimeFormatter;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//
//public class CustomOffsetDateTimeDeserializer extends JsonDeserializer<OffsetDateTime> {
//    @Override
//    public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
//        String dateString = jsonParser.getText();
//        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
//        return OffsetDateTime.parse(dateString, formatter);
//    }
//}
