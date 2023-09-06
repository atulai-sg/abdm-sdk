package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
//https://dev.abdm.gov.in/gateway/v0.5/health-information/notify
//extennd notification
public class HiuNotificationNotification {
    @lombok.Getter
    @JsonProperty("consentId")
    private UUID consentId = null;

    @lombok.Getter
    @JsonProperty("transactionId")
    private UUID transactionId = null;

    @lombok.Getter
    @JsonProperty("doneAt")
    private String doneAt = null;

    @lombok.Getter
    @JsonProperty("notifier")
    private HiuNotificationNotificationNotifier notifier = null;

    @lombok.Getter
    @JsonProperty("statusNotification")
    private HiuNotificationNotificationStatusNotification statusNotification = null;

    public HiuNotificationNotification consentId(UUID consentId) {
        this.consentId = consentId;
        return this;
    }

    public void setConsentId(UUID consentId) {
        this.consentId = consentId;
    }

    public HiuNotificationNotification transactionId(UUID transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public HiuNotificationNotification doneAt(String doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    public void setDoneAt(String doneAt) {
        this.doneAt = doneAt;
    }

    public HiuNotificationNotification notifier(HiuNotificationNotificationNotifier notifier) {
        this.notifier = notifier;
        return this;
    }

    public void setNotifier(HiuNotificationNotificationNotifier notifier) {
        this.notifier = notifier;
    }

    public HiuNotificationNotification statusNotification(HiuNotificationNotificationStatusNotification statusNotification) {
        this.statusNotification = statusNotification;
        return this;
    }

    public void setStatusNotification(HiuNotificationNotificationStatusNotification statusNotification) {
        this.statusNotification = statusNotification;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HiuNotificationNotification healthInformationNotificationNotification = (HiuNotificationNotification) o;
        return Objects.equals(this.consentId, healthInformationNotificationNotification.consentId) &&
                Objects.equals(this.transactionId, healthInformationNotificationNotification.transactionId) &&
                Objects.equals(this.doneAt, healthInformationNotificationNotification.doneAt) &&
                Objects.equals(this.notifier, healthInformationNotificationNotification.notifier) &&
                Objects.equals(this.statusNotification, healthInformationNotificationNotification.statusNotification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, transactionId, doneAt, notifier, statusNotification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthInformationNotificationNotification {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    doneAt: ").append(toIndentedString(doneAt)).append("\n");
        sb.append("    notifier: ").append(toIndentedString(notifier)).append("\n");
        sb.append("    statusNotification: ").append(toIndentedString(statusNotification)).append("\n");
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
