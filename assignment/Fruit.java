package com.xworkz.assignmentApp.assignment;

public class Fruit {

	public String name;
	public int price;

	public String fruitname(String name) {
		System.out.println("the Fruit name" + name);
		this.name = name;
		return this.name;
	}

	public int fruitprice(int price) {
		System.out.println("Fruit price is" + price);
		this.price = price;
		return price;

	}

}
