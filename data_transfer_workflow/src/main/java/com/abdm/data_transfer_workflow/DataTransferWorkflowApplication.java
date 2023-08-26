package com.abdm.data_transfer_workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class DataTransferWorkflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataTransferWorkflowApplication.class, args);
		System.out.println("hello");
	}
	@Bean

	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
