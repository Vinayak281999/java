package com.xworkz.assignmentApp.assignment;

public class Continent {
	String name;
    int population;
	
    public String ContinentName(String name) {
		System.out.println("the Continent name" + name);
		this.name = name;
		return this.name;
	}

	public int ContinentPopulation(int population) {
		System.out.println("Continent population is" + population);
		this.population = population;
		return this.population;

	}

}
