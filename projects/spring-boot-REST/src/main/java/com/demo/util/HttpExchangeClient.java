package com.demo.util;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "https://api.coingecko.com/api/v3/coins/markets")
public interface HttpExchangeClient {

    @GetExchange
    String fetchData(@RequestParam("vs_currency") String currency);

}