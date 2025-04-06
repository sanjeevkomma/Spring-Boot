package com.demo.config;

import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GcpStorageConfig {

    @Bean
    public Storage googleCloudStorage() {
        return StorageOptions.getDefaultInstance().getService();
    }
}