package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @PostMapping("/run")
    public String runJob(@RequestParam String jobName) {

        // POC logic
        System.out.println("Triggered job: " + jobName);

        // Later:
        // - Trigger Dataflow
        // - Write to BigQuery
        // - Publish to Pub/Sub

        return "Job started: " + jobName;
    }
}