package com.demo.service;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class GcsService {

    private final Storage storage;

    @Value("${gcp.bucket-name}")
    private String bucketName;

    public GcsService(Storage storage) {
        this.storage = storage;
    }

    public List<String> listFiles() {
        Bucket bucket = storage.get(bucketName);
        if (bucket == null) return List.of();

        return StreamSupport.stream(bucket.list().iterateAll().spliterator(), false)
                .map(Blob::getName)
                .collect(Collectors.toList());
    }
}