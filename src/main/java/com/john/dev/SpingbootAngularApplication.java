package com.john.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class SpingbootAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootAngularApplication.class, args);
	}
}
