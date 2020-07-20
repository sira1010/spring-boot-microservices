package com.sira.app.productrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRatingApplication.class, args);
	}

}
