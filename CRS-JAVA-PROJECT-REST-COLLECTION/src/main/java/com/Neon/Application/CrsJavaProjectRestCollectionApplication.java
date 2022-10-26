package com.Neon.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.Neon.*")
@EnableWebMvc
@Configuration
@SpringBootApplication 
public class CrsJavaProjectRestCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsJavaProjectRestCollectionApplication.class, args);
	}

}
