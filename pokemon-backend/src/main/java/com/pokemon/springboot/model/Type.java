package com.pokemon.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class Type {
	@Setter
    @Getter
    private PokemonResult type;
}