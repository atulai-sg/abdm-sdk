package com.abdm.consent.models;


import java.util.Objects;

public class ConsentArtefactResponseConsent {
    //    @SerializedName("status")
    private ConsentStatus status = null;
//
    //    @SerializedName("consentDetail")
    private ConsentArtefactResponseConsentConsentDetail consentDetail = null;

    //    @SerializedName("signature")
    private String signature = null;

    public ConsentArtefactResponseConsent status(ConsentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
//    @Schema(required = true, description = "")
    public ConsentStatus getStatus() {
        return status;
    }

    public void setStatus(ConsentStatus status) {
        this.status = status;
    }

    public ConsentArtefactResponseConsent consentDetail(ConsentArtefactResponseConsentConsentDetail consentDetail) {
        this.consentDetail = consentDetail;
        return this;
    }

    /**
     * Get consentDetail
     * @return consentDetail
     **/
//    @Schema(required = true, description = "")
    public ConsentArtefactResponseConsentConsentDetail getConsentDetail() {
        return consentDetail;
    }

    public void setConsentDetail(ConsentArtefactResponseConsentConsentDetail consentDetail) {
        this.consentDetail = consentDetail;
    }

    public ConsentArtefactResponseConsent signature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Get signature
     * @return signature
     **/
//    @Schema(example = "Signature of CM as defined in W3C standards; Base64 encoded", required = true, description = "")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsentArtefactResponseConsent consentArtefactResponseConsent = (ConsentArtefactResponseConsent) o;
        return Objects.equals(this.status, consentArtefactResponseConsent.status) &&
                Objects.equals(this.consentDetail, consentArtefactResponseConsent.consentDetail) &&
                Objects.equals(this.signature, consentArtefactResponseConsent.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, consentDetail, signature);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentArtefactResponseConsent {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    consentDetail: ").append(toIndentedString(consentDetail)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
