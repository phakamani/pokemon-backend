package com.pokemon.springboot.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode
@ToString
public class Pokemon {
	@Setter
    @Getter
	private String imageUrl;
	
	@Setter
    @Getter
	private String name;
	
	@Setter
    @Getter
	private String type;
	
	@Setter
    @Getter
	private double height;
	
	@Setter
    @Getter
	private String weight;
	
	@Setter
    @Getter
	private String numberOfBattles;
}