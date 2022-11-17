package com.xworkz.assignmentApp.assignment;

public class Biscuits {
	String name;
    int price;
	
    public String BiscuitsName(String name) {
		System.out.println("the Biscuits name" + name);
		this.name = name;
		return this.name;
	}

	public int Biscuitsprice(int price) {
		System.out.println("Biscuits price is" + price);
		this.price = price;
		return this.price;

	}
}
