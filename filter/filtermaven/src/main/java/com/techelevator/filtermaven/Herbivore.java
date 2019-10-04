package com.techelevator.filtermaven;

public class Herbivore extends Animal {

	private String type = "Herbivore";

	public Herbivore(String animal, int legs) {
		super(animal, legs);
	}
	
	public String getType() {
		return type;
	}

}
