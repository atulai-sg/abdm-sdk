package com.abdm.consent.models;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ConsentArtefactResponseConsentConsentDetail {
    //    @SerializedName("schemaVersion")
    private String schemaVersion = null;

    //    @SerializedName("consentId")
    private UUID consentId = null;

    //    @SerializedName("createdAt")
    private OffsetDateTime createdAt = null;

    //    @SerializedName("patient")
    private ConsentManagerPatientID patient = null;

    //    @SerializedName("careContexts")
    private List<ConsentArtefactResponseConsentConsentDetailCareContexts> careContexts = new ArrayList<ConsentArtefactResponseConsentConsentDetailCareContexts>();

    //    @SerializedName("purpose")
    private UsePurpose purpose = null;

    //    @SerializedName("hip")
    private AllOfConsentArtefactResponseConsentConsentDetailHip hip = null;

    //    @SerializedName("hiu")
    private AllOfConsentArtefactResponseConsentConsentDetailHiu hiu = null;

    //    @SerializedName("consentManager")
    private AllOfConsentArtefactResponseConsentConsentDetailConsentManager consentManager = null;

    //    @SerializedName("requester")
    private Requester requester = null;

    //    @SerializedName("hiTypes")
    private List<HITypeEnum> hiTypes = new ArrayList<HITypeEnum>();

    //    @SerializedName("permission")
    private Permission permission = null;

    public ConsentArtefactResponseConsentConsentDetail schemaVersion(String schemaVersion) {
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

    public ConsentArtefactResponseConsentConsentDetail consentId(UUID consentId) {
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

    public ConsentArtefactResponseConsentConsentDetail createdAt(OffsetDateTime createdAt) {
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

    public ConsentArtefactResponseConsentConsentDetail patient(ConsentManagerPatientID patient) {
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

    public ConsentArtefactResponseConsentConsentDetail careContexts(List<ConsentArtefactResponseConsentConsentDetailCareContexts> careContexts) {
        this.careContexts = careContexts;
        return this;
    }

    public ConsentArtefactResponseConsentConsentDetail addCareContextsItem(ConsentArtefactResponseConsentConsentDetailCareContexts careContextsItem) {
        this.careContexts.add(careContextsItem);
        return this;
    }

    /**
     * Get careContexts
     * @return careContexts
     **/
//    @Schema(required = true, description = "")
    public List<ConsentArtefactResponseConsentConsentDetailCareContexts> getCareContexts() {
        return careContexts;
    }

    public void setCareContexts(List<ConsentArtefactResponseConsentConsentDetailCareContexts> careContexts) {
        this.careContexts = careContexts;
    }

    public ConsentArtefactResponseConsentConsentDetail purpose(UsePurpose purpose) {
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

    public ConsentArtefactResponseConsentConsentDetail hip(AllOfConsentArtefactResponseConsentConsentDetailHip hip) {
        this.hip = hip;
        return this;
    }

    /**
     * Get hip
     * @return hip
     **/
//    @Schema(required = true, description = "")
    public AllOfConsentArtefactResponseConsentConsentDetailHip getHip() {
        return hip;
    }

    public void setHip(AllOfConsentArtefactResponseConsentConsentDetailHip hip) {
        this.hip = hip;
    }

    public ConsentArtefactResponseConsentConsentDetail hiu(AllOfConsentArtefactResponseConsentConsentDetailHiu hiu) {
        this.hiu = hiu;
        return this;
    }

    /**
     * Get hiu
     * @return hiu
     **/
//    @Schema(required = true, description = "")
    public AllOfConsentArtefactResponseConsentConsentDetailHiu getHiu() {
        return hiu;
    }

    public void setHiu(AllOfConsentArtefactResponseConsentConsentDetailHiu hiu) {
        this.hiu = hiu;
    }

    public ConsentArtefactResponseConsentConsentDetail consentManager(AllOfConsentArtefactResponseConsentConsentDetailConsentManager consentManager) {
        this.consentManager = consentManager;
        return this;
    }

    /**
     * Get consentManager
     * @return consentManager
     **/
//    @Schema(required = true, description = "")
    public AllOfConsentArtefactResponseConsentConsentDetailConsentManager getConsentManager() {
        return consentManager;
    }

    public void setConsentManager(AllOfConsentArtefactResponseConsentConsentDetailConsentManager consentManager) {
        this.consentManager = consentManager;
    }

    public ConsentArtefactResponseConsentConsentDetail requester(Requester requester) {
        this.requester = requester;
        return this;
    }

    /**
     * Get requester
     * @return requester
     **/
//    @Schema(required = true, description = "")
    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    public ConsentArtefactResponseConsentConsentDetail hiTypes(List<HITypeEnum> hiTypes) {
        this.hiTypes = hiTypes;
        return this;
    }

    public ConsentArtefactResponseConsentConsentDetail addHiTypesItem(HITypeEnum hiTypesItem) {
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

    public ConsentArtefactResponseConsentConsentDetail permission(Permission permission) {
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
        ConsentArtefactResponseConsentConsentDetail consentArtefactResponseConsentConsentDetail = (ConsentArtefactResponseConsentConsentDetail) o;
        return Objects.equals(this.schemaVersion, consentArtefactResponseConsentConsentDetail.schemaVersion) &&
                Objects.equals(this.consentId, consentArtefactResponseConsentConsentDetail.consentId) &&
                Objects.equals(this.createdAt, consentArtefactResponseConsentConsentDetail.createdAt) &&
                Objects.equals(this.patient, consentArtefactResponseConsentConsentDetail.patient) &&
                Objects.equals(this.careContexts, consentArtefactResponseConsentConsentDetail.careContexts) &&
                Objects.equals(this.purpose, consentArtefactResponseConsentConsentDetail.purpose) &&
                Objects.equals(this.hip, consentArtefactResponseConsentConsentDetail.hip) &&
                Objects.equals(this.hiu, consentArtefactResponseConsentConsentDetail.hiu) &&
                Objects.equals(this.consentManager, consentArtefactResponseConsentConsentDetail.consentManager) &&
                Objects.equals(this.requester, consentArtefactResponseConsentConsentDetail.requester) &&
                Objects.equals(this.hiTypes, consentArtefactResponseConsentConsentDetail.hiTypes) &&
                Objects.equals(this.permission, consentArtefactResponseConsentConsentDetail.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaVersion, consentId, createdAt, patient, careContexts, purpose, hip, hiu, consentManager, requester, hiTypes, permission);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentArtefactResponseConsentConsentDetail {\n");

        sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
        sb.append("    careContexts: ").append(toIndentedString(careContexts)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    hip: ").append(toIndentedString(hip)).append("\n");
        sb.append("    hiu: ").append(toIndentedString(hiu)).append("\n");
        sb.append("    consentManager: ").append(toIndentedString(consentManager)).append("\n");
        sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
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
