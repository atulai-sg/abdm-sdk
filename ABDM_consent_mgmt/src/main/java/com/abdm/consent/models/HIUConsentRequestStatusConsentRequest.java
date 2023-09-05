package com.abdm.consent.models;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HIUConsentRequestStatusConsentRequest {
    //    @SerializedName("id")
    private String id = null;

    //    @SerializedName("status")
    private ConsentStatus status = null;

    //    @SerializedName("consentArtefacts")
    private List<ConsentArtefactReference> consentArtefacts = new ArrayList<ConsentArtefactReference>();

    public HIUConsentRequestStatusConsentRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
//    @Schema(example = "<consent-request-id>", required = true, description = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HIUConsentRequestStatusConsentRequest status(ConsentStatus status) {
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

    public HIUConsentRequestStatusConsentRequest consentArtefacts(List<ConsentArtefactReference> consentArtefacts) {
        this.consentArtefacts = consentArtefacts;
        return this;
    }

    public HIUConsentRequestStatusConsentRequest addConsentArtefactsItem(ConsentArtefactReference consentArtefactsItem) {
        this.consentArtefacts.add(consentArtefactsItem);
        return this;
    }

    /**
     * Get consentArtefacts
     * @return consentArtefacts
     **/
//    @Schema(required = true, description = "")
    public List<ConsentArtefactReference> getConsentArtefacts() {
        return consentArtefacts;
    }

    public void setConsentArtefacts(List<ConsentArtefactReference> consentArtefacts) {
        this.consentArtefacts = consentArtefacts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HIUConsentRequestStatusConsentRequest hiUConsentRequestStatusConsentRequest = (HIUConsentRequestStatusConsentRequest) o;
        return Objects.equals(this.id, hiUConsentRequestStatusConsentRequest.id) &&
                Objects.equals(this.status, hiUConsentRequestStatusConsentRequest.status) &&
                Objects.equals(this.consentArtefacts, hiUConsentRequestStatusConsentRequest.consentArtefacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, consentArtefacts);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIUConsentRequestStatusConsentRequest {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    consentArtefacts: ").append(toIndentedString(consentArtefacts)).append("\n");
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

