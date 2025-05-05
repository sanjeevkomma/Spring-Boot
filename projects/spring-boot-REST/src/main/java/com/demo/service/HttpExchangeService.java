package com.demo.service;

import com.demo.util.client.HttpExchangeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HttpExchangeService {

    @Autowired
    private HttpExchangeClient httpExchangeClient;

    public String fetchData(String currency) {
        return httpExchangeClient.fetchData(currency);
    }
}