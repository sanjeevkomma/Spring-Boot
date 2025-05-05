package com.demo.telemetry.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/telemetry")
public class TelemetryController {

    @Autowired
    private TelemetryService telemetryService;

    @PostMapping
    public String ingestData(@RequestBody TelemetryData data) {
        telemetryService.saveData(data);
        return "Data received";
    }
}
