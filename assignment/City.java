package com.xworkz.assignmentApp.assignment;

public class City {
	String name;
	   String location;
		
	    public String cityName(String name) {
			System.out.println("the City name" + name);
			this.name = name;
			return this.name;
		}

		public String citylocation(String location) {
			System.out.println("City location is" + location);
			this.location = location;
			return this.location;
}
		}
