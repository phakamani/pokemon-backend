package com.pokemon.springboot.model;

import lombok.Data;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
public class Pokemon {
	private String url;
	
	private String name;
	
	private String type;
	
	private double height;
	
	private double weight;
	
	private int numberOfBattles;
}