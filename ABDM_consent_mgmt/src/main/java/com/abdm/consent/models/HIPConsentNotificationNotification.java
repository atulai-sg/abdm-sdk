package com.abdm.consent.models;


import com.google.gson.annotations.SerializedName;

import java.util.Objects;
import java.util.UUID;

public class HIPConsentNotificationNotification {
    @com.google.gson.annotations.SerializedName("status")
    private ConsentStatus status = null;

    @com.google.gson.annotations.SerializedName("consentId")
    private UUID consentId = null;

    @com.google.gson.annotations.SerializedName("consentDetail")
    private HIPConsentNotificationNotificationConsentDetail consentDetail = null;

    @com.google.gson.annotations.SerializedName("signature")
    private String signature = null;

    @SerializedName("grantAcknowledgement")
    private Boolean grantAcknowledgement = null;

    public HIPConsentNotificationNotification status(ConsentStatus status) {
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

    public HIPConsentNotificationNotification consentId(UUID consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Get consentId
     * @return consentId
     **/
//    @Schema(required = true, description = "")
    public UUID getConsentId() {
        return consentId;
    }

    public void setConsentId(UUID consentId) {
        this.consentId = consentId;
    }

    public HIPConsentNotificationNotification consentDetail(HIPConsentNotificationNotificationConsentDetail consentDetail) {
        this.consentDetail = consentDetail;
        return this;
    }

    /**
     * Get consentDetail
     * @return consentDetail
     **/
//    @Schema(required = true, description = "")
    public HIPConsentNotificationNotificationConsentDetail getConsentDetail() {
        return consentDetail;
    }

    public void setConsentDetail(HIPConsentNotificationNotificationConsentDetail consentDetail) {
        this.consentDetail = consentDetail;
    }

    public HIPConsentNotificationNotification signature(String signature) {
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

    public HIPConsentNotificationNotification grantAcknowledgement(Boolean grantAcknowledgement) {
        this.grantAcknowledgement = grantAcknowledgement;
        return this;
    }

    /**
     * Get grantAcknowledgement
     * @return grantAcknowledgement
     **/
//    @Schema(example = "false", required = true, description = "")
    public Boolean isGrantAcknowledgement() {
        return grantAcknowledgement;
    }

    public void setGrantAcknowledgement(Boolean grantAcknowledgement) {
        this.grantAcknowledgement = grantAcknowledgement;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HIPConsentNotificationNotification hiPConsentNotificationNotification = (HIPConsentNotificationNotification) o;
        return Objects.equals(this.status, hiPConsentNotificationNotification.status) &&
                Objects.equals(this.consentId, hiPConsentNotificationNotification.consentId) &&
                Objects.equals(this.consentDetail, hiPConsentNotificationNotification.consentDetail) &&
                Objects.equals(this.signature, hiPConsentNotificationNotification.signature) &&
                Objects.equals(this.grantAcknowledgement, hiPConsentNotificationNotification.grantAcknowledgement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, consentId, consentDetail, signature, grantAcknowledgement);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIPConsentNotificationNotification {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    consentDetail: ").append(toIndentedString(consentDetail)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    grantAcknowledgement: ").append(toIndentedString(grantAcknowledgement)).append("\n");
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
