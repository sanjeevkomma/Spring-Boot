package com.demo;

import com.demo.service.RagService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringBootAiRagApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAiRagApplication.class, args);
	}

	// Test it (CommandLineRunner)
	@Profile("!test")
	@Bean
	CommandLineRunner runner(RagService ragService) {
		return args -> {
			String response = ragService.ask("How to improve API latency?");
			System.out.println("AI Response:\n" + response);
		};
	}

}
