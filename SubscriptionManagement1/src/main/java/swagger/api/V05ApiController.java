package swagger.api;

import swagger.model.HIUSubscriptionNotificationAcknowledgment;
import swagger.model.HIUSubscriptionRequestNotificationAcknowledgement;
import swagger.model.HeartbeatResponse;
import swagger.model.SubscriptionRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T15:53:53.899420813Z[GMT]")
@RestController
public class V05ApiController implements V05Api {

    private static final Logger log = LoggerFactory.getLogger(V05ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V05ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> v05CareContextsOnDiscoverPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientDiscoveryResult body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05ConsentRequestsInitPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ConsentRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05ConsentRequestsStatusPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ConsentRequestStatusRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05ConsentsFetchPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ConsentFetchRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05ConsentsHipOnNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HIPConsentNotificationResponse body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05ConsentsHiuOnNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HIUConsentNotificationResponse body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05HealthInformationNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HealthInformationNotification body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05HealthInformationOnRequestPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HIPHealthInformationRequestAcknowledgement body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05HealthInformationRequestPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HIRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<HeartbeatResponse> v05HeartbeatGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HeartbeatResponse>(objectMapper.readValue("{\n  \"error\" : {\n    \"code\" : 0,\n    \"message\" : \"message\"\n  },\n  \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"status\" : \"UP\"\n}", HeartbeatResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HeartbeatResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HeartbeatResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05LinksContextNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HipDataNotificationRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05LinksLinkAddContextsPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientCareContextLinkRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05LinksLinkOnConfirmPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientLinkResult body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05LinksLinkOnInitPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientLinkReferenceResult body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05PatientsFindPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientIdentificationRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05PatientsProfileOnSharePost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ShareProfileResult body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05PatientsStatusOnNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientStatusNotification body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05SubscriptionRequestsCmInitPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SubscriptionRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05SubscriptionRequestsHiuOnNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HIUSubscriptionRequestNotificationAcknowledgement body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05SubscriptionsHiuOnNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody HIUSubscriptionNotificationAcknowledgment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05UsersAuthConfirmPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientAuthConfirmRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05UsersAuthFetchModesPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientAuthModeQueryRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05UsersAuthInitPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientAuthInitRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v05UsersAuthOnNotifyPost(@Parameter(in = ParameterIn.HEADER, description = "Access token which was issued after successful login with gateway auth server." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PatientAuthNotificationAcknowledgement body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
