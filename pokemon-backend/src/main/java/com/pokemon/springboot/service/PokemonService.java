package com.pokemon.springboot.service;

import java.util.List;

import com.pokemon.springboot.model.PokemonResult;
import com.pokemon.springboot.model.Pokemon;

public interface PokemonService {
	List<PokemonResult> getPokemonList();
	
	Pokemon getPokemon(String name);
}
