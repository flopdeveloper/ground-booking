package com.boatload.cric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketServletInitializer {

	private static Class<CricketServletInitializer> applicationClass = CricketServletInitializer.class;
	
	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}
}
