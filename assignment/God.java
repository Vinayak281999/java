package com.xworkz.assignmentApp.assignment;

public class God {
	String name;
	   String Gender;
		
	    public String godName(String name) {
			System.out.println("the God name" + name);
			this.name = name;
			return this.name;
		}

		public String godGender(String Gender) {
			System.out.println("God Gender is" + Gender);
			this.Gender = Gender;
			return this.Gender;
		}

}
