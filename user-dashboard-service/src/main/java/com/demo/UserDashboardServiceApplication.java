package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.User;
import com.demo.repository.UserRepository;

@SpringBootApplication
public class UserDashboardServiceApplication implements CommandLineRunner {

	
	 @Autowired
	    private UserRepository repository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(UserDashboardServiceApplication.class, args);
	}
	@Override
    public void run(String... args) {

       // log.info("StartApplication...");

        repository.save(new User(1,"fdfj",44,"fdfdf"));

      /*  System.out.println("\nfindAll()");
        repository.findAll().forEach(x -> System.out.println(x));

        System.out.println("\nfindById(1L)");
        repository.findById(1l).ifPresent(x -> System.out.println(x));

        System.out.println("\nfindByName('Node')");
        repository.findByName("Node").forEach(x -> System.out.println(x));*/

    }
	
}
