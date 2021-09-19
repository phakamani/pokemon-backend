package com.pokemon.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.pokemon.springboot.controller", "com.pokemon.springboot.service"})
public class PokemonBackendApplication {

	@Bean
	public WebClient.Builder getWebClientBuilder() {
	    return WebClient.builder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonBackendApplication.class, args);
		
	}

}
