package com.abdm.data_transfer_workflow.models;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

//NESTED hi request "hiRequest": {
//        "consent": {
//            "id": "1810102b-0bd2-4901-a718-46705721fcf1"
//        },
//        "dateRange": {
//          "from": "2020-11-25T12:30:29.592",
//          "to": "2025-05-09T11:10:10.592"
//        },
//        "dataPushUrl": "https://webhook.site/ae79e55d-8107-4598-873c-1f6c4ba05915",
//        "keyMaterial":
public class HIRequestHiRequest   {
    @JsonProperty("consent")
    private Consent consent = null;

    @JsonProperty("dateRange")
    private DateRange dateRange = null;

    @JsonProperty("dataPushUrl")
    private String dataPushUrl = null;

    @JsonProperty("keyMaterial")
    private KeyMaterial keyMaterial = null;

    public HIRequestHiRequest consent(Consent consent) {
        this.consent = consent;
        return this;
    }

    /**
     * Get consent
     * @return consent
     **/
    //@Schema(required = true, description = "")
    //@NotNull

    // @Valid
    public Consent getConsent() {
        return consent;
    }

    public void setConsent(Consent consent) {
        this.consent = consent;
    }

    public HIRequestHiRequest dateRange(DateRange dateRange) {
        this.dateRange = dateRange;
        return this;
    }

    /**
     * Get dateRange
     * @return dateRange
     **/
    //   @Schema(required = true, description = "")
    // @NotNull

    //  @Valid
    public DateRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public HIRequestHiRequest dataPushUrl(String dataPushUrl) {
        this.dataPushUrl = dataPushUrl;
        return this;
    }

    /**
     * Get dataPushUrl
     * @return dataPushUrl
     **/
    // @Schema(required = true, description = "")
    // @NotNull

    public String getDataPushUrl() {
        return dataPushUrl;
    }

    public void setDataPushUrl(String dataPushUrl) {
        this.dataPushUrl = dataPushUrl;
    }

    public HIRequestHiRequest keyMaterial(KeyMaterial keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    /**
     * Get keyMaterial
     * @return keyMaterial
     **/
   //  @Schema(required = true, description = "")
    //  @NotNull

   //  @Valid
    public KeyMaterial getKeyMaterial() {
        return keyMaterial;
    }

    public void setKeyMaterial(KeyMaterial keyMaterial) {
        this.keyMaterial = keyMaterial;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HIRequestHiRequest hiRequestHiRequest = (HIRequestHiRequest) o;
        return Objects.equals(this.consent, hiRequestHiRequest.consent) &&
                Objects.equals(this.dateRange, hiRequestHiRequest.dateRange) &&
                Objects.equals(this.dataPushUrl, hiRequestHiRequest.dataPushUrl) &&
                Objects.equals(this.keyMaterial, hiRequestHiRequest.keyMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consent, dateRange, dataPushUrl, keyMaterial);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HIRequestHiRequest {\n");

        sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
        sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
        sb.append("    dataPushUrl: ").append(toIndentedString(dataPushUrl)).append("\n");
        sb.append("    keyMaterial: ").append(toIndentedString(keyMaterial)).append("\n");
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