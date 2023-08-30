package com.abdm.consent.models;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.bson.types.Code;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;

public class Enumserializer extends StdSerializer {

    public Enumserializer(){
        super(CodeEnum.class);
    }

    public  Enumserializer(Class t){
        super(t);
    }

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {


    }



    public void serialize(CodeEnum e, JsonGenerator gen, SerializerProvider provider) throws IOException ,JsonProcessingException{

            JsonGenerator generator=null;
        generator.writeStartObject();
        generator.writeFieldName("name");
        generator.writeString(e.name());
        generator.writeFieldName("unit");
        generator.writeString(String.valueOf(e.getCode()));

        generator.writeEndObject();

    }
}
