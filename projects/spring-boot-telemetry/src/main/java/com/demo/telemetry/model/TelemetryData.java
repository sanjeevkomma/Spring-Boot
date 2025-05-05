package com.demo.telemetry.model;

import lombok.Data;
import java.time.Instant;

@Data
public class TelemetryData {
    private String deviceId;
    private Double temperature;
    private Instant timestamp = Instant.now();
}
