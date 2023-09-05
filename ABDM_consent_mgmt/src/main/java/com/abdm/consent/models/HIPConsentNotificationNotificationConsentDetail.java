package com.abdm.consent.models;


import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class HIPConsentNotificationNotificationConsentDetail {
    @com.google.gson.annotations.SerializedName("schemaVersion")
    private String schemaVersion = null;

    @com.google.gson.annotations.SerializedName("consentId")
    private UUID consentId = null;

    @com.google.gson.annotations.SerializedName("createdAt")
    private OffsetDateTime createdAt = null;

    @com.google.gson.annotations.SerializedName("patient")
    private ConsentManagerPatientID patient = null;

    @com.google.gson.annotations.SerializedName("careContexts")
    private List<HIPConsentNotificationNotificationConsentDetailCareContexts> careContexts = new ArrayList<HIPConsentNotificationNotificationConsentDetailCareContexts>();

    @com.google.gson.annotations.SerializedName("purpose")
    private UsePurpose purpose = null;

    @com.google.gson.annotations.SerializedName("hip")
    private AllOfHIPConsentNotificationNotificationConsentDetailHip hip = null;

    @com.google.gson.annotations.SerializedName("consentManager")
    private AllOfHIPConsentNotificationNotificationConsentDetailConsentManager consentManager = null;

    @com.google.gson.annotations.SerializedName("hiTypes")
    private List<HITypeEnum> hiTypes = new ArrayList<HITypeEnum>();

    @SerializedName("permission")
    private Permission permission = null;

    public HIPConsentNotificationNotificationConsentDetail schemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * Get schemaVersion
     * @return schemaVersion
     **/
//    @Schema(description = "")
    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public HIPConsentNotificationNotificationConsentDetail consentId(UUID consentId) {
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

    public HIPConsentNotificationNotificationConsentDetail createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
//    @Schema(required = true, description = "")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public HIPConsentNotificationNotificationConsentDetail patient(ConsentManagerPatientID patient) {
        this.patient = patient;
        return this;
    }

    /**
     * Get patient
     * @return patient
     **/
//    @Schema(required = true, description = "")
    public ConsentManagerPatientID getPatient() {
        return patient;
    }

    public void setPatient(ConsentManagerPatientID patient) {
        this.patient = patient;
    }

    public HIPConsentNotificationNotificationConsentDetail careContexts(List<HIPConsentNotificationNotificationConsentDetailCareContexts> careContexts) {
        this.careContexts = careContexts;
        return this;
    }

    public HIPConsentNotificationNotificationConsentDetail addCareContextsItem(HIPConsentNotificationNotificationConsentDetailCareContexts careContextsItem) {
        this.careContexts.add(careContextsItem);
        return this;
    }

    /**
     * Get careContexts
     * @return careContexts
     **/
//    @Schema(required = true, description = "")
    public List<HIPConsentNotificationNotificationConsentDetailCareContexts> getCareContexts() {
        return careContexts;
    }

    public void setCareContexts(List<HIPConsentNotificationNotificationConsentDetailCareContexts> careContexts) {
        this.careContexts = careContexts;
    }

    public HIPConsentNotificationNotificationConsentDetail purpose(UsePurpose purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Get purpose
     * @return purpose
     **/
//    @Schema(required = true, description = "")
    public UsePurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(UsePurpose purpose) {
        this.purpose = purpose;
    }

    public HIPConsentNotificationNotificationConsentDetail hip(AllOfHIPConsentNotificationNotificationConsentDetailHip hip) {
        this.hip = hip;
        return this;
    }

    /**
     * Get hip
     * @return hip
     **/
//    @Schema(required = true, description = "")
    public AllOfHIPConsentNotificationNotificationConsentDetailHip getHip() {
        return hip;
    }

    public void setHip(AllOfHIPConsentNotificationNotificationConsentDetailHip hip) {
        this.hip = hip;
    }

    public HIPConsentNotificationNotificationConsentDetail consentManager(AllOfHIPConsentNotificationNotificationConsentDetailConsentManager consentManager) {
        this.consentManager = consentManager;
        return this;
    }

    /**
     * Get consentManager
     * @return consentManager
     **/
//    @Schema(required = true, description = "")
    public AllOfHIPConsentNotificationNotificationConsentDetailConsentManager getConsentManager() {
        return consentManager;
    }

    public void setConsentManager(AllOfHIPConsentNotificationNotificationConsentDetailConsentManager consentManager) {
        this.consentManager = consentManager;
    }

    public HIPConsentNotificationNotificationConsentDetail hiTypes(List<HITypeEnum> hiTypes) {
        this.hiTypes = hiTypes;
        return this;
    }

    public HIPConsentNotificationNotificationConsentDetail addHiTypesItem(HITypeEnum hiTypesItem) {
        this.hiTypes.add(hiTypesItem);
        return this;
    }

    /**
     * Get hiTypes
     * @return hiTypes
     **/
//    @Schema(required = true, description = "")
    public List<HITypeEnum> getHiTypes() {
        return hiTypes;
    }

    public void setHiTypes(List<HITypeEnum> hiTypes) {
        this.hiTypes = hiTypes;
    }

    public HIPConsentNotificationNotificationConsentDetail permission(Permission permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     * @return permission
     **/
//    @Schema(required = true, description = "")
    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HIPConsentNotificationNotificationConsentDetail hiPConsentNotificationNotificationConsentDetail = (HIPConsentNotificationNotificationConsentDetail) o;
        return Objects.equals(this.schemaVersion, hiPConsentNotificationNotificationConsentDetail.schemaVersion) &&
                Objects.equals(this.consentId, hiPConsentNotificationNotificationConsentDetail.consentId) &&
                Objects.equals(this.createdAt, hiPConsentNotificationNotificationConsentDetail.createdAt) &&
                Objects.equals(this.patient, hiPConsentNotificationNotificationConsentDetail.patient) &&
                Objects.equals(this.careContexts, hiPConsentNotificationNotificationConsentDetail.careContexts) &&
                Objects.equals(this.purpose, hiPConsentNotificationNotificationConsentDetail.purpose) &&
                Objects.equals(this.hip, hiPConsentNotificationNotificationConsentDetail.hip) &&
                Objects.equals(this.consentManager, hiPConsentNotificationNotificationConsentDetail.consentManager) &&
                Objects.equals(this.hiTypes, hiPConsentNotificationNotificationConsentDetail.hiTypes) &&
                Objects.equals(this.permission, hiPConsentNotificationNotificationConsentDetail.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaVersion, consentId, createdAt, patient, careContexts, purpose, hip, consentManager, hiTypes, permission);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIPConsentNotificationNotificationConsentDetail {\n");

        sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
        sb.append("    careContexts: ").append(toIndentedString(careContexts)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    hip: ").append(toIndentedString(hip)).append("\n");
        sb.append("    consentManager: ").append(toIndentedString(consentManager)).append("\n");
        sb.append("    hiTypes: ").append(toIndentedString(hiTypes)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

