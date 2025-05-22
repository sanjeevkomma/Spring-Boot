package com.demo.repository;

import com.demo.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, String> {

}
