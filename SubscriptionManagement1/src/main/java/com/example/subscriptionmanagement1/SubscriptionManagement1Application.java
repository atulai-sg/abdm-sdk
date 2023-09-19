package com.example.subscriptionmanagement1;

import Controller.SubscriptionManagementHIUFacadeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = SubscriptionManagementHIUFacadeController.class)
@ComponentScan(basePackages = "Controller")
public class SubscriptionManagement1Application {

    public static void main(String[] args) {
        SpringApplication.run(SubscriptionManagement1Application.class, args);
    }

}
