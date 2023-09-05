package com.abdm.consent.models;

import com.fasterxml.jackson.core.JacksonException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;



public class CustomEnumDeserializer extends StdDeserializer<CodeEnum> {
    protected CustomEnumDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public CodeEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException , JsonProcessingException {

        JsonParser jsonParser = null;
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        int c=node.get("code").asInt();

        for(CodeEnum cenum:CodeEnum.values()){

            if( Double.compare(cenum.getCode(),c)==0){
                return cenum;
            }
        }
        //add default return statment for this method
        return null;

    }
}
