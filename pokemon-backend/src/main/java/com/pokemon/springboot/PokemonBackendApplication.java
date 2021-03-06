package com.pokemon.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.function.client.WebClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {
    DataSourceAutoConfiguration.class, 
    DataSourceTransactionManagerAutoConfiguration.class, 
    HibernateJpaAutoConfiguration.class
})
@ComponentScan({"com.pokemon.springboot.controller", "com.pokemon.springboot.service"})
@EnableSwagger2
public class PokemonBackendApplication {

	@Bean
	public WebClient.Builder getWebClientBuilder() {
	    return WebClient.builder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonBackendApplication.class, args);
		
	}

}
