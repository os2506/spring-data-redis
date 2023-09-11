package com.dproduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class SpringBootRedisDemoApplication {
	
    private static final Logger log = LoggerFactory.getLogger(SpringBootRedisDemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisDemoApplication.class, args);
		 for (int i = 0; i < 2; i++) {
	            log.info("This is just a msg: {}", i);
	        }
	}

}
