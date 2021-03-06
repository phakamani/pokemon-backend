package com.pokemon.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.springboot.model.PokemonResult;
import com.pokemon.springboot.model.Pokemon;
import com.pokemon.springboot.service.PokemonService;

@CrossOrigin(origins = {"http://localhost:4200", "https://mkulise.co.za"}, maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PokemonController {
	
	private PokemonService pokemonService;
	
	public PokemonController(PokemonService pokemonService) {
		super();
		this.pokemonService = pokemonService;
	}
	
	@GetMapping("/")
	public List<PokemonResult> getPokemonList(){
		return pokemonService.getPokemonList();
	}
	
	@GetMapping("/{name}")
	public Pokemon getPokemon(@PathVariable("name") String name){
		return pokemonService.getPokemon(name);
	}
}
