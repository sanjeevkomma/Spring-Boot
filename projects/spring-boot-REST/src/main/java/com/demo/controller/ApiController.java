package com.demo.controller;

import com.demo.service.FeignClientService;
import com.demo.service.HttpExchangeService;
import com.demo.service.RestClientService;
import com.demo.service.RestTemplateService;
import com.demo.service.WebClientService;
import com.demo.util.converter.DataTransformationService;

import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    private final RestTemplateService restTemplateService;
    private final DataTransformationService transformationService;
    private final FeignClientService feignClientService;
    private final WebClientService webClientService;
    private final HttpExchangeService httpExchangeService;
    private final RestClientService restClientService;

    public ApiController(RestTemplateService restTemplateService,
                         DataTransformationService transformationService,
                         FeignClientService feignClientService,
                         WebClientService webClientService,
                         HttpExchangeService httpExchangeService,
                         RestClientService restClientService) {
        this.restTemplateService = restTemplateService;
        this.transformationService = transformationService;
        this.feignClientService = feignClientService;
        this.webClientService = webClientService;
        this.httpExchangeService = httpExchangeService;
        this.restClientService = restClientService;
    }

    @GetMapping("/api/data")
    public @ResponseBody List<String> getTransformedData() {
        JsonNode jsonNode = restTemplateService.fetchData();
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