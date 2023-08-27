package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Meta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class Meta   {
  /**
   * Gets or Sets communicationMedium
   */
  public enum CommunicationMediumEnum {
    MOBILE("MOBILE"),
    
    EMAIL("EMAIL");

    private String value;

    CommunicationMediumEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CommunicationMediumEnum fromValue(String text) {
      for (CommunicationMediumEnum b : CommunicationMediumEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("communicationMedium")
  private CommunicationMediumEnum communicationMedium = null;

  @JsonProperty("communicationHint")
  private String communicationHint = null;

  @JsonProperty("communicationExpiry")
  private String communicationExpiry = null;

  public Meta communicationMedium(CommunicationMediumEnum communicationMedium) {
    this.communicationMedium = communicationMedium;
    return this;
  }

  /**
   * Get communicationMedium
   * @return communicationMedium
   **/
  @Schema(required = true, description = "")
      @NotNull

    public CommunicationMediumEnum getCommunicationMedium() {
    return communicationMedium;
  }

  public void setCommunicationMedium(CommunicationMediumEnum communicationMedium) {
    this.communicationMedium = communicationMedium;
  }

  public Meta communicationHint(String communicationHint) {
    this.communicationHint = communicationHint;
    return this;
  }

  /**
   * Get communicationHint
   * @return communicationHint
   **/
  @Schema(description = "")
  
    public String getCommunicationHint() {
    return communicationHint;
  }

  public void setCommunicationHint(String communicationHint) {
    this.communicationHint = communicationHint;
  }

  public Meta communicationExpiry(String communicationExpiry) {
    this.communicationExpiry = communicationExpiry;
    return this;
  }

  /**
   * Get communicationExpiry
   * @return communicationExpiry
   **/
  @Schema(example = "2019-12-30T12:01:55Z", description = "")
  
    public String getCommunicationExpiry() {
    return communicationExpiry;
  }

  public void setCommunicationExpiry(String communicationExpiry) {
    this.communicationExpiry = communicationExpiry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.communicationMedium, meta.communicationMedium) &&
        Objects.equals(this.communicationHint, meta.communicationHint) &&
        Objects.equals(this.communicationExpiry, meta.communicationExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationMedium, communicationHint, communicationExpiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    communicationMedium: ").append(toIndentedString(communicationMedium)).append("\n");
    sb.append("    communicationHint: ").append(toIndentedString(communicationHint)).append("\n");
    sb.append("    communicationExpiry: ").append(toIndentedString(communicationExpiry)).append("\n");
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
