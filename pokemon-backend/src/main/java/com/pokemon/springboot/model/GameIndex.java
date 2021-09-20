package com.pokemon.springboot.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

@EqualsAndHashCode
@ToString
public class GameIndex {
	@Setter
    @Getter
	private int game_index;
	
	@Setter
    @Getter
	private PokemonResult version;
}