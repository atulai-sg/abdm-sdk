//package com.abdm.consent.models;
//
//
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import java.time.OffsetDateTime;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeFormatterBuilder;
//
//@Configuration
//public class JacksonConfiguration {
//    @Bean
//    public ObjectMapper objectMapper() {
//        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("YYYY-MM-DDHH:mm:ss.SSSZ").toFormatter();
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false);
//        JavaTimeModule module = new JavaTimeModule();
//        module.addSerializer(OffsetDateTime.class, new CustomSerializer(formatter));
//        module.addDeserializer(OffsetDateTime.class, new CustomDeserializer(formatter));
//        mapper.registerModule(module);
//        return mapper;
//    }
//}
