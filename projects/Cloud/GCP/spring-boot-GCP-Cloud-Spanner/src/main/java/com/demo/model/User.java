package com.demo.model;

import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import lombok.Data;

import java.time.Instant;

@Data
@Table(name = "users")
public class User {

    @PrimaryKey
    private String userId;

    private String name;
    private String email;
    private Instant createdAt;
}
