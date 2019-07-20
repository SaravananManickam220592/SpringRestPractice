package com.example.SpringRestExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.context.annotation.Bean;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
// @EnableScheduling
//@EnableSwagger2
//@EnableAdminServer
public class SpringRestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestExampleApplication.class, args);
	}
//
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.example.SpringRestExample.controller")).build();
//	}
	
	
}
