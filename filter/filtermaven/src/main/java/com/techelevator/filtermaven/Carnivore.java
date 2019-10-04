package com.techelevator.filtermaven;

public class Carnivore extends Animal {

	private String type = "Carnivore";
	
	public Carnivore(String name, int legs) {
		super(name, legs);
	}
	
	public String getType() {
		return type;
	}
}
