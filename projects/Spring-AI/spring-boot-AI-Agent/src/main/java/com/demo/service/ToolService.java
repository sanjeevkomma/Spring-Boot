package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ToolService {

    public String getWeather(String city) {
        return "Weather in " + city + " is 32°C";
    }
}