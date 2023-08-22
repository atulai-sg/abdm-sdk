package com.abdm.consent.models;

import java.util.Objects;

public class ConsentManagerPatientID {

//    @SerializedName("id")
    private String id = null;

    public ConsentManagerPatientID id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
//    @Schema(example = "hinapatel79@ndhm", required = true, description = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsentManagerPatientID consentManagerPatientID = (ConsentManagerPatientID) o;
        return Objects.equals(this.id, consentManagerPatientID.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentManagerPatientID {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
