package com.techelevator.filtermaven;

import java.util.ArrayList;
import java.util.List;

public class FilterAnimals {

	public static void main(String[] args) {

		List<Animal> a = new ArrayList<Animal>();
		
		a.add(new Herbivore("Rabbit", 4));
		a.add(new Herbivore("Giraffe", 4));
		a.add(new Herbivore("Rhino", 4));
		a.add(new Carnivore("Spider", 8));
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
			if (a.get(i).toString().contentEquals("Herbivore")) {
				herbivores.add((Herbivore) a.get(i));
			} else if (a.get(i).toString().contentEquals("Carnivore")) {
				carnivores.add((Carnivore) a.get(i));
			} else if (a.get(i).toString().contentEquals("Omnivore")) {
				omnivores.add((Omnivore) a.get(i));
			} else {
				System.out.println(a.get(i).getName() + " has an ERROR being filtered and toString reads: " + a.get(i).toString());
			}
			
			System.out.println("The animal " + a.get(i).getName() + " is a(n) " + a.get(i).toString() + ".");
		}
		
		

	} 

}
