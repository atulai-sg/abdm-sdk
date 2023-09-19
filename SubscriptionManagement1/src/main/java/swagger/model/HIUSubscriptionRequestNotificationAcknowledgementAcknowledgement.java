package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;


/**
 * HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement
 */
@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement   {
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

  @JsonProperty("subscriptionRequestId")
  private String subscriptionRequestId = null;

  public HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement status(StatusEnum status) {
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

  public HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement subscriptionRequestId(String subscriptionRequestId) {
    this.subscriptionRequestId = subscriptionRequestId;
    return this;
  }

  /**
   * Get subscriptionRequestId
   * @return subscriptionRequestId
   **/
//  @Schema(example = "subscription Id", required = true, description = "")
//      @NotNull

    public String getSubscriptionRequestId() {
    return subscriptionRequestId;
  }

  public void setSubscriptionRequestId(String subscriptionRequestId) {
    this.subscriptionRequestId = subscriptionRequestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement hiUSubscriptionRequestNotificationAcknowledgementAcknowledgement = (HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement) o;
    return Objects.equals(this.status, hiUSubscriptionRequestNotificationAcknowledgementAcknowledgement.status) &&
        Objects.equals(this.subscriptionRequestId, hiUSubscriptionRequestNotificationAcknowledgementAcknowledgement.subscriptionRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subscriptionRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HIUSubscriptionRequestNotificationAcknowledgementAcknowledgement {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptionRequestId: ").append(toIndentedString(subscriptionRequestId)).append("\n");
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
