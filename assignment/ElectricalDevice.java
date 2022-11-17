package com.xworkz.assignmentApp.assignment;

public class ElectricalDevice {
	public String name;
	public int price;

	public String ElectricalDevicename(String name) {
		System.out.println("the ElectricalDevice name" + name);
		this.name = name;
		return this.name;
	}

	public int ElectricalDeviceprice(int price) {
		System.out.println("ElectricalDevice price is" + price);
		this.price = price;
		return this.price;

	}

}
