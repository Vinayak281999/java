package com.xworkz.assignmentApp.assignment;

public class Vegetable {
	String name;
	   int perKg;
		
	    public String  vegetableName(String name) {
			System.out.println("Vegetable name" + name);
			this.name = name;
			return name;
		}

		public int  vegetablePerKg(int perKg) {
			System.out.println("Vegetable perKg is" + perKg);
			this.perKg = perKg;
			return perKg;
		}

}
