package swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Subjected to CM specific capability  1. MOBILE_OTP - for SMS OTP  2. DIRECT - for authentication directly with the patient. e.g. Mobile App, SMS  3. AADHAAR_OTP - for auth using OTP sent to Aadhaar number  4. DEMOGRAPHICS - for auth using demographic verification. 
 */
public enum AuthenticationMode {
  MOBILE_OTP("MOBILE_OTP"),
    DIRECT("DIRECT"),
    DEMOGRAPHICS("DEMOGRAPHICS"),
    AADHAAR_OTP("AADHAAR_OTP");

  private String value;

  AuthenticationMode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuthenticationMode fromValue(String text) {
    for (AuthenticationMode b : AuthenticationMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
