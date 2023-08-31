package com.abdm.data_transfer_workflow.models;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
 //import io.swagger.v3.oas.annotations.media.Schema;
 //import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
 //import javax.validation.Valid;
 //import javax.validation.constraints.*;

/**
 * DateRange
 */
 //@Validated
 //@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T11:44:23.555147320Z[GMT]")


public class DateRange   {
    @lombok.Setter
    @lombok.Getter
    @JsonProperty("from")
    private String from = null;

    @lombok.Getter
    @JsonProperty("to")
    private String to = null;

    public DateRange from(String from) {
        this.from = from;
        return this;
    }

    public DateRange to(String to) {
        this.to = to;
        return this;
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
        DateRange dateRange = (DateRange) o;
        return Objects.equals(this.from, dateRange.from) &&
                Objects.equals(this.to, dateRange.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DateRange {\n");

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







/*
public class DateRange {
    private Date from;
    private Date to;

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}

 */


