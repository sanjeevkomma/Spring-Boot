package com.demo.concurrent;

import jakarta.enterprise.concurrent.ManagedExecutorService;
import jakarta.inject.Inject;

public class ConcurrencyExample {
    @Inject
    ManagedExecutorService executorService;

    public void executeTask() {
        executorService.submit(() -> System.out.println("Executing in Jakarta Concurrency!"));
    }
}
