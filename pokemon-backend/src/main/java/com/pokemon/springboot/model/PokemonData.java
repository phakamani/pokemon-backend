package com.pokemon.springboot.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class PokemonData {
	@Setter
    @Getter
	private double weight;
	
	@Setter
    @Getter
	private List<Type> types;
	
	@Setter
    @Getter
	private double height;
	
	
	@Setter
    @Getter
	private List<GameIndex> game_indices;
	
	@Setter
    @Getter
    private Sprite sprites;
}