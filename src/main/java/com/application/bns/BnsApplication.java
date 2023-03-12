package com.application.bns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BnsApplication.class, args);
	}

}
