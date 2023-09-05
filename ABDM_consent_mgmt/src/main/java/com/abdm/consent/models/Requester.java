package com.abdm.consent.models;

import java.util.Objects;

public class Requester {


//    @SerializedName("name")
    private String name = null;

//    @SerializedName("identifier")
    private RequesterIdentifier identifier = null;

    public Requester name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
//    @Schema(example = "Dr. Manju", required = true, description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Requester identifier(RequesterIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     * @return identifier
     **/
//    @Schema(description = "")
    public RequesterIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(RequesterIdentifier identifier) {
        this.identifier = identifier;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Requester requester = (Requester) o;
        return Objects.equals(this.name, requester.name) &&
                Objects.equals(this.identifier, requester.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, identifier);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Requester {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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


