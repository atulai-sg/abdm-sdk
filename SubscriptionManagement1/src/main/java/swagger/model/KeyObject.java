package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeyObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class KeyObject   {
  @JsonProperty("expiry")
  private OffsetDateTime expiry = null;

  @JsonProperty("parameters")
  private String parameters = null;

  @JsonProperty("keyValue")
  private String keyValue = null;

  public KeyObject expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Get expiry
   * @return expiry
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  public KeyObject parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(example = "Curve25519/32byte random key", required = true, description = "")
      @NotNull

    public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public KeyObject keyValue(String keyValue) {
    this.keyValue = keyValue;
    return this;
  }

  /**
   * Get keyValue
   * @return keyValue
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyObject keyObject = (KeyObject) o;
    return Objects.equals(this.expiry, keyObject.expiry) &&
        Objects.equals(this.parameters, keyObject.parameters) &&
        Objects.equals(this.keyValue, keyObject.keyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, parameters, keyValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyObject {\n");
    
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
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
