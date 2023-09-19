package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;

/**
 * HIUSubscriptionNotificationAcknowledgmentAcknowledgement
 */
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class HIUSubscriptionNotificationAcknowledgmentAcknowledgement   {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("eventId")
  private String eventId = null;

  public HIUSubscriptionNotificationAcknowledgmentAcknowledgement status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
//  @Schema(required = true, description = "")
//      @NotNull

    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public HIUSubscriptionNotificationAcknowledgmentAcknowledgement eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
   **/
//  @Schema(example = "subscription event Id", required = true, description = "")
//      @NotNull

    public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HIUSubscriptionNotificationAcknowledgmentAcknowledgement hiUSubscriptionNotificationAcknowledgmentAcknowledgement = (HIUSubscriptionNotificationAcknowledgmentAcknowledgement) o;
    return Objects.equals(this.status, hiUSubscriptionNotificationAcknowledgmentAcknowledgement.status) &&
        Objects.equals(this.eventId, hiUSubscriptionNotificationAcknowledgmentAcknowledgement.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, eventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HIUSubscriptionNotificationAcknowledgmentAcknowledgement {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
