package com.abdm.data_transfer_workflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;
import java.util.UUID;

public class HrpRequestAcknowledgementHiRequest {


        @lombok.Getter
        @JsonProperty("transactionId")
        private UUID transactionId = null;

        /**
         * Gets or Sets sessionStatus
         */
        public enum SessionStatusEnum {
            ACKNOWLEDGED("ACKNOWLEDGED");

            private String value;

            SessionStatusEnum(String value) {
                this.value = value;
            }

            @Override
            @JsonValue
            public String toString() {
                return String.valueOf(value);
            }

            @JsonCreator
            public static SessionStatusEnum fromValue(String text) {
                for (SessionStatusEnum b : SessionStatusEnum.values()) {
                    if (String.valueOf(b.value).equals(text)) {
                        return b;
                    }
                }
                return null;
            }
        }
        @lombok.Getter
        @JsonProperty("sessionStatus")
        private SessionStatusEnum sessionStatus = null;

        public HrpRequestAcknowledgementHiRequest transactionId(UUID transactionId) {
            this.transactionId = transactionId;
            return this;
        }

    public void setTransactionId(UUID transactionId) {
            this.transactionId = transactionId;
        }

        public HrpRequestAcknowledgementHiRequest sessionStatus(SessionStatusEnum sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }

    public void setSessionStatus(SessionStatusEnum sessionStatus) {
            this.sessionStatus = sessionStatus;
        }


        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            HrpRequestAcknowledgementHiRequest   hrpRequestAcknowledgementHiRequest= (HrpRequestAcknowledgementHiRequest) o;
            return Objects.equals(this.transactionId,  hrpRequestAcknowledgementHiRequest.transactionId) &&
                    Objects.equals(this.sessionStatus,  hrpRequestAcknowledgementHiRequest.sessionStatus);
        }

        @Override
        public int hashCode() {
            return Objects.hash(transactionId, sessionStatus);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HIPHealthInformationRequestAcknowledgementHiRequest {\n");

            sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
            sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
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

