package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * KeyMaterial
 */
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class KeyMaterial   {
  @JsonProperty("cryptoAlg")
  private String cryptoAlg = null;

  @JsonProperty("curve")
  private String curve = null;

  @JsonProperty("dhPublicKey")
  private KeyObject dhPublicKey = null;

  @JsonProperty("nonce")
  private String nonce = null;

  public KeyMaterial cryptoAlg(String cryptoAlg) {
    this.cryptoAlg = cryptoAlg;
    return this;
  }

  /**
   * Get cryptoAlg
   * @return cryptoAlg
   **/
//  @Schema(example = "ECDH", required = true, description = "")
//      @NotNull

    public String getCryptoAlg() {
    return cryptoAlg;
  }

  public void setCryptoAlg(String cryptoAlg) {
    this.cryptoAlg = cryptoAlg;
  }

  public KeyMaterial curve(String curve) {
    this.curve = curve;
    return this;
  }

  /**
   * Get curve
   * @return curve
   **/
//  @Schema(example = "Curve25519", required = true, description = "")
//      @NotNull

    public String getCurve() {
    return curve;
  }

  public void setCurve(String curve) {
    this.curve = curve;
  }

  public KeyMaterial dhPublicKey(KeyObject dhPublicKey) {
    this.dhPublicKey = dhPublicKey;
    return this;
  }

  /**
   * Get dhPublicKey
   * @return dhPublicKey
   **/
//  @Schema(required = true, description = "")
//      @NotNull
//
//    @Valid
    public KeyObject getDhPublicKey() {
    return dhPublicKey;
  }

  public void setDhPublicKey(KeyObject dhPublicKey) {
    this.dhPublicKey = dhPublicKey;
  }

  public KeyMaterial nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * Get nonce
   * @return nonce
   **/
//  @Schema(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", required = true, description = "")
//      @NotNull

    public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyMaterial keyMaterial = (KeyMaterial) o;
    return Objects.equals(this.cryptoAlg, keyMaterial.cryptoAlg) &&
        Objects.equals(this.curve, keyMaterial.curve) &&
        Objects.equals(this.dhPublicKey, keyMaterial.dhPublicKey) &&
        Objects.equals(this.nonce, keyMaterial.nonce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptoAlg, curve, dhPublicKey, nonce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyMaterial {\n");
    
    sb.append("    cryptoAlg: ").append(toIndentedString(cryptoAlg)).append("\n");
    sb.append("    curve: ").append(toIndentedString(curve)).append("\n");
    sb.append("    dhPublicKey: ").append(toIndentedString(dhPublicKey)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
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
