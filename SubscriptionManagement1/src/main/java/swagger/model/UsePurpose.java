package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * UsePurpose
 */
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class UsePurpose   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("refUri")
  private String refUri = null;

  public UsePurpose text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   **/
//  @Schema(required = true, description = "")
//      @NotNull

    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public UsePurpose code(String code) {
    this.code = code;
    return this;
  }

  /**
   * From the fixed set, documented at refUri
   * @return code
   **/
//  @Schema(required = true, description = "From the fixed set, documented at refUri")
//      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public UsePurpose refUri(String refUri) {
    this.refUri = refUri;
    return this;
  }

  /**
   * Get refUri
   * @return refUri
   **/
  //@Schema(description = "")
  
    public String getRefUri() {
    return refUri;
  }

  public void setRefUri(String refUri) {
    this.refUri = refUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsePurpose usePurpose = (UsePurpose) o;
    return Objects.equals(this.text, usePurpose.text) &&
        Objects.equals(this.code, usePurpose.code) &&
        Objects.equals(this.refUri, usePurpose.refUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, code, refUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsePurpose {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    refUri: ").append(toIndentedString(refUri)).append("\n");
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
