package com.zou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class SpirngBootZouApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpirngBootZouApplication.class, args);
	}
}
