package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionRequestSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")


public class SubscriptionRequestSubscription   {
  @JsonProperty("purpose")
  private UsePurpose purpose = null;

  @JsonProperty("patient")
  private ConsentManagerPatientID patient = null;

  @JsonProperty("hiu")
  private OrganizationRepresentation hiu = null;

  @JsonProperty("hips")
  @Valid
  private List<OrganizationRepresentation> hips = null;

  @JsonProperty("categories")
  @Valid
  private List<SubscriptionCategory> categories = new ArrayList<SubscriptionCategory>();

  @JsonProperty("period")
  private SubscriptionPeriod period = null;

  public SubscriptionRequestSubscription purpose(UsePurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UsePurpose getPurpose() {
    return purpose;
  }

  public void setPurpose(UsePurpose purpose) {
    this.purpose = purpose;
  }

  public SubscriptionRequestSubscription patient(ConsentManagerPatientID patient) {
    this.patient = patient;
    return this;
  }

  /**
   * Get patient
   * @return patient
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ConsentManagerPatientID getPatient() {
    return patient;
  }

  public void setPatient(ConsentManagerPatientID patient) {
    this.patient = patient;
  }

  public SubscriptionRequestSubscription hiu(OrganizationRepresentation hiu) {
    this.hiu = hiu;
    return this;
  }

  /**
   * Get hiu
   * @return hiu
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OrganizationRepresentation getHiu() {
    return hiu;
  }

  public void setHiu(OrganizationRepresentation hiu) {
    this.hiu = hiu;
  }

  public SubscriptionRequestSubscription hips(List<OrganizationRepresentation> hips) {
    this.hips = hips;
    return this;
  }

  public SubscriptionRequestSubscription addHipsItem(OrganizationRepresentation hipsItem) {
    if (this.hips == null) {
      this.hips = new ArrayList<OrganizationRepresentation>();
    }
    this.hips.add(hipsItem);
    return this;
  }

  /**
   * Get hips
   * @return hips
   **/
  @Schema(description = "")
      @Valid
    public List<OrganizationRepresentation> getHips() {
    return hips;
  }

  public void setHips(List<OrganizationRepresentation> hips) {
    this.hips = hips;
  }

  public SubscriptionRequestSubscription categories(List<SubscriptionCategory> categories) {
    this.categories = categories;
    return this;
  }

  public SubscriptionRequestSubscription addCategoriesItem(SubscriptionCategory categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<SubscriptionCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<SubscriptionCategory> categories) {
    this.categories = categories;
  }

  public SubscriptionRequestSubscription period(SubscriptionPeriod period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SubscriptionPeriod getPeriod() {
    return period;
  }

  public void setPeriod(SubscriptionPeriod period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequestSubscription subscriptionRequestSubscription = (SubscriptionRequestSubscription) o;
    return Objects.equals(this.purpose, subscriptionRequestSubscription.purpose) &&
        Objects.equals(this.patient, subscriptionRequestSubscription.patient) &&
        Objects.equals(this.hiu, subscriptionRequestSubscription.hiu) &&
        Objects.equals(this.hips, subscriptionRequestSubscription.hips) &&
        Objects.equals(this.categories, subscriptionRequestSubscription.categories) &&
        Objects.equals(this.period, subscriptionRequestSubscription.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purpose, patient, hiu, hips, categories, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequestSubscription {\n");
    
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    hiu: ").append(toIndentedString(hiu)).append("\n");
    sb.append("    hips: ").append(toIndentedString(hips)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
