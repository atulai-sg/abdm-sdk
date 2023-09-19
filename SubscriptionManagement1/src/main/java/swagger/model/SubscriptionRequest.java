package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import swagger.model.SubscriptionRequestSubscription;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;

/**
 * SubscriptionRequest
 */


public class SubscriptionRequest   {
  @JsonProperty("requestId")
  private UUID requestId = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("subscription")
  private SubscriptionRequestSubscription subscription = null;

  public SubscriptionRequest requestId(UUID requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * a nonce, unique for each HTTP request.
   * @return requestId
   **/
//  @Schema(example = "499a5a4a-7dda-4f20-9b67-e24589627061", required = true, description = "a nonce, unique for each HTTP request.")
//      @NotNull
//
//    @Valid
    public UUID getRequestId() {
    return requestId;
  }

  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }

  public SubscriptionRequest timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ
   * @return timestamp
   **/
//  @Schema(required = true, description = "Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ")
//      @NotNull
//
//    @Valid
    public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public SubscriptionRequest subscription(SubscriptionRequestSubscription subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
   **/
//  @Schema(required = true, description = "")
//      @NotNull
//
//    @Valid
    public SubscriptionRequestSubscription getSubscription() {
    return subscription;
  }

  public void setSubscription(SubscriptionRequestSubscription subscription) {
    this.subscription = subscription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.requestId, subscriptionRequest.requestId) &&
        Objects.equals(this.timestamp, subscriptionRequest.timestamp) &&
        Objects.equals(this.subscription, subscriptionRequest.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, timestamp, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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
