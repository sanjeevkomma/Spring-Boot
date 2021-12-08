package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Calendar;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@EnableScheduling
@SpringBootApplication
public class SpringBootSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulerApplication.class, args);
	}
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
        public void run() {
    	System.out.println("Current time is :: " + Calendar.getInstance().getTime());
    }

}
