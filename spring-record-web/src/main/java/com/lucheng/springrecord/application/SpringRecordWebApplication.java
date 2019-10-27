package com.lucheng.springrecord.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource(locations = "classpath:spring/spring-config.xml")
@MapperScan(basePackages = "com.lucheng.springrecord.mapper")
@EnableTransactionManagement
public class SpringRecordWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRecordWebApplication.class, args);
	}
}
