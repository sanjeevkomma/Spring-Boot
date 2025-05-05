package com.demo.controller;

import com.demo.service.*;
import com.demo.util.DataTransformationService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    private final ApiService apiService;
    private final DataTransformationService transformationService;
    private final FeignClientService feignClientService;
    private final WebClientService webClientService;
    private final HttpExchangeService httpExchangeService;
    private final RestClientService restClientService;

    public ApiController(ApiService apiService,
                         DataTransformationService transformationService,
                         FeignClientService feignClientService,
                         WebClientService webClientService,
                         HttpExchangeService httpExchangeService,
                         RestClientService restClientService) {
        this.apiService = apiService;
        this.transformationService = transformationService;
        this.feignClientService = feignClientService;
        this.webClientService = webClientService;
        this.httpExchangeService = httpExchangeService;
        this.restClientService = restClientService;
    }

    @GetMapping("/api/data")
    public @ResponseBody List<String> getTransformedData() {
        JsonNode jsonNode = apiService.fetchData();
        return transformationService.extractTitles(jsonNode);
    }

    @GetMapping("/api/feignclient/data")
    public @ResponseBody String getFeignClientData() {
        return feignClientService.fetchData();
    }

    @GetMapping("/api/webclient/data")
    public @ResponseBody String fetchByParam(@RequestParam(name = "currency") String currency) {
        return webClientService.fetchData(currency);
    }

    @GetMapping("/api/webclient/data/{currency}")
    public @ResponseBody String fetchByName(@PathVariable("currency") String currency) {
        return webClientService.fetchData(currency);
    }

    @GetMapping("/api/httpexchange/data/{currency}")
    public @ResponseBody String fetchByName2(@PathVariable("currency") String currency) {
        return httpExchangeService.fetchData(currency);
    }

    @GetMapping("/api/restclient/data")
    public @ResponseBody String getCryptoMarkets(@RequestParam(defaultValue = "usd") String currency) {
        return restClientService.getCryptoMarkets(currency);
    }
}