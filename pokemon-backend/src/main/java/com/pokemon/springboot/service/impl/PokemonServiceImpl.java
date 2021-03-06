package com.pokemon.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pokemon.springboot.model.Pokemon;
import com.pokemon.springboot.model.PokemonData;
import com.pokemon.springboot.model.PokemonResponse;
import com.pokemon.springboot.model.PokemonResult;
import com.pokemon.springboot.service.PokemonService;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Override
    public List<PokemonResult> getPokemonList() {
		PokemonResponse pokemonResponse;
    	
		pokemonResponse =  webClientBuilder.build()
	        .get()
	        .uri("https://pokeapi.co/api/v2/pokemon?limit=100")
	        .retrieve()
	        .bodyToMono(PokemonResponse.class)
	        .block();
		
		List<PokemonResult> pokemonResults = pokemonResponse.getResults();
		List<PokemonResult> newPokemonResults = new ArrayList<PokemonResult>();
		
		for(int i = 0; i < pokemonResults.size(); i++) {
			PokemonResult pokemonResult = new PokemonResult();
			pokemonResult.setName(pokemonResults.get(i).getName());
			String id = pokemonResults.get(i).getUrl().replace("https://pokeapi.co/api/v2/pokemon/","").replace("/", "");
			pokemonResult.setUrl("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + id +".png");
			newPokemonResults.add(pokemonResult);
		}
		
		return newPokemonResults;
    }

	@Override
	public Pokemon getPokemon(String name) {
		PokemonData pokemonData;
    	
		pokemonData =  webClientBuilder.build()
                .get()
                .uri("https://pokeapi.co/api/v2/pokemon/" + name)
                .retrieve()
                .bodyToMono(PokemonData.class)
                .block();
		
		
		Pokemon pokemon = new Pokemon(
				pokemonData.getSprites().getFront_default(), 
				name, 
				pokemonData.getTypes().get(0).getType().getName(), 
				pokemonData.getHeight(),
				pokemonData.getWeight(), 
				pokemonData.getGame_indices().get(0).getGame_index());
		
		return pokemon;
	}

}