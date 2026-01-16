package com.demo.repository;

import com.demo.model.User;
import com.google.cloud.spring.data.spanner.repository.SpannerRepository;

public interface UserRepository extends SpannerRepository<User, String> {

}