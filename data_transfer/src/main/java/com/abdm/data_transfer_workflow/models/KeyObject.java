package com.abdm.data_transfer_workflow.models;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
//import io.swagger.v3.oas.annotations.media.Schema;
//import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;


/**
 * KeyObject
 */


// dh public key
public class KeyObject   {
    @lombok.Getter
    @JsonProperty("expiry")
    private String expiry = null;

    @lombok.Getter
    @JsonProperty("parameters")
    private String parameters = null;

    @lombok.Getter
    @JsonProperty("keyValue")
    private String keyValue = null;

    public KeyObject expiry(String expiry) {
        this.expiry = expiry;
        return this;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public KeyObject parameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public KeyObject keyValue(String keyValue) {
        this.keyValue = keyValue;
        return this;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyObject keyObject = (KeyObject) o;
        return Objects.equals(this.expiry, keyObject.expiry) &&
                Objects.equals(this.parameters, keyObject.parameters) &&
                Objects.equals(this.keyValue, keyObject.keyValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiry, parameters, keyValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyObject {\n");

        sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
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