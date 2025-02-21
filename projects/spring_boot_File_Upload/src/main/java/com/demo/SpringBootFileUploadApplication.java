package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootFileUploadApplication implements CommandLineRunner {
	
	@Value("${userName}")
    private String userName;

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootFileUploadApplication.class, args);
		
	}
	
	 @Override
	    public void run(String... args) {
	    	
	        System.out.println("userName is :: " + userName);
	        
	    }
	
	

}
