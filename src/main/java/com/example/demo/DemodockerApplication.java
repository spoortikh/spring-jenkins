package com.example.demo;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemodockerApplication {
	org.slf4j.Logger logger=LoggerFactory.getLogger(DemodockerApplication.class);

	public void init()
	{
		logger.info("application started");
	}
	public static void main(String[] args) {
		//logger.info("application started second");
		SpringApplication.run(DemodockerApplication.class, args);
	}

}
