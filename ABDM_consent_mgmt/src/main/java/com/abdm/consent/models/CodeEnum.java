package com.abdm.consent.models;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonSerialize(using=Enumserializer.class)
public enum CodeEnum {

    //need to create custom serialiser and deseriabliser for this enum class


    NUMBER_1000(1000),
    NUMBER_10001(10001);

    public  int code;
    private CodeEnum( int codee){
        this.code=codee;
    }
    public static CodeEnum fromValue(Integer input) {
            for (CodeEnum b : CodeEnum.values()) {
                if (b.code==(input)) {
                    return b;
                }
            }
            return null;
        }


    @JsonValue

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
