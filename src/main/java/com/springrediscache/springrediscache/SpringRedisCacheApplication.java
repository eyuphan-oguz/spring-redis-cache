package com.springrediscache.springrediscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringRedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisCacheApplication.class, args);
	}
	

}
