package com.fixed.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FixedUtilitySecurityService {

	public static void main(String[] args) {
		SpringApplication.run(FixedUtilitySecurityService.class, args);
	}
}
