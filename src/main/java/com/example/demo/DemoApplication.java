package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.support.WebStack;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
@EnableHypermediaSupport(type = {EnableHypermediaSupport.HypermediaType.HAL},stacks = WebStack.WEBFLUX)

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
