//package com.abdm.consent.models;
//
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import java.io.IOException;
//import java.time.OffsetDateTime;
//import java.time.format.DateTimeFormatter;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//import java.time.format.DateTimeFormatterBuilder;
//public class CustomDeserializer extends JsonDeserializer<OffsetDateTime> {
////    DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm:ss").toFormatter();
//
//    private DateTimeFormatter formatter;
//
//    public CustomDeserializer(DateTimeFormatter formatter) {
//        this.formatter = formatter;
//    }
//
//    @Override
//    public OffsetDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
//        return OffsetDateTime.parse(parser.getText(), this.formatter);
//    }
//}
