package com.xworkz.assignmentApp.assignment;

public class SmartCity {
	String name;
	String prisentPlace;
	int km;
	
	public String smartCityname(String name) {
		System.out.println("SmartCity name is"+name);
		this.name=name;
		return this.name;
		}
	public String smartCityprisentPlace(String name) {
		System.out.println("SmartCity prisentPlace is"+prisentPlace);
		this.prisentPlace=prisentPlace;
		return this.prisentPlace;
		}
	public int smartCitykm(int km) {
		System.out.println("SmartCity km is"+km);
		this.km=km;
		return this.km;
		
	}
}
