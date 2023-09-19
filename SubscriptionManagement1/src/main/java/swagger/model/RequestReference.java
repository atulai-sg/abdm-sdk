package swagger.model;
import java.util.Objects;
import java.util.UUID;

public class RequestReference {
    //    @SerializedName("requestId")
    private UUID requestId = null;

    public RequestReference requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * the requestId that was passed
     * @return requestId
     **/
//    @Schema(required = true, description = "the requestId that was passed")
    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestReference requestReference = (RequestReference) o;
        return Objects.equals(this.requestId, requestReference.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestReference {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
