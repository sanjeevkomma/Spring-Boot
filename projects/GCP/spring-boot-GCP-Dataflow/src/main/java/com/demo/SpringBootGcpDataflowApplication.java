package com.demo;

import com.demo.pipeline.SampleDataflowPipeline;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGcpDataflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGcpDataflowApplication.class, args);

        // Run the sample Dataflow pipeline
		SampleDataflowPipeline.runPipeline();
	}

}