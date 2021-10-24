package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.config.ServerProperties;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ServerProperties serverProperties;

    @Override
    public void run(String... args) {
        System.out.println(serverProperties);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
