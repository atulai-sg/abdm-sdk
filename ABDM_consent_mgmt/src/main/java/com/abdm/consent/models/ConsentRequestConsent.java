package com.abdm.consent.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConsentRequestConsent {

    private UsePurpose purpose ;


    private AllOfConsentRequestConsentPatient patient ;


    private AllOfConsentRequestConsentHip hip ;


    private List<CareContextDefinition> careContexts ;

//    @SerializedName("hiu")
    private AllOfConsentRequestConsentHiu hiu = null;

//    @SerializedName("requester")
    private Requester requester = null;

//    @SerializedName("hiTypes")
    private List<HITypeEnum> hiTypes = new ArrayList<HITypeEnum>();

//    @SerializedName("permission")
    private Permission permission = null;

    public ConsentRequestConsent purpose(UsePurpose purpose) {
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

    public ConsentRequestConsent patient(AllOfConsentRequestConsentPatient patient) {
        this.patient = patient;
        return this;
    }

    /**
     * Get patient
     * @return patient
     **/
//    @Schema(required = true, description = "")
    public AllOfConsentRequestConsentPatient getPatient() {
        return patient;
    }

    public void setPatient(AllOfConsentRequestConsentPatient patient) {
        this.patient = patient;
    }

    public ConsentRequestConsent hip(AllOfConsentRequestConsentHip hip) {
        this.hip = hip;
        return this;
    }

    /**
     * Get hip
     * @return hip
     **/
//    @Schema(description = "")
    public AllOfConsentRequestConsentHip getHip() {
        return hip;
    }

    public void setHip(AllOfConsentRequestConsentHip hip) {
        this.hip = hip;
    }

    public ConsentRequestConsent careContexts(List<CareContextDefinition> careContexts) {
        this.careContexts = careContexts;
        return this;
    }

    public ConsentRequestConsent addCareContextsItem(CareContextDefinition careContextsItem) {
        if (this.careContexts == null) {
            this.careContexts = new ArrayList<CareContextDefinition>();
        }
        this.careContexts.add(careContextsItem);
        return this;
    }

    /**
     * Get careContexts
     * @return careContexts
     **/
//    @Schema(description = "")
    public List<CareContextDefinition> getCareContexts() {
        return careContexts;
    }

    public void setCareContexts(List<CareContextDefinition> careContexts) {
        this.careContexts = careContexts;
    }

    public ConsentRequestConsent hiu(AllOfConsentRequestConsentHiu hiu) {
        this.hiu = hiu;
        return this;
    }

    /**
     * Get hiu
     * @return hiu
     **/
//    @Schema(required = true, description = "")
    public AllOfConsentRequestConsentHiu getHiu() {
        return hiu;
    }

    public void setHiu(AllOfConsentRequestConsentHiu hiu) {
        this.hiu = hiu;
    }

    public ConsentRequestConsent requester(Requester requester) {
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

    public ConsentRequestConsent hiTypes(List<HITypeEnum> hiTypes) {
        this.hiTypes = hiTypes;
        return this;
    }

    public ConsentRequestConsent addHiTypesItem(HITypeEnum hiTypesItem) {
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

    public ConsentRequestConsent permission(Permission permission) {
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
        ConsentRequestConsent consentRequestConsent = (ConsentRequestConsent) o;
        return Objects.equals(this.purpose, consentRequestConsent.purpose) &&
                Objects.equals(this.patient, consentRequestConsent.patient) &&
                Objects.equals(this.hip, consentRequestConsent.hip) &&
                Objects.equals(this.careContexts, consentRequestConsent.careContexts) &&
                Objects.equals(this.hiu, consentRequestConsent.hiu) &&
                Objects.equals(this.requester, consentRequestConsent.requester) &&
                Objects.equals(this.hiTypes, consentRequestConsent.hiTypes) &&
                Objects.equals(this.permission, consentRequestConsent.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purpose, patient, hip, careContexts, hiu, requester, hiTypes, permission);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentRequestConsent {\n");

        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
        sb.append("    hip: ").append(toIndentedString(hip)).append("\n");
        sb.append("    careContexts: ").append(toIndentedString(careContexts)).append("\n");
        sb.append("    hiu: ").append(toIndentedString(hiu)).append("\n");
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
