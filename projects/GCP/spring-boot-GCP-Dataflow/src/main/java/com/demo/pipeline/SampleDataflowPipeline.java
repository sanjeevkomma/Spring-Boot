package com.demo.pipeline;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.transforms.SimpleFunction;

public class SampleDataflowPipeline {

    public static void runPipeline() {
        PipelineOptions options = PipelineOptionsFactory.create();
        options.setJobName("spring-boot-GCP-Dataflow");
        options.setTempLocation("gs://<YOUR_BUCKET>/temp"); // replace with your GCS bucket

        Pipeline pipeline = Pipeline.create(options);

        pipeline
                .apply("ReadLines", TextIO.read().from("gs://<YOUR_BUCKET>/input/input.txt"))
                .apply("ToUpper", MapElements.via(new SimpleFunction<String, String>() {
                    @Override
                    public String apply(String input) {
                        return input.toUpperCase();
                    }
                }))
                .apply("WriteLines", TextIO.write().to("gs://<YOUR_BUCKET>/output/output"));

        pipeline.run().waitUntilFinish();
    }
}