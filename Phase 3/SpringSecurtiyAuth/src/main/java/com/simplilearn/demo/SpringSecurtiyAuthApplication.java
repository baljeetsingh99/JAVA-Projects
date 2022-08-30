package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringSecurtiyAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurtiyAuthApplication.class, args);
	}

}