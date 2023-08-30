package com.abdm.consent.models;

import java.util.Objects;

public class RequesterIdentifier {


//    @SerializedName("type")
    private String type = null;

//    @SerializedName("value")
    private String value = null;

//    @SerializedName("system")
    private String system = null;

    public RequesterIdentifier type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
//    @Schema(example = "REGNO", required = true, description = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RequesterIdentifier value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     **/
//    @Schema(example = "MH1001", required = true, description = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RequesterIdentifier system(String system) {
        this.system = system;
        return this;
    }

    /**
     * Get system
     * @return system
     **/
//    @Schema(example = "https://www.mciindia.org", description = "")
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequesterIdentifier requesterIdentifier = (RequesterIdentifier) o;
        return Objects.equals(this.type, requesterIdentifier.type) &&
                Objects.equals(this.value, requesterIdentifier.value) &&
                Objects.equals(this.system, requesterIdentifier.system);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, system);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequesterIdentifier {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
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


