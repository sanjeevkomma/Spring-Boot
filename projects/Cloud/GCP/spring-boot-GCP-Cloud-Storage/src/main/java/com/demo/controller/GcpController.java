package com.demo.controller;

import com.demo.service.GcsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GcpController {

    private final GcsService gcsService;

    public GcpController(GcsService gcsService) {
        this.gcsService = gcsService;
    }

    @GetMapping("/gcs/files")
    public List<String> listGcsFiles() {
        return gcsService.listFiles();
    }
}

