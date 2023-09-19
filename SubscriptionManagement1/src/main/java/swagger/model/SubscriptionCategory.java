package swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;


import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SubscriptionCategory
 */
public enum SubscriptionCategory {
  LINK("LINK"),
    DATA("DATA");

  private String value;

  SubscriptionCategory(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SubscriptionCategory fromValue(String text) {
    for (SubscriptionCategory b : SubscriptionCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
