package com.abdm.consent.models;

import java.util.Objects;

public class ConsentArtefactResponseConsentConsentDetailCareContexts {
    //    @SerializedName("patientReference")
    private String patientReference = null;

    //    @SerializedName("careContextReference")
    private String careContextReference = null;

    public ConsentArtefactResponseConsentConsentDetailCareContexts patientReference(String patientReference) {
        this.patientReference = patientReference;
        return this;
    }

    /**
     * Get patientReference
     * @return patientReference
     **/
//    @Schema(example = "hinapatel79@hospital", required = true, description = "")
    public String getPatientReference() {
        return patientReference;
    }

    public void setPatientReference(String patientReference) {
        this.patientReference = patientReference;
    }

    public ConsentArtefactResponseConsentConsentDetailCareContexts careContextReference(String careContextReference) {
        this.careContextReference = careContextReference;
        return this;
    }

    /**
     * Get careContextReference
     * @return careContextReference
     **/
//    @Schema(example = "Episode1", required = true, description = "")
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
        ConsentArtefactResponseConsentConsentDetailCareContexts consentArtefactResponseConsentConsentDetailCareContexts = (ConsentArtefactResponseConsentConsentDetailCareContexts) o;
        return Objects.equals(this.patientReference, consentArtefactResponseConsentConsentDetailCareContexts.patientReference) &&
                Objects.equals(this.careContextReference, consentArtefactResponseConsentConsentDetailCareContexts.careContextReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientReference, careContextReference);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentArtefactResponseConsentConsentDetailCareContexts {\n");

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
