package com.pokemon.springboot.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode
@ToString
public class PokemonResponse {
	@Setter
    @Getter
	private int count;
	
	@Setter
    @Getter
	private String next;
	
	@Setter
    @Getter
	private List<PokemonResult> results;
	
}