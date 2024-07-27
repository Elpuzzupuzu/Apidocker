package com.MimitosShop.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Value("${spring.datasource.username}")
	private String datasourceUsername;

	@Value("${spring.datasource.password}")
	private String datasourcePassword;

	public void run(String... args) throws Exception {
		System.out.println("Datasource URL: " + datasourceUrl);
		System.out.println("Datasource Username: " + datasourceUsername);
		System.out.println("Datasource Password: " + datasourcePassword);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
