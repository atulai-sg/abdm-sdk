# Getting Started
ABDM (Ayushman Bharat Digital Mission) is a pioneering initiative undertaken by the Government of India to establish a robust digital health infrastructure that supports an integrated healthcare ecosystem. This mission aims to bridge gaps among various healthcare sector stakeholders by establishing digital highways, enabling seamless connectivity and efficient information exchange.

# Subscription Management workflow
![](https://github.com/suyashdube/c4gt-milestones/blob/main/assets/Screenshot%202023-08-10%20at%203.19.47%20AM.png)
HIU is the entity that will request the medical records of a patient. 
HIP is the provider or the record keeper of the patient's health records. 
So, a hospital could be both HIU and HIP.
PHIU: Person Health Information User. This is generally a user application.

Objectives:
- Describe subscription flow in ABDM digital health architecture.
- Design ABDM wrapper components that implements the asynchronous design defined in the subscription flow to abstract out the complexities of the design.

Code structure:
1. Controller

 - The Controller section has SubscriptionManagementHIUFacadeController, where all the APIs are implemented.

2. Model 

- In this Section, all the initial structure for the request body of a particular API is implemented. All the necessary classes are implemented that are being used by the APIs in the controller. 

3. Testing

- The test directory has some dummy tests that can be used for setting some assertions to test different components working correctly or not using Mockito.
4. Postman testing 

 - For Authorization, use the Bearer access token created using session API.

 - In the SubscriptionManagementHIUFacadeController class, paste the access token and then run the project.

 - For X-CM-ID, use "sbx".



HIU Facade Interface acts as a front-facing interface responsible for masking underlying complexities. It handles the asynchronous API calls to/from ABDM. 
The request store is where we persist requests request statuses TEMPORARILY. These values should be purged once the HIU has been informed or the request has been processed.
We expose the following APIs via the HIU Facade Interface for the subscription flow:-
- v1/subscription-requests/init: Initialize subscription flow by POSTing subscription request
- v1/subscription-requests/hiu/on-notify: Callback API for /subscription-requests/hiu/notify to acknowledge receipt of notification. HIU calls this API as an acknowledgment of subscription request relevant notifications after the patient approves the request from the ABHA Sbx app.
- v1/devservice/v1/bridges: Used to register the HIU service and callback url



### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#web)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

