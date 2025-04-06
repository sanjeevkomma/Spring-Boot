package com.demo.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("users")
public class User {
    @PrimaryKey
    private String id;
    private String name;
    private String email;

    // Getters & Setters
}
