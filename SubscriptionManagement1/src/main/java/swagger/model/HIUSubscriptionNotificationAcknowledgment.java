package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import java.time.OffsetDateTime;


/**
 * HIUSubscriptionNotificationAcknowledgment
 */
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class HIUSubscriptionNotificationAcknowledgment   {
  @JsonProperty("requestId")
  private UUID requestId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("acknowledgement")
  private HIUSubscriptionNotificationAcknowledgmentAcknowledgement acknowledgement = null;

  @JsonProperty("error")
  private java.lang.Error error = null;

  @JsonProperty("resp")
  private RequestReference resp = null;

  public HIUSubscriptionNotificationAcknowledgment requestId(UUID requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * a nonce, unique for each HTTP request
   * @return requestId
   **/
//  @Schema(example = "5f7a535d-a3fd-416b-b069-c97d021fbacd", required = true, description = "a nonce, unique for each HTTP request")
//      @NotNull
//
//    @Valid
    public UUID getRequestId() {
    return requestId;
  }

  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }

  public HIUSubscriptionNotificationAcknowledgment timestamp(OffsetDateTime timestamp) {
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
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public HIUSubscriptionNotificationAcknowledgment acknowledgement(HIUSubscriptionNotificationAcknowledgmentAcknowledgement acknowledgement) {
    this.acknowledgement = acknowledgement;
    return this;
  }

  /**
   * Get acknowledgement
   * @return acknowledgement
   **/
//  @Schema(description = "")
//
//    @Valid
    public HIUSubscriptionNotificationAcknowledgmentAcknowledgement getAcknowledgement() {
    return acknowledgement;
  }

  public void setAcknowledgement(HIUSubscriptionNotificationAcknowledgmentAcknowledgement acknowledgement) {
    this.acknowledgement = acknowledgement;
  }

  public HIUSubscriptionNotificationAcknowledgment error(java.lang.Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
//  @Schema(description = "")
//
//    @Valid
    public java.lang.Error getError() {
    return error;
  }

  public void setError(java.lang.Error error) {
    this.error = error;
  }

  public HIUSubscriptionNotificationAcknowledgment resp(RequestReference resp) {
    this.resp = resp;
    return this;
  }

  /**
   * Get resp
   * @return resp
   **/
//  @Schema(required = true, description = "")
//      @NotNull
//
//    @Valid
    public RequestReference getResp() {
    return resp;
  }

  public void setResp(RequestReference resp) {
    this.resp = resp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HIUSubscriptionNotificationAcknowledgment hiUSubscriptionNotificationAcknowledgment = (HIUSubscriptionNotificationAcknowledgment) o;
    return Objects.equals(this.requestId, hiUSubscriptionNotificationAcknowledgment.requestId) &&
        Objects.equals(this.timestamp, hiUSubscriptionNotificationAcknowledgment.timestamp) &&
        Objects.equals(this.acknowledgement, hiUSubscriptionNotificationAcknowledgment.acknowledgement) &&
        Objects.equals(this.error, hiUSubscriptionNotificationAcknowledgment.error) &&
        Objects.equals(this.resp, hiUSubscriptionNotificationAcknowledgment.resp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, timestamp, acknowledgement, error, resp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HIUSubscriptionNotificationAcknowledgment {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    acknowledgement: ").append(toIndentedString(acknowledgement)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    resp: ").append(toIndentedString(resp)).append("\n");
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
