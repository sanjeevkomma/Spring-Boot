package com.demo.service;

import com.google.cloud.spring.pubsub.core.subscriber.PubSubSubscriberTemplate;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!test")
public class OrderSubscriber {

    private final PubSubSubscriberTemplate subscriberTemplate;

    public OrderSubscriber(PubSubSubscriberTemplate subscriberTemplate) {
        this.subscriberTemplate = subscriberTemplate;
    }

    @PostConstruct
    public void subscribe() {

        subscriberTemplate.subscribe("order-sub", message -> {

            String payload = message.getPubsubMessage()
                    .getData()
                    .toStringUtf8();

            System.out.println("Received message: " + payload);

            message.ack();
        });
    }
}