package com.abdm.consent.models;


import java.time.OffsetDateTime;
import java.util.Objects;

public class PermissionDateRange {
//    @SerializedName("from")
    private String from = null;

//    @SerializedName("to")
    private String to = null;

    public PermissionDateRange from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     **/
//    @Schema(required = true, description = "")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public PermissionDateRange to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     **/
//    @Schema(required = true, description = "")
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionDateRange permissionDateRange = (PermissionDateRange) o;
        return Objects.equals(this.from, permissionDateRange.from) &&
                Objects.equals(this.to, permissionDateRange.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionDateRange {\n");

        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

