package com.demo;

import com.demo.repository.ProductRepository;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest(
		properties = {
				"spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration",
				"spring.data.elasticsearch.repositories.enabled=false"
		}
)
class SpringBootElasticsearchPocApplicationTests {

	@TestConfiguration
	static class MockConfig {
		@Bean
		ProductRepository productRepository() {
			return Mockito.mock(ProductRepository.class);
		}
	}

	@Test
	void contextLoads() {
	}
}




