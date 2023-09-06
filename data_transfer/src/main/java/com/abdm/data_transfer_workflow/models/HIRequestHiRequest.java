package com.abdm.data_transfer_workflow.models;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


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