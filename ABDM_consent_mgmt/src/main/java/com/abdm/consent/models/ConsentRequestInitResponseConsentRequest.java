package com.abdm.consent.models;

import java.util.Objects;
import java.util.UUID;

public class ConsentRequestInitResponseConsentRequest {
//    @SerializedName("id")
    private UUID id = null;

    public ConsentRequestInitResponseConsentRequest id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * id of the consent-request created
     * @return id
     **/
//    @Schema(example = "f29f0e59-8388-4698-9fe6-05db67aeac46", required = true, description = "id of the consent-request created")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
        ConsentRequestInitResponseConsentRequest consentRequestInitResponseConsentRequest = (ConsentRequestInitResponseConsentRequest) o;
        return Objects.equals(this.id, consentRequestInitResponseConsentRequest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsentRequestInitResponseConsentRequest {\n");

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
