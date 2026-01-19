package com.demo;

import com.demo.config.AwsDynamoProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AwsDynamoProperties.class)
public class SpringBootAwsDynamoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsDynamoDbApplication.class, args);
	}

}
