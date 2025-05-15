package com.demo.controller;

import com.demo.service.S3Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AwsController {

    private final S3Service s3Service;

    public AwsController(S3Service s3Service) {
        this.s3Service = s3Service;
    }

    @GetMapping("/s3/files")
    public List<String> listS3Files() {
        return s3Service.listFiles();
    }
}
