package com.abdm.consent.models;


import java.util.Objects;

public class ConsentArtefactReference {
    //    @SerializedName("id")
    private String id = null;

    public ConsentArtefactReference id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
//    @Schema(example = "<consent-artefact-id>", required = true, description = "")
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
        ConsentArtefactReference consentArtefactReference = (ConsentArtefactReference) o;
        return Objects.equals(this.id, consentArtefactReference.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentArtefactReference {\n");

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
