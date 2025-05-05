package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriBuilder;

@Service
public class RestClientService {
    private final RestClient restClient;

    public RestClientService(RestClient.Builder builder) {
        this.restClient = builder.baseUrl("https://api.coingecko.com/api/v3").build();
    }

    public String getCryptoMarkets(String currency) {

        return restClient.get()
                .uri((UriBuilder uriBuilder) -> uriBuilder.path("/coins/markets")
                        .queryParam("vs_currency", currency)
                        .build())
                .retrieve()
                .body(String.class);
    }
}
