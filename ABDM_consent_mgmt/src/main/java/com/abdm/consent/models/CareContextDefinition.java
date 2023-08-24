package com.abdm.consent.models;

import java.util.Objects;

public class CareContextDefinition {

//    @SerializedName("patientReference")
    private String patientReference ;

//    @SerializedName("careContextReference")
    private String careContextReference;

    public CareContextDefinition patientReference(String patientReference) {
        this.patientReference = patientReference;
        return this;
    }

    /**
     * A patient identifier with which patient is registered in the facility/hospital
     * @return patientReference
     **/
//    @Schema(example = "batman@tmh", required = true, description = "A patient identifier with which patient is registered in the facility/hospital")
    public String getPatientReference() {
        return patientReference;
    }

    public void setPatientReference(String patientReference) {
        this.patientReference = patientReference;
    }

    public CareContextDefinition careContextReference(String careContextReference) {
        this.careContextReference = careContextReference;
        return this;
    }

    /**
     * An identifier of patient&#x27;s care context created in HIP. A care context is a group of patient&#x27;s health data (Not the actuall health data)
     * @return careContextReference
     **/
//    @Schema(example = "Episode1", required = true, description = "An identifier of patient's care context created in HIP. A care context is a group of patient's health data (Not the actuall health data)")
    public String getCareContextReference() {
        return careContextReference;
    }

    public void setCareContextReference(String careContextReference) {
        this.careContextReference = careContextReference;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CareContextDefinition careContextDefinition = (CareContextDefinition) o;
        return Objects.equals(this.patientReference, careContextDefinition.patientReference) &&
                Objects.equals(this.careContextReference, careContextDefinition.careContextReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientReference, careContextReference);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CareContextDefinition {\n");

        sb.append("    patientReference: ").append(toIndentedString(patientReference)).append("\n");
        sb.append("    careContextReference: ").append(toIndentedString(careContextReference)).append("\n");
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
