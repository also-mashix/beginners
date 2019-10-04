package com.techelevator.filtermaven;

public class Omnivore extends Animal {

	private String type = "Omnivore";

	public Omnivore(String name, int legs) {
		super(name, legs);
	}

	public String getType() {
		return type;
	}
}
