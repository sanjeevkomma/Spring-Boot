package com.demo;

import com.demo.service.OrderPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(
		properties = {
				"spring.cloud.gcp.pubsub.enabled=false"
		}
)
@ActiveProfiles("test")
class SpringBootGcpPubSubApplicationTests {

	@MockBean
	private OrderPublisher orderPublisher;

	@Test
	void contextLoads() {
	}
}

