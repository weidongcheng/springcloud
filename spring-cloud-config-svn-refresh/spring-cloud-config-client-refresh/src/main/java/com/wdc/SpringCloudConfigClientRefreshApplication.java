package com.wdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigClientRefreshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientRefreshApplication.class, args);
	}

}
