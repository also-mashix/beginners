package com.techelevator.filtermaven;

import java.util.ArrayList;
import java.util.List;

public class FilterAnimals {

	public static void main(String[] args) {

		List<Animal> a = new ArrayList<Animal>();
		
		a.add(new Herbivore("Rabbit", 4));
		a.add(new Herbivore("Giraffe", 4));
		a.add(new Herbivore("Rhino", 4));
		a.add(new Herbivore("Spider", 8));
		a.add(new Herbivore("Horse", 4));
		a.add(new Carnivore("Puma", 4));
		a.add(new Carnivore("Shark", 0));
		a.add(new Carnivore("Wolf", 4));
		a.add(new Carnivore("Cat", 4));
		a.add(new Omnivore("Human", 2));
		a.add(new Omnivore("Ant", 6));
		a.add(new Omnivore("Bear", 4));
		
		List<Herbivore> herbivores = new ArrayList<Herbivore>();
		List<Carnivore> carnivores = new ArrayList<Carnivore>();
		List<Omnivore> omnivores = new ArrayList<Omnivore>();
		
		
		for (int i = 0; i < a.size(); i++) {
			String aType = a.get(i).getType;
		}
		

	} 

}
