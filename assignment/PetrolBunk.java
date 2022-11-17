package com.xworkz.assignmentApp.assignment;

public class PetrolBunk {
	String name;
     String location;
	
    public String PetrolBunkName(String name) {
		System.out.println("the Biscuits name" + name);
		this.name = name;
		return this.name;
	}

	public String PetrolBunklocation(String location) {
		System.out.println("PetrolBunk location is" + location);
		this.location = location;
		return this.location;

}
	}
