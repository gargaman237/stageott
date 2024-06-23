package com.stage.ott;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OttApplication {
	private static final Logger logger = LoggerFactory.getLogger(OttApplication.class.getName());

	public static void main(String[] args) {
		try {
			SpringApplication.run(OttApplication.class, args);
		} catch (Exception e) {
			logger.error("Exception while running the application: ", e);
		}
	}

}
