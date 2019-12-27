package com.springwebflux.bootcamp.service.saving.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringwebfluxBootcampServiceSavingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxBootcampServiceSavingApplication.class, args);
	}

}
