package com.negana.restperson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestPersonApplication.class, args);
	}

}
