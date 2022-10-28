package com.spring.boot.inmuebles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories( basePackages = {"com.spring.boot.inmuebles.repository"})
@SpringBootApplication()
public class ComSpringBootInmueblesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComSpringBootInmueblesApplication.class, args);
	}

}
