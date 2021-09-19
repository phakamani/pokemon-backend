package com.pokemon.springboot.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode
@ToString
public class PokemonResult {
	@Setter
    @Getter
	private String url;
	
	@Setter
    @Getter
	private String name;
}