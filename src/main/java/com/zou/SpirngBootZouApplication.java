package com.zou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableCaching//开启缓存配置
@EnableScheduling//开启定时任务配置
@EnableAsync//开启异步
public class SpirngBootZouApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpirngBootZouApplication.class, args);
	}
}
