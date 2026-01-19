package com.demo.service;

import com.demo.model.Order;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!test")
public class OrderPublisher {

    private final PubSubTemplate pubSubTemplate;

    public OrderPublisher(PubSubTemplate pubSubTemplate) {
        this.pubSubTemplate = pubSubTemplate;
    }

    public void publish(Order order) {
        pubSubTemplate.publish("order-topic", order);
    }
}
