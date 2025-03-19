package com.demo.batch;

import jakarta.batch.api.chunk.ItemProcessor;
import jakarta.batch.runtime.BatchRuntime;

public class MyBatchProcessor implements ItemProcessor {
    @Override
    public Object processItem(Object item) {
        return ((String) item).toUpperCase();
    }
}
